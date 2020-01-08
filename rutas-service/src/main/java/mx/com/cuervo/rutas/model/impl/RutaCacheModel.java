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

import mx.com.cuervo.rutas.model.Ruta;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Ruta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class RutaCacheModel implements CacheModel<Ruta>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RutaCacheModel)) {
			return false;
		}

		RutaCacheModel rutaCacheModel = (RutaCacheModel)obj;

		if (rutaId == rutaCacheModel.rutaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, rutaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", rutaId=");
		sb.append(rutaId);
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
		sb.append(", nombreRuta=");
		sb.append(nombreRuta);
		sb.append(", capacidad=");
		sb.append(capacidad);
		sb.append(", disponibilidad=");
		sb.append(disponibilidad);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Ruta toEntityModel() {
		RutaImpl rutaImpl = new RutaImpl();

		if (uuid == null) {
			rutaImpl.setUuid("");
		}
		else {
			rutaImpl.setUuid(uuid);
		}

		rutaImpl.setRutaId(rutaId);
		rutaImpl.setGroupId(groupId);
		rutaImpl.setCompanyId(companyId);
		rutaImpl.setUserId(userId);

		if (userName == null) {
			rutaImpl.setUserName("");
		}
		else {
			rutaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			rutaImpl.setCreateDate(null);
		}
		else {
			rutaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			rutaImpl.setModifiedDate(null);
		}
		else {
			rutaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombreRuta == null) {
			rutaImpl.setNombreRuta("");
		}
		else {
			rutaImpl.setNombreRuta(nombreRuta);
		}

		rutaImpl.setCapacidad(capacidad);
		rutaImpl.setDisponibilidad(disponibilidad);

		rutaImpl.resetOriginalValues();

		return rutaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		rutaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombreRuta = objectInput.readUTF();

		capacidad = objectInput.readLong();

		disponibilidad = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(rutaId);

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

		if (nombreRuta == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreRuta);
		}

		objectOutput.writeLong(capacidad);

		objectOutput.writeLong(disponibilidad);
	}

	public String uuid;
	public long rutaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombreRuta;
	public long capacidad;
	public long disponibilidad;

}