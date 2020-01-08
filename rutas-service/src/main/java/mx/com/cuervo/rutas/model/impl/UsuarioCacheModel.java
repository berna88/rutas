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

import mx.com.cuervo.rutas.model.Usuario;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Usuario in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class UsuarioCacheModel implements CacheModel<Usuario>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioCacheModel)) {
			return false;
		}

		UsuarioCacheModel usuarioCacheModel = (UsuarioCacheModel)obj;

		if (usuarioId == usuarioCacheModel.usuarioId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, usuarioId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{usuarioId=");
		sb.append(usuarioId);
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
		sb.append(", empleadoId=");
		sb.append(empleadoId);
		sb.append(", telefono=");
		sb.append(telefono);
		sb.append(", rutaId=");
		sb.append(rutaId);
		sb.append(", paradaId=");
		sb.append(paradaId);
		sb.append(", fecha=");
		sb.append(fecha);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Usuario toEntityModel() {
		UsuarioImpl usuarioImpl = new UsuarioImpl();

		usuarioImpl.setUsuarioId(usuarioId);
		usuarioImpl.setGroupId(groupId);
		usuarioImpl.setCompanyId(companyId);
		usuarioImpl.setUserId(userId);

		if (userName == null) {
			usuarioImpl.setUserName("");
		}
		else {
			usuarioImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			usuarioImpl.setCreateDate(null);
		}
		else {
			usuarioImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			usuarioImpl.setModifiedDate(null);
		}
		else {
			usuarioImpl.setModifiedDate(new Date(modifiedDate));
		}

		usuarioImpl.setEmpleadoId(empleadoId);

		if (telefono == null) {
			usuarioImpl.setTelefono("");
		}
		else {
			usuarioImpl.setTelefono(telefono);
		}

		usuarioImpl.setRutaId(rutaId);
		usuarioImpl.setParadaId(paradaId);

		if (fecha == Long.MIN_VALUE) {
			usuarioImpl.setFecha(null);
		}
		else {
			usuarioImpl.setFecha(new Date(fecha));
		}

		usuarioImpl.resetOriginalValues();

		return usuarioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		usuarioId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		empleadoId = objectInput.readLong();
		telefono = objectInput.readUTF();

		rutaId = objectInput.readLong();

		paradaId = objectInput.readLong();
		fecha = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(usuarioId);

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

		objectOutput.writeLong(empleadoId);

		if (telefono == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telefono);
		}

		objectOutput.writeLong(rutaId);

		objectOutput.writeLong(paradaId);
		objectOutput.writeLong(fecha);
	}

	public long usuarioId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long empleadoId;
	public String telefono;
	public long rutaId;
	public long paradaId;
	public long fecha;

}