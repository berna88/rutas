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
public class ParadaSoap implements Serializable {

	public static ParadaSoap toSoapModel(Parada model) {
		ParadaSoap soapModel = new ParadaSoap();

		soapModel.setParadaId(model.getParadaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombreParada(model.getNombreParada());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setHorario(model.getHorario());
		soapModel.setRutaId(model.getRutaId());
		soapModel.setNombreCarpeta(model.getNombreCarpeta());
		soapModel.setNombreArchivo(model.getNombreArchivo());

		return soapModel;
	}

	public static ParadaSoap[] toSoapModels(Parada[] models) {
		ParadaSoap[] soapModels = new ParadaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ParadaSoap[][] toSoapModels(Parada[][] models) {
		ParadaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ParadaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ParadaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ParadaSoap[] toSoapModels(List<Parada> models) {
		List<ParadaSoap> soapModels = new ArrayList<ParadaSoap>(models.size());

		for (Parada model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ParadaSoap[soapModels.size()]);
	}

	public ParadaSoap() {
	}

	public long getPrimaryKey() {
		return _paradaId;
	}

	public void setPrimaryKey(long pk) {
		setParadaId(pk);
	}

	public long getParadaId() {
		return _paradaId;
	}

	public void setParadaId(long paradaId) {
		_paradaId = paradaId;
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

	public String getNombreParada() {
		return _nombreParada;
	}

	public void setNombreParada(String nombreParada) {
		_nombreParada = nombreParada;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getHorario() {
		return _horario;
	}

	public void setHorario(String horario) {
		_horario = horario;
	}

	public long getRutaId() {
		return _rutaId;
	}

	public void setRutaId(long rutaId) {
		_rutaId = rutaId;
	}

	public String getNombreCarpeta() {
		return _nombreCarpeta;
	}

	public void setNombreCarpeta(String nombreCarpeta) {
		_nombreCarpeta = nombreCarpeta;
	}

	public String getNombreArchivo() {
		return _nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		_nombreArchivo = nombreArchivo;
	}

	private long _paradaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombreParada;
	private String _descripcion;
	private String _horario;
	private long _rutaId;
	private String _nombreCarpeta;
	private String _nombreArchivo;

}