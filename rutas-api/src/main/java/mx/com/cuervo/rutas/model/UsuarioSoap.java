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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link mx.com.cuervo.rutas.service.http.UsuarioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class UsuarioSoap implements Serializable {

	public static UsuarioSoap toSoapModel(Usuario model) {
		UsuarioSoap soapModel = new UsuarioSoap();

		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setEmpleadoId(model.getEmpleadoId());
		soapModel.setTelefono(model.getTelefono());
		soapModel.setRutaId(model.getRutaId());
		soapModel.setParadaId(model.getParadaId());
		soapModel.setFecha(model.getFecha());

		return soapModel;
	}

	public static UsuarioSoap[] toSoapModels(Usuario[] models) {
		UsuarioSoap[] soapModels = new UsuarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsuarioSoap[][] toSoapModels(Usuario[][] models) {
		UsuarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsuarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsuarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsuarioSoap[] toSoapModels(List<Usuario> models) {
		List<UsuarioSoap> soapModels = new ArrayList<UsuarioSoap>(
			models.size());

		for (Usuario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsuarioSoap[soapModels.size()]);
	}

	public UsuarioSoap() {
	}

	public long getPrimaryKey() {
		return _usuarioId;
	}

	public void setPrimaryKey(long pk) {
		setUsuarioId(pk);
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getEmpleadoId() {
		return _empleadoId;
	}

	public void setEmpleadoId(long empleadoId) {
		_empleadoId = empleadoId;
	}

	public String getTelefono() {
		return _telefono;
	}

	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	public long getRutaId() {
		return _rutaId;
	}

	public void setRutaId(long rutaId) {
		_rutaId = rutaId;
	}

	public long getParadaId() {
		return _paradaId;
	}

	public void setParadaId(long paradaId) {
		_paradaId = paradaId;
	}

	public Date getFecha() {
		return _fecha;
	}

	public void setFecha(Date fecha) {
		_fecha = fecha;
	}

	private long _usuarioId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _empleadoId;
	private String _telefono;
	private long _rutaId;
	private long _paradaId;
	private Date _fecha;

}