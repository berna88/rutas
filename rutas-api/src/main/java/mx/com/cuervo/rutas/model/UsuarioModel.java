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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Usuario service. Represents a row in the &quot;C_Usuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>mx.com.cuervo.rutas.model.impl.UsuarioModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>mx.com.cuervo.rutas.model.impl.UsuarioImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
@ProviderType
public interface UsuarioModel
	extends BaseModel<Usuario>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a usuario model instance should use the {@link Usuario} interface instead.
	 */

	/**
	 * Returns the primary key of this usuario.
	 *
	 * @return the primary key of this usuario
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this usuario.
	 *
	 * @param primaryKey the primary key of this usuario
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the usuario ID of this usuario.
	 *
	 * @return the usuario ID of this usuario
	 */
	public long getUsuarioId();

	/**
	 * Sets the usuario ID of this usuario.
	 *
	 * @param usuarioId the usuario ID of this usuario
	 */
	public void setUsuarioId(long usuarioId);

	/**
	 * Returns the group ID of this usuario.
	 *
	 * @return the group ID of this usuario
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this usuario.
	 *
	 * @param groupId the group ID of this usuario
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this usuario.
	 *
	 * @return the company ID of this usuario
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this usuario.
	 *
	 * @param companyId the company ID of this usuario
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this usuario.
	 *
	 * @return the user ID of this usuario
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this usuario.
	 *
	 * @param userId the user ID of this usuario
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this usuario.
	 *
	 * @return the user uuid of this usuario
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this usuario.
	 *
	 * @param userUuid the user uuid of this usuario
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this usuario.
	 *
	 * @return the user name of this usuario
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this usuario.
	 *
	 * @param userName the user name of this usuario
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this usuario.
	 *
	 * @return the create date of this usuario
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this usuario.
	 *
	 * @param createDate the create date of this usuario
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this usuario.
	 *
	 * @return the modified date of this usuario
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this usuario.
	 *
	 * @param modifiedDate the modified date of this usuario
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the empleado ID of this usuario.
	 *
	 * @return the empleado ID of this usuario
	 */
	public long getEmpleadoId();

	/**
	 * Sets the empleado ID of this usuario.
	 *
	 * @param empleadoId the empleado ID of this usuario
	 */
	public void setEmpleadoId(long empleadoId);

	/**
	 * Returns the telefono of this usuario.
	 *
	 * @return the telefono of this usuario
	 */
	@AutoEscape
	public String getTelefono();

	/**
	 * Sets the telefono of this usuario.
	 *
	 * @param telefono the telefono of this usuario
	 */
	public void setTelefono(String telefono);

	/**
	 * Returns the ruta ID of this usuario.
	 *
	 * @return the ruta ID of this usuario
	 */
	public long getRutaId();

	/**
	 * Sets the ruta ID of this usuario.
	 *
	 * @param rutaId the ruta ID of this usuario
	 */
	public void setRutaId(long rutaId);

	/**
	 * Returns the parada ID of this usuario.
	 *
	 * @return the parada ID of this usuario
	 */
	public long getParadaId();

	/**
	 * Sets the parada ID of this usuario.
	 *
	 * @param paradaId the parada ID of this usuario
	 */
	public void setParadaId(long paradaId);

	/**
	 * Returns the fecha of this usuario.
	 *
	 * @return the fecha of this usuario
	 */
	public Date getFecha();

	/**
	 * Sets the fecha of this usuario.
	 *
	 * @param fecha the fecha of this usuario
	 */
	public void setFecha(Date fecha);

}