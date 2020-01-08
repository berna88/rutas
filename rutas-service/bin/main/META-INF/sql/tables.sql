create table C_Parada (
	paradaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombreParada VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	horario VARCHAR(75) null,
	rutaId LONG,
	nombreCarpeta VARCHAR(75) null,
	nombreArchivo VARCHAR(75) null
);

create table C_Ruta (
	uuid_ VARCHAR(75) null,
	rutaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombreRuta VARCHAR(75) null,
	capacidad LONG,
	disponibilidad LONG
);

create table C_Usuario (
	usuarioId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	empleadoId LONG,
	telefono VARCHAR(75) null,
	rutaId LONG,
	paradaId LONG,
	fecha DATE null
);