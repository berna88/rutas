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
 * Provides a wrapper for {@link RutaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RutaLocalService
 * @generated
 */
@ProviderType
public class RutaLocalServiceWrapper
	implements RutaLocalService, ServiceWrapper<RutaLocalService> {

	public RutaLocalServiceWrapper(RutaLocalService rutaLocalService) {
		_rutaLocalService = rutaLocalService;
	}

	@Override
	public mx.com.cuervo.rutas.model.Ruta addRuta(
			long userId, String nombreRuta, long capacidad, long disponibilidad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rutaLocalService.addRuta(
			userId, nombreRuta, capacidad, disponibilidad, serviceContext);
	}

	/**
	 * Adds the ruta to the database. Also notifies the appropriate model listeners.
	 *
	 * @param ruta the ruta
	 * @return the ruta that was added
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta addRuta(
		mx.com.cuervo.rutas.model.Ruta ruta) {

		return _rutaLocalService.addRuta(ruta);
	}

	/**
	 * Creates a new ruta with the primary key. Does not add the ruta to the database.
	 *
	 * @param rutaId the primary key for the new ruta
	 * @return the new ruta
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta createRuta(long rutaId) {
		return _rutaLocalService.createRuta(rutaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rutaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the ruta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rutaId the primary key of the ruta
	 * @return the ruta that was removed
	 * @throws PortalException if a ruta with the primary key could not be found
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta deleteRuta(long rutaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rutaLocalService.deleteRuta(rutaId);
	}

	@Override
	public mx.com.cuervo.rutas.model.Ruta deleteRuta(
			long rutaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _rutaLocalService.deleteRuta(rutaId, serviceContext);
	}

	/**
	 * Deletes the ruta from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ruta the ruta
	 * @return the ruta that was removed
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta deleteRuta(
		mx.com.cuervo.rutas.model.Ruta ruta) {

		return _rutaLocalService.deleteRuta(ruta);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rutaLocalService.dynamicQuery();
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

		return _rutaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _rutaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _rutaLocalService.dynamicQuery(
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

		return _rutaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _rutaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public mx.com.cuervo.rutas.model.Ruta fetchRuta(long rutaId) {
		return _rutaLocalService.fetchRuta(rutaId);
	}

	/**
	 * Returns the ruta matching the UUID and group.
	 *
	 * @param uuid the ruta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta fetchRutaByUuidAndGroupId(
		String uuid, long groupId) {

		return _rutaLocalService.fetchRutaByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rutaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _rutaLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rutaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rutaLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rutaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the ruta with the primary key.
	 *
	 * @param rutaId the primary key of the ruta
	 * @return the ruta
	 * @throws PortalException if a ruta with the primary key could not be found
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta getRuta(long rutaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rutaLocalService.getRuta(rutaId);
	}

	/**
	 * Returns the ruta matching the UUID and group.
	 *
	 * @param uuid the ruta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ruta
	 * @throws PortalException if a matching ruta could not be found
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta getRutaByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rutaLocalService.getRutaByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the rutas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @return the range of rutas
	 */
	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Ruta> getRutas(
		int start, int end) {

		return _rutaLocalService.getRutas(start, end);
	}

	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Ruta> getRutas(
		long groupId) {

		return _rutaLocalService.getRutas(groupId);
	}

	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Ruta> getRutas(
		long groupId, int start, int end) {

		return _rutaLocalService.getRutas(groupId, start, end);
	}

	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Ruta> getRutas(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.com.cuervo.rutas.model.Ruta> obc) {

		return _rutaLocalService.getRutas(groupId, start, end, obc);
	}

	/**
	 * Returns all the rutas matching the UUID and company.
	 *
	 * @param uuid the UUID of the rutas
	 * @param companyId the primary key of the company
	 * @return the matching rutas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Ruta>
		getRutasByUuidAndCompanyId(String uuid, long companyId) {

		return _rutaLocalService.getRutasByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of rutas matching the UUID and company.
	 *
	 * @param uuid the UUID of the rutas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching rutas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<mx.com.cuervo.rutas.model.Ruta>
		getRutasByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<mx.com.cuervo.rutas.model.Ruta> orderByComparator) {

		return _rutaLocalService.getRutasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rutas.
	 *
	 * @return the number of rutas
	 */
	@Override
	public int getRutasCount() {
		return _rutaLocalService.getRutasCount();
	}

	@Override
	public int getRutasCount(long groupId) {
		return _rutaLocalService.getRutasCount(groupId);
	}

	@Override
	public mx.com.cuervo.rutas.model.Ruta updateRuta(
			long userId, long rutaId, String nombreRuta, long capacidad,
			long disponibilidad,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _rutaLocalService.updateRuta(
			userId, rutaId, nombreRuta, capacidad, disponibilidad,
			serviceContext);
	}

	/**
	 * Updates the ruta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param ruta the ruta
	 * @return the ruta that was updated
	 */
	@Override
	public mx.com.cuervo.rutas.model.Ruta updateRuta(
		mx.com.cuervo.rutas.model.Ruta ruta) {

		return _rutaLocalService.updateRuta(ruta);
	}

	@Override
	public RutaLocalService getWrappedService() {
		return _rutaLocalService;
	}

	@Override
	public void setWrappedService(RutaLocalService rutaLocalService) {
		_rutaLocalService = rutaLocalService;
	}

	private RutaLocalService _rutaLocalService;

}