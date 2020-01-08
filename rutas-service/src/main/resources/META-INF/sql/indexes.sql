create index IX_26AE58EA on C_Parada (groupId, rutaId);

create index IX_41908998 on C_Ruta (groupId);
create index IX_F6ED18C6 on C_Ruta (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5118C8 on C_Ruta (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_DEA4931 on C_Usuario (groupId, rutaId);