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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Parada}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Parada
 * @generated
 */
@ProviderType
public class ParadaWrapper
	extends BaseModelWrapper<Parada> implements Parada, ModelWrapper<Parada> {

	public ParadaWrapper(Parada parada) {
		super(parada);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("paradaId", getParadaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombreParada", getNombreParada());
		attributes.put("descripcion", getDescripcion());
		attributes.put("horario", getHorario());
		attributes.put("rutaId", getRutaId());
		attributes.put("nombreCarpeta", getNombreCarpeta());
		attributes.put("nombreArchivo", getNombreArchivo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long paradaId = (Long)attributes.get("paradaId");

		if (paradaId != null) {
			setParadaId(paradaId);
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

		String nombreParada = (String)attributes.get("nombreParada");

		if (nombreParada != null) {
			setNombreParada(nombreParada);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String horario = (String)attributes.get("horario");

		if (horario != null) {
			setHorario(horario);
		}

		Long rutaId = (Long)attributes.get("rutaId");

		if (rutaId != null) {
			setRutaId(rutaId);
		}

		String nombreCarpeta = (String)attributes.get("nombreCarpeta");

		if (nombreCarpeta != null) {
			setNombreCarpeta(nombreCarpeta);
		}

		String nombreArchivo = (String)attributes.get("nombreArchivo");

		if (nombreArchivo != null) {
			setNombreArchivo(nombreArchivo);
		}
	}

	/**
	 * Returns the company ID of this parada.
	 *
	 * @return the company ID of this parada
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this parada.
	 *
	 * @return the create date of this parada
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descripcion of this parada.
	 *
	 * @return the descripcion of this parada
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the group ID of this parada.
	 *
	 * @return the group ID of this parada
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the horario of this parada.
	 *
	 * @return the horario of this parada
	 */
	@Override
	public String getHorario() {
		return model.getHorario();
	}

	/**
	 * Returns the modified date of this parada.
	 *
	 * @return the modified date of this parada
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre archivo of this parada.
	 *
	 * @return the nombre archivo of this parada
	 */
	@Override
	public String getNombreArchivo() {
		return model.getNombreArchivo();
	}

	/**
	 * Returns the nombre carpeta of this parada.
	 *
	 * @return the nombre carpeta of this parada
	 */
	@Override
	public String getNombreCarpeta() {
		return model.getNombreCarpeta();
	}

	/**
	 * Returns the nombre parada of this parada.
	 *
	 * @return the nombre parada of this parada
	 */
	@Override
	public String getNombreParada() {
		return model.getNombreParada();
	}

	/**
	 * Returns the parada ID of this parada.
	 *
	 * @return the parada ID of this parada
	 */
	@Override
	public long getParadaId() {
		return model.getParadaId();
	}

	/**
	 * Returns the primary key of this parada.
	 *
	 * @return the primary key of this parada
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ruta ID of this parada.
	 *
	 * @return the ruta ID of this parada
	 */
	@Override
	public long getRutaId() {
		return model.getRutaId();
	}

	/**
	 * Returns the user ID of this parada.
	 *
	 * @return the user ID of this parada
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this parada.
	 *
	 * @return the user name of this parada
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this parada.
	 *
	 * @return the user uuid of this parada
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this parada.
	 *
	 * @param companyId the company ID of this parada
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this parada.
	 *
	 * @param createDate the create date of this parada
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this parada.
	 *
	 * @param descripcion the descripcion of this parada
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the group ID of this parada.
	 *
	 * @param groupId the group ID of this parada
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the horario of this parada.
	 *
	 * @param horario the horario of this parada
	 */
	@Override
	public void setHorario(String horario) {
		model.setHorario(horario);
	}

	/**
	 * Sets the modified date of this parada.
	 *
	 * @param modifiedDate the modified date of this parada
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre archivo of this parada.
	 *
	 * @param nombreArchivo the nombre archivo of this parada
	 */
	@Override
	public void setNombreArchivo(String nombreArchivo) {
		model.setNombreArchivo(nombreArchivo);
	}

	/**
	 * Sets the nombre carpeta of this parada.
	 *
	 * @param nombreCarpeta the nombre carpeta of this parada
	 */
	@Override
	public void setNombreCarpeta(String nombreCarpeta) {
		model.setNombreCarpeta(nombreCarpeta);
	}

	/**
	 * Sets the nombre parada of this parada.
	 *
	 * @param nombreParada the nombre parada of this parada
	 */
	@Override
	public void setNombreParada(String nombreParada) {
		model.setNombreParada(nombreParada);
	}

	/**
	 * Sets the parada ID of this parada.
	 *
	 * @param paradaId the parada ID of this parada
	 */
	@Override
	public void setParadaId(long paradaId) {
		model.setParadaId(paradaId);
	}

	/**
	 * Sets the primary key of this parada.
	 *
	 * @param primaryKey the primary key of this parada
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ruta ID of this parada.
	 *
	 * @param rutaId the ruta ID of this parada
	 */
	@Override
	public void setRutaId(long rutaId) {
		model.setRutaId(rutaId);
	}

	/**
	 * Sets the user ID of this parada.
	 *
	 * @param userId the user ID of this parada
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this parada.
	 *
	 * @param userName the user name of this parada
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this parada.
	 *
	 * @param userUuid the user uuid of this parada
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected ParadaWrapper wrap(Parada parada) {
		return new ParadaWrapper(parada);
	}

}