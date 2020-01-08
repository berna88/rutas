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
import mx.com.cuervo.rutas.service.base.ParadaLocalServiceBaseImpl;

/**
 * The implementation of the parada local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>mx.com.cuervo.rutas.service.ParadaLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParadaLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=mx.com.cuervo.rutas.model.Parada",
	service = AopService.class
)
public class ParadaLocalServiceImpl extends ParadaLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>mx.com.cuervo.rutas.service.ParadaLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>mx.com.cuervo.rutas.service.ParadaLocalServiceUtil</code>.
	 */
	
	public Parada addParada(
		    long userId, long rutaId, String nombreParada, String descripcion,
		    String horario, String nombreCarpeta, String nombreArchivo, ServiceContext serviceContext)
		    throws PortalException {

		    long groupId = serviceContext.getScopeGroupId();

		    User user = userLocalService.getUserById(userId);

		    Date now = new Date();

		    long paradaId = counterLocalService.increment();

		    Parada parada = paradaPersistence.create(paradaId);

		    parada.setUserId(userId);
		    parada.setGroupId(groupId);
		    parada.setCompanyId(user.getCompanyId());
		    parada.setUserName(user.getFullName());
		    parada.setCreateDate(serviceContext.getCreateDate(now));
		    parada.setModifiedDate(serviceContext.getModifiedDate(now));
		    parada.setExpandoBridgeAttributes(serviceContext);
		    parada.setRutaId(rutaId);
		    parada.setNombreParada(nombreParada);
		    parada.setDescripcion(descripcion);
		    parada.setHorario(horario);
		    parada.setNombreCarpeta(nombreCarpeta);
		    parada.setNombreArchivo(nombreArchivo);

		    paradaPersistence.update(parada);

		    return parada;
		}

	public Parada updateParada (
		    long userId, long paradaId, String nombreParada, String descripcion,
		    String horario, String nombreCarpeta, String nombreArchivo, ServiceContext serviceContext)
		    throws PortalException, SystemException {

		    Date now = new Date();

		    Parada parada = getParada(paradaId);

		    User user = userLocalService.getUserById(userId);

		    parada.setUserId(userId);
		    parada.setUserName(user.getFullName());
		    parada.setModifiedDate(serviceContext.getModifiedDate(now));
		    parada.setNombreParada(nombreParada);
		    parada.setDescripcion(descripcion);
		    parada.setHorario(horario);
		    parada.setNombreCarpeta(nombreCarpeta);
		    parada.setNombreArchivo(nombreArchivo);
		    parada.setExpandoBridgeAttributes(serviceContext);

		    paradaPersistence.update(parada);

		    return parada;
		}
	
	public Parada deleteParada (long paradaId, ServiceContext serviceContext)
		    throws PortalException {

		    Parada parada = getParada(paradaId);

		    parada = deleteParada(paradaId);

		    return parada;
		}	
	
	public List<Parada> getParadas(long groupId, long rutaId) {
	    return paradaPersistence.findByG_R(groupId, rutaId);
	}

	public List<Parada> getParadas(long groupId, long rutaId, int start, int end)
	    throws SystemException {

	    return paradaPersistence.findByG_R(groupId, rutaId, start, end);
	}

	public List<Parada> getParadas(
	    long groupId, long rutaId, int start, int end, OrderByComparator<Parada> obc) {

	    return paradaPersistence.findByG_R(groupId, rutaId, start, end, obc);
	}

	public int getParadasCount(long groupId, long rutaId) {
	    return paradaPersistence.countByG_R(groupId, rutaId);
	}

	@Override
	public List<Parada> getEntries(long groupId, long rutaId, int start, int end, OrderByComparator<Parada> obc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEntriesCount(long groupId, long rutaId) {
		// TODO Auto-generated method stub
		return 0;
	}
}