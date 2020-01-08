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
 * This class is a wrapper for {@link Usuario}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
@ProviderType
public class UsuarioWrapper
	extends BaseModelWrapper<Usuario>
	implements Usuario, ModelWrapper<Usuario> {

	public UsuarioWrapper(Usuario usuario) {
		super(usuario);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("usuarioId", getUsuarioId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("empleadoId", getEmpleadoId());
		attributes.put("telefono", getTelefono());
		attributes.put("rutaId", getRutaId());
		attributes.put("paradaId", getParadaId());
		attributes.put("fecha", getFecha());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
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

		Long empleadoId = (Long)attributes.get("empleadoId");

		if (empleadoId != null) {
			setEmpleadoId(empleadoId);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		Long rutaId = (Long)attributes.get("rutaId");

		if (rutaId != null) {
			setRutaId(rutaId);
		}

		Long paradaId = (Long)attributes.get("paradaId");

		if (paradaId != null) {
			setParadaId(paradaId);
		}

		Date fecha = (Date)attributes.get("fecha");

		if (fecha != null) {
			setFecha(fecha);
		}
	}

	/**
	 * Returns the company ID of this usuario.
	 *
	 * @return the company ID of this usuario
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this usuario.
	 *
	 * @return the create date of this usuario
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the empleado ID of this usuario.
	 *
	 * @return the empleado ID of this usuario
	 */
	@Override
	public long getEmpleadoId() {
		return model.getEmpleadoId();
	}

	/**
	 * Returns the fecha of this usuario.
	 *
	 * @return the fecha of this usuario
	 */
	@Override
	public Date getFecha() {
		return model.getFecha();
	}

	/**
	 * Returns the group ID of this usuario.
	 *
	 * @return the group ID of this usuario
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this usuario.
	 *
	 * @return the modified date of this usuario
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parada ID of this usuario.
	 *
	 * @return the parada ID of this usuario
	 */
	@Override
	public long getParadaId() {
		return model.getParadaId();
	}

	/**
	 * Returns the primary key of this usuario.
	 *
	 * @return the primary key of this usuario
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ruta ID of this usuario.
	 *
	 * @return the ruta ID of this usuario
	 */
	@Override
	public long getRutaId() {
		return model.getRutaId();
	}

	/**
	 * Returns the telefono of this usuario.
	 *
	 * @return the telefono of this usuario
	 */
	@Override
	public String getTelefono() {
		return model.getTelefono();
	}

	/**
	 * Returns the user ID of this usuario.
	 *
	 * @return the user ID of this usuario
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this usuario.
	 *
	 * @return the user name of this usuario
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this usuario.
	 *
	 * @return the user uuid of this usuario
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the usuario ID of this usuario.
	 *
	 * @return the usuario ID of this usuario
	 */
	@Override
	public long getUsuarioId() {
		return model.getUsuarioId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this usuario.
	 *
	 * @param companyId the company ID of this usuario
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this usuario.
	 *
	 * @param createDate the create date of this usuario
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the empleado ID of this usuario.
	 *
	 * @param empleadoId the empleado ID of this usuario
	 */
	@Override
	public void setEmpleadoId(long empleadoId) {
		model.setEmpleadoId(empleadoId);
	}

	/**
	 * Sets the fecha of this usuario.
	 *
	 * @param fecha the fecha of this usuario
	 */
	@Override
	public void setFecha(Date fecha) {
		model.setFecha(fecha);
	}

	/**
	 * Sets the group ID of this usuario.
	 *
	 * @param groupId the group ID of this usuario
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this usuario.
	 *
	 * @param modifiedDate the modified date of this usuario
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parada ID of this usuario.
	 *
	 * @param paradaId the parada ID of this usuario
	 */
	@Override
	public void setParadaId(long paradaId) {
		model.setParadaId(paradaId);
	}

	/**
	 * Sets the primary key of this usuario.
	 *
	 * @param primaryKey the primary key of this usuario
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ruta ID of this usuario.
	 *
	 * @param rutaId the ruta ID of this usuario
	 */
	@Override
	public void setRutaId(long rutaId) {
		model.setRutaId(rutaId);
	}

	/**
	 * Sets the telefono of this usuario.
	 *
	 * @param telefono the telefono of this usuario
	 */
	@Override
	public void setTelefono(String telefono) {
		model.setTelefono(telefono);
	}

	/**
	 * Sets the user ID of this usuario.
	 *
	 * @param userId the user ID of this usuario
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this usuario.
	 *
	 * @param userName the user name of this usuario
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this usuario.
	 *
	 * @param userUuid the user uuid of this usuario
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the usuario ID of this usuario.
	 *
	 * @param usuarioId the usuario ID of this usuario
	 */
	@Override
	public void setUsuarioId(long usuarioId) {
		model.setUsuarioId(usuarioId);
	}

	@Override
	protected UsuarioWrapper wrap(Usuario usuario) {
		return new UsuarioWrapper(usuario);
	}

}