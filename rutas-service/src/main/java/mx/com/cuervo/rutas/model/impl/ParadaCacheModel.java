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

package mx.com.cuervo.rutas.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import mx.com.cuervo.rutas.model.Parada;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Parada in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ParadaCacheModel implements CacheModel<Parada>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ParadaCacheModel)) {
			return false;
		}

		ParadaCacheModel paradaCacheModel = (ParadaCacheModel)obj;

		if (paradaId == paradaCacheModel.paradaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, paradaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{paradaId=");
		sb.append(paradaId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nombreParada=");
		sb.append(nombreParada);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", horario=");
		sb.append(horario);
		sb.append(", rutaId=");
		sb.append(rutaId);
		sb.append(", nombreCarpeta=");
		sb.append(nombreCarpeta);
		sb.append(", nombreArchivo=");
		sb.append(nombreArchivo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Parada toEntityModel() {
		ParadaImpl paradaImpl = new ParadaImpl();

		paradaImpl.setParadaId(paradaId);
		paradaImpl.setGroupId(groupId);
		paradaImpl.setCompanyId(companyId);
		paradaImpl.setUserId(userId);

		if (userName == null) {
			paradaImpl.setUserName("");
		}
		else {
			paradaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			paradaImpl.setCreateDate(null);
		}
		else {
			paradaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			paradaImpl.setModifiedDate(null);
		}
		else {
			paradaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombreParada == null) {
			paradaImpl.setNombreParada("");
		}
		else {
			paradaImpl.setNombreParada(nombreParada);
		}

		if (descripcion == null) {
			paradaImpl.setDescripcion("");
		}
		else {
			paradaImpl.setDescripcion(descripcion);
		}

		if (horario == null) {
			paradaImpl.setHorario("");
		}
		else {
			paradaImpl.setHorario(horario);
		}

		paradaImpl.setRutaId(rutaId);

		if (nombreCarpeta == null) {
			paradaImpl.setNombreCarpeta("");
		}
		else {
			paradaImpl.setNombreCarpeta(nombreCarpeta);
		}

		if (nombreArchivo == null) {
			paradaImpl.setNombreArchivo("");
		}
		else {
			paradaImpl.setNombreArchivo(nombreArchivo);
		}

		paradaImpl.resetOriginalValues();

		return paradaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		paradaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombreParada = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		horario = objectInput.readUTF();

		rutaId = objectInput.readLong();
		nombreCarpeta = objectInput.readUTF();
		nombreArchivo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(paradaId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nombreParada == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreParada);
		}

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (horario == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(horario);
		}

		objectOutput.writeLong(rutaId);

		if (nombreCarpeta == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreCarpeta);
		}

		if (nombreArchivo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreArchivo);
		}
	}

	public long paradaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombreParada;
	public String descripcion;
	public String horario;
	public long rutaId;
	public String nombreCarpeta;
	public String nombreArchivo;

}