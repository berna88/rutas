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
 * Provides the local service utility for Usuario. This utility wraps
 * <code>mx.com.cuervo.rutas.service.impl.UsuarioLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioLocalService
 * @generated
 */
@ProviderType
public class UsuarioLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>mx.com.cuervo.rutas.service.impl.UsuarioLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the usuario to the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuario the usuario
	 * @return the usuario that was added
	 */
	public static mx.com.cuervo.rutas.model.Usuario addUsuario(
		mx.com.cuervo.rutas.model.Usuario usuario) {

		return getService().addUsuario(usuario);
	}

	/**
	 * Creates a new usuario with the primary key. Does not add the usuario to the database.
	 *
	 * @param usuarioId the primary key for the new usuario
	 * @return the new usuario
	 */
	public static mx.com.cuervo.rutas.model.Usuario createUsuario(
		long usuarioId) {

		return getService().createUsuario(usuarioId);
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

	/**
	 * Deletes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws PortalException if a usuario with the primary key could not be found
	 */
	public static mx.com.cuervo.rutas.model.Usuario deleteUsuario(
			long usuarioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteUsuario(usuarioId);
	}

	/**
	 * Deletes the usuario from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuario the usuario
	 * @return the usuario that was removed
	 */
	public static mx.com.cuervo.rutas.model.Usuario deleteUsuario(
		mx.com.cuervo.rutas.model.Usuario usuario) {

		return getService().deleteUsuario(usuario);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static mx.com.cuervo.rutas.model.Usuario fetchUsuario(
		long usuarioId) {

		return getService().fetchUsuario(usuarioId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the usuario with the primary key.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario
	 * @throws PortalException if a usuario with the primary key could not be found
	 */
	public static mx.com.cuervo.rutas.model.Usuario getUsuario(long usuarioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getUsuario(usuarioId);
	}

	/**
	 * Returns a range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>mx.com.cuervo.rutas.model.impl.UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of usuarios
	 */
	public static java.util.List<mx.com.cuervo.rutas.model.Usuario> getUsuarios(
		int start, int end) {

		return getService().getUsuarios(start, end);
	}

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
	 */
	public static int getUsuariosCount() {
		return getService().getUsuariosCount();
	}

	/**
	 * Updates the usuario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param usuario the usuario
	 * @return the usuario that was updated
	 */
	public static mx.com.cuervo.rutas.model.Usuario updateUsuario(
		mx.com.cuervo.rutas.model.Usuario usuario) {

		return getService().updateUsuario(usuario);
	}

	public static UsuarioLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UsuarioLocalService, UsuarioLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UsuarioLocalService.class);

		ServiceTracker<UsuarioLocalService, UsuarioLocalService>
			serviceTracker =
				new ServiceTracker<UsuarioLocalService, UsuarioLocalService>(
					bundle.getBundleContext(), UsuarioLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}