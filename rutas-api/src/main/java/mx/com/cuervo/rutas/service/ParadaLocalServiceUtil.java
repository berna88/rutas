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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Parada. This utility wraps
 * <code>mx.com.cuervo.rutas.service.impl.ParadaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ParadaLocalService
 * @generated
 */
@ProviderType
public class ParadaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.com.cuervo.rutas.service.impl.ParadaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static mx.com.cuervo.rutas.model.Parada addParada(
			long userId, long rutaId, String nombreParada, String descripcion,
			String horario, String nombreCarpeta, String nombreArchivo,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addParada(
			userId, rutaId, nombreParada, descripcion, horario, nombreCarpeta,
			nombreArchivo, serviceContext);
	}

	/**
	 * Adds the parada to the database. Also notifies the appropriate model listeners.
	 *
	 * @param parada the parada
	 * @return the parada that was added
	 */
	public static mx.com.cuervo.rutas.model.Parada addParada(
		mx.com.cuervo.rutas.model.Parada parada) {

		return getService().addParada(parada);
	}

	/**
	 * Creates a new parada with the primary key. Does not add the parada to the database.
	 *
	 * @param paradaId the primary key for the new parada
	 * @return the new parada
	 */
	public static mx.com.cuervo.rutas.model.Parada createParada(long paradaId) {
		return getService().createParada(paradaId);
	}

	/**
	 * Deletes the parada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada that was removed
	 * @throws PortalException if a parada with the primary key could not be found
	 */
	public static mx.com.cuervo.rutas.model.Parada deleteParada(long paradaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteParada(paradaId);
	}

	public static mx.com.cuervo.rutas.model.Parada deleteParada(
			long paradaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteParada(paradaId, serviceContext);
	}

	/**
	 * Deletes the parada from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parada the parada
	 * @return the parada that was removed
	 */
	public static mx.com.cuervo.rutas.model.Parada deleteParada(
		mx.com.cuervo.rutas.model.Parada parada) {

		return getService().deleteParada(parada);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static mx.com.cuervo.rutas.model.Parada fetchParada(long paradaId) {
		return getService().fetchParada(paradaId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<mx.com.cuervo.rutas.model.Parada> getEntries(
		long groupId, long rutaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.com.cuervo.rutas.model.Parada> obc) {

		return getService().getEntries(groupId, rutaId, start, end, obc);
	}

	public static int getEntriesCount(long groupId, long rutaId) {
		return getService().getEntriesCount(groupId, rutaId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the parada with the primary key.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada
	 * @throws PortalException if a parada with the primary key could not be found
	 */
	public static mx.com.cuervo.rutas.model.Parada getParada(long paradaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getParada(paradaId);
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
	public static java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
		int start, int end) {

		return getService().getParadas(start, end);
	}

	public static java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
		long groupId, long rutaId) {

		return getService().getParadas(groupId, rutaId);
	}

	public static java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
			long groupId, long rutaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getParadas(groupId, rutaId, start, end);
	}

	public static java.util.List<mx.com.cuervo.rutas.model.Parada> getParadas(
		long groupId, long rutaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<mx.com.cuervo.rutas.model.Parada> obc) {

		return getService().getParadas(groupId, rutaId, start, end, obc);
	}

	/**
	 * Returns the number of paradas.
	 *
	 * @return the number of paradas
	 */
	public static int getParadasCount() {
		return getService().getParadasCount();
	}

	public static int getParadasCount(long groupId, long rutaId) {
		return getService().getParadasCount(groupId, rutaId);
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static mx.com.cuervo.rutas.model.Parada updateParada(
			long userId, long paradaId, String nombreParada, String descripcion,
			String horario, String nombreCarpeta, String nombreArchivo,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateParada(
			userId, paradaId, nombreParada, descripcion, horario, nombreCarpeta,
			nombreArchivo, serviceContext);
	}

	/**
	 * Updates the parada in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param parada the parada
	 * @return the parada that was updated
	 */
	public static mx.com.cuervo.rutas.model.Parada updateParada(
		mx.com.cuervo.rutas.model.Parada parada) {

		return getService().updateParada(parada);
	}

	public static ParadaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ParadaLocalService, ParadaLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ParadaLocalService.class);

		ServiceTracker<ParadaLocalService, ParadaLocalService> serviceTracker =
			new ServiceTracker<ParadaLocalService, ParadaLocalService>(
				bundle.getBundleContext(), ParadaLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}