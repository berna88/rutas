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
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class RutaSoap implements Serializable {

	public static RutaSoap toSoapModel(Ruta model) {
		RutaSoap soapModel = new RutaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRutaId(model.getRutaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombreRuta(model.getNombreRuta());
		soapModel.setCapacidad(model.getCapacidad());
		soapModel.setDisponibilidad(model.getDisponibilidad());

		return soapModel;
	}

	public static RutaSoap[] toSoapModels(Ruta[] models) {
		RutaSoap[] soapModels = new RutaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RutaSoap[][] toSoapModels(Ruta[][] models) {
		RutaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RutaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RutaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RutaSoap[] toSoapModels(List<Ruta> models) {
		List<RutaSoap> soapModels = new ArrayList<RutaSoap>(models.size());

		for (Ruta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RutaSoap[soapModels.size()]);
	}

	public RutaSoap() {
	}

	public long getPrimaryKey() {
		return _rutaId;
	}

	public void setPrimaryKey(long pk) {
		setRutaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRutaId() {
		return _rutaId;
	}

	public void setRutaId(long rutaId) {
		_rutaId = rutaId;
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

	public String getNombreRuta() {
		return _nombreRuta;
	}

	public void setNombreRuta(String nombreRuta) {
		_nombreRuta = nombreRuta;
	}

	public long getCapacidad() {
		return _capacidad;
	}

	public void setCapacidad(long capacidad) {
		_capacidad = capacidad;
	}

	public long getDisponibilidad() {
		return _disponibilidad;
	}

	public void setDisponibilidad(long disponibilidad) {
		_disponibilidad = disponibilidad;
	}

	private String _uuid;
	private long _rutaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombreRuta;
	private long _capacidad;
	private long _disponibilidad;

}