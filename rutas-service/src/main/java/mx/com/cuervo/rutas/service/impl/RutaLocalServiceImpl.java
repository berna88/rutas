/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package mx.com.cuervo.rutas.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import mx.com.cuervo.rutas.model.Parada;
import mx.com.cuervo.rutas.model.Ruta;
import mx.com.cuervo.rutas.service.base.RutaLocalServiceBaseImpl;

/**
 * The implementation of the ruta local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>mx.com.cuervo.rutas.service.RutaLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RutaLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=mx.com.cuervo.rutas.model.Ruta",
	service = AopService.class
)
public class RutaLocalServiceImpl extends RutaLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>mx.com.cuervo.rutas.service.RutaLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>mx.com.cuervo.rutas.service.RutaLocalServiceUtil</code>.
	 */
	
	public Ruta addRuta(
		    long userId, String nombreRuta, long capacidad, long disponibilidad, ServiceContext serviceContext)
		    throws PortalException {

		    long groupId = serviceContext.getScopeGroupId();

		    User user = userLocalService.getUserById(userId);

		    Date now = new Date();

		    long rutakId = counterLocalService.increment();

		    Ruta ruta = rutaPersistence.create(rutakId);

		    ruta.setUuid(serviceContext.getUuid());
		    ruta.setUserId(userId);
		    ruta.setGroupId(groupId);
		    ruta.setCompanyId(user.getCompanyId());
		    ruta.setUserName(user.getFullName());
		    ruta.setCreateDate(serviceContext.getCreateDate(now));
		    ruta.setModifiedDate(serviceContext.getModifiedDate(now));
		    ruta.setNombreRuta(nombreRuta);
		    ruta.setCapacidad(capacidad);
		    ruta.setDisponibilidad(disponibilidad);
		    ruta.setExpandoBridgeAttributes(serviceContext);

		    rutaPersistence.update(ruta);

		    return ruta;

		}
	
	public Ruta updateRuta(long userId, long rutaId,
			String nombreRuta, long capacidad, long disponibilidad, ServiceContext serviceContext) throws PortalException,
		                SystemException {

		        Date now = new Date();

		        Ruta ruta = getRuta(rutaId);

		        User user = userLocalService.getUser(userId);

		        ruta.setUserId(userId);
		        ruta.setUserName(user.getFullName());
		        ruta.setModifiedDate(serviceContext.getModifiedDate(now));
		        ruta.setNombreRuta(nombreRuta);
			    ruta.setCapacidad(capacidad);
			    ruta.setDisponibilidad(disponibilidad);
			     ruta.setExpandoBridgeAttributes(serviceContext);

		        rutaPersistence.update(ruta);

		        return ruta;
		}

	public Ruta deleteRuta(long rutaId,
            ServiceContext serviceContext) throws PortalException,
            SystemException {

    Ruta ruta = getRuta(rutaId);

    List<Parada> paradas = paradaPersistence.findByG_R
    		( serviceContext.getScopeGroupId(), rutaId);
    
    for (Parada parada : paradas) {
    	paradaPersistence.remove(parada.getParadaId());
    }

    ruta = deleteRuta(ruta);

    return ruta;
}
	
	public List<Ruta> getRutas(long groupId) {

	    return rutaPersistence.findByGroupId(groupId);
	}

	public List<Ruta> getRutas(long groupId, int start, int end, 
	    OrderByComparator<Ruta> obc) {

	    return rutaPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Ruta> getRutas(long groupId, int start, int end) {

	    return rutaPersistence.findByGroupId(groupId, start, end);
	}

	public int getRutasCount(long groupId) {

	    return rutaPersistence.countByGroupId(groupId);
	}
	
	
}