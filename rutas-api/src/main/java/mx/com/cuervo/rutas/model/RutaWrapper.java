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

package mx.com.cuervo.rutas.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Ruta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Ruta
 * @generated
 */
@ProviderType
public class RutaWrapper
	extends BaseModelWrapper<Ruta> implements Ruta, ModelWrapper<Ruta> {

	public RutaWrapper(Ruta ruta) {
		super(ruta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("rutaId", getRutaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombreRuta", getNombreRuta());
		attributes.put("capacidad", getCapacidad());
		attributes.put("disponibilidad", getDisponibilidad());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long rutaId = (Long)attributes.get("rutaId");

		if (rutaId != null) {
			setRutaId(rutaId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombreRuta = (String)attributes.get("nombreRuta");

		if (nombreRuta != null) {
			setNombreRuta(nombreRuta);
		}

		Long capacidad = (Long)attributes.get("capacidad");

		if (capacidad != null) {
			setCapacidad(capacidad);
		}

		Long disponibilidad = (Long)attributes.get("disponibilidad");

		if (disponibilidad != null) {
			setDisponibilidad(disponibilidad);
		}
	}

	/**
	 * Returns the capacidad of this ruta.
	 *
	 * @return the capacidad of this ruta
	 */
	@Override
	public long getCapacidad() {
		return model.getCapacidad();
	}

	/**
	 * Returns the company ID of this ruta.
	 *
	 * @return the company ID of this ruta
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ruta.
	 *
	 * @return the create date of this ruta
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the disponibilidad of this ruta.
	 *
	 * @return the disponibilidad of this ruta
	 */
	@Override
	public long getDisponibilidad() {
		return model.getDisponibilidad();
	}

	/**
	 * Returns the group ID of this ruta.
	 *
	 * @return the group ID of this ruta
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ruta.
	 *
	 * @return the modified date of this ruta
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre ruta of this ruta.
	 *
	 * @return the nombre ruta of this ruta
	 */
	@Override
	public String getNombreRuta() {
		return model.getNombreRuta();
	}

	/**
	 * Returns the primary key of this ruta.
	 *
	 * @return the primary key of this ruta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ruta ID of this ruta.
	 *
	 * @return the ruta ID of this ruta
	 */
	@Override
	public long getRutaId() {
		return model.getRutaId();
	}

	/**
	 * Returns the user ID of this ruta.
	 *
	 * @return the user ID of this ruta
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ruta.
	 *
	 * @return the user name of this ruta
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ruta.
	 *
	 * @return the user uuid of this ruta
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this ruta.
	 *
	 * @return the uuid of this ruta
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the capacidad of this ruta.
	 *
	 * @param capacidad the capacidad of this ruta
	 */
	@Override
	public void setCapacidad(long capacidad) {
		model.setCapacidad(capacidad);
	}

	/**
	 * Sets the company ID of this ruta.
	 *
	 * @param companyId the company ID of this ruta
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ruta.
	 *
	 * @param createDate the create date of this ruta
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the disponibilidad of this ruta.
	 *
	 * @param disponibilidad the disponibilidad of this ruta
	 */
	@Override
	public void setDisponibilidad(long disponibilidad) {
		model.setDisponibilidad(disponibilidad);
	}

	/**
	 * Sets the group ID of this ruta.
	 *
	 * @param groupId the group ID of this ruta
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ruta.
	 *
	 * @param modifiedDate the modified date of this ruta
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre ruta of this ruta.
	 *
	 * @param nombreRuta the nombre ruta of this ruta
	 */
	@Override
	public void setNombreRuta(String nombreRuta) {
		model.setNombreRuta(nombreRuta);
	}

	/**
	 * Sets the primary key of this ruta.
	 *
	 * @param primaryKey the primary key of this ruta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ruta ID of this ruta.
	 *
	 * @param rutaId the ruta ID of this ruta
	 */
	@Override
	public void setRutaId(long rutaId) {
		model.setRutaId(rutaId);
	}

	/**
	 * Sets the user ID of this ruta.
	 *
	 * @param userId the user ID of this ruta
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ruta.
	 *
	 * @param userName the user name of this ruta
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ruta.
	 *
	 * @param userUuid the user uuid of this ruta
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this ruta.
	 *
	 * @param uuid the uuid of this ruta
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected RutaWrapper wrap(Ruta ruta) {
		return new RutaWrapper(ruta);
	}

}