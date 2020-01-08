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

package mx.com.cuervo.rutas.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link ParadaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParadaLocalService
 * @generated
 */
@ProviderType
public class ParadaLocalServiceWrapper
	implements ParadaLocalService, ServiceWrapper<ParadaLocalService> {

	public ParadaLocalServiceWrapper(ParadaLocalService paradaLocalService) {
		_paradaLocalService = paradaLocalService;
	}

	@Override
	public mx.com.cuervo.rutas.model.Parada addParada(
			long userId, long rutaId, String nombreParada, String descripcion,
			String horario, String nombreCarpeta, String nombreArchivo,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paradaLocalService.addParada(
			userId, rutaId, nombreParada, descripcion, horario, nombreCarpeta,
			nombreArchivo, serviceContext);
	}

	/**
	 * Adds the parada to the database. Also notifies the appropriate model listeners.
	 *
	 * @param parada the parada
	 * @return the parada that was added
	 */
	@Override
	public mx.com.cuervo.rutas.model.Parada addParada(
		mx.com.cuervo.rutas.model.Parada parada) {

		return _paradaLocalService.addParada(parada);
	}

	/**
	 * Creates a new parada with the primary key. Does not add the parada to the database.
	 *
	 * @param paradaId the primary key for the new parada
	 * @return the new parada
	 */
	@Override
	public mx.com.cuervo.rutas.model.Parada createParada(long paradaId) {
		return _paradaLocalService.createParada(paradaId);
	}

	/**
	 * Deletes the parada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada that was removed
	 * @throws PortalException if a parada with the primary key could not be found
	 */
	@Override
	public mx.com.cuervo.rutas.model.Parada deleteParada(long paradaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paradaLocalService.deleteParada(paradaId);
	}

	@Override
	public mx.com.cuervo.rutas.model.Parada deleteParada(
			long paradaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paradaLocalService.deleteParada(paradaId, serviceContext);
	}

	/**
	 * Deletes the parada from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parada the parada
	 * @return the parada that was removed
	 */
	@Override
	public mx.com.cuervo.rutas.model.Parada deleteParada(
		mx.com.cuervo.rutas.model.Parada parada) {

		return _paradaLocalService.deleteParada(parada);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paradaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paradaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _paradaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _paradaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _paradaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _paradaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _paradaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public mx.com.cuervo.rutas.model.Parada fetchParada(long paradaId) {
		return _paradaLocalService.fetchParada(paradaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _paradaLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Parada> getEntries(
		long groupId, long rutaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.com.cuervo.rutas.model.Parada> obc) {

		return _paradaLocalService.getEntries(groupId, rutaId, start, end, obc);
	}

	@Override
	public int getEntriesCount(long groupId, long rutaId) {
		return _paradaLocalService.getEntriesCount(groupId, rutaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _paradaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _paradaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the parada with the primary key.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada
	 * @throws PortalException if a parada with the primary key could not be found
	 */
	@Override
	public mx.com.cuervo.rutas.model.Parada getParada(long paradaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paradaLocalService.getParada(paradaId);
	}

	/**
	 * Returns a range of all the paradas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of paradas
	 * @param end the upper bound of the range of paradas (not inclusive)
	 * @return the range of paradas
	 */
	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
		int start, int end) {

		return _paradaLocalService.getParadas(start, end);
	}

	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
		long groupId, long rutaId) {

		return _paradaLocalService.getParadas(groupId, rutaId);
	}

	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
			long groupId, long rutaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _paradaLocalService.getParadas(groupId, rutaId, start, end);
	}

	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
		long groupId, long rutaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.com.cuervo.rutas.model.Parada> obc) {

		return _paradaLocalService.getParadas(groupId, rutaId, start, end, obc);
	}

	/**
	 * Returns the number of paradas.
	 *
	 * @return the number of paradas
	 */
	@Override
	public int getParadasCount() {
		return _paradaLocalService.getParadasCount();
	}

	@Override
	public int getParadasCount(long groupId, long rutaId) {
		return _paradaLocalService.getParadasCount(groupId, rutaId);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paradaLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public mx.com.cuervo.rutas.model.Parada updateParada(
			long userId, long paradaId, String nombreParada, String descripcion,
			String horario, String nombreCarpeta, String nombreArchivo,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _paradaLocalService.updateParada(
			userId, paradaId, nombreParada, descripcion, horario, nombreCarpeta,
			nombreArchivo, serviceContext);
	}

	/**
	 * Updates the parada in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param parada the parada
	 * @return the parada that was updated
	 */
	@Override
	public mx.com.cuervo.rutas.model.Parada updateParada(
		mx.com.cuervo.rutas.model.Parada parada) {

		return _paradaLocalService.updateParada(parada);
	}

	@Override
	public ParadaLocalService getWrappedService() {
		return _paradaLocalService;
	}

	@Override
	public void setWrappedService(ParadaLocalService paradaLocalService) {
		_paradaLocalService = paradaLocalService;
	}

	private ParadaLocalService _paradaLocalService;

}