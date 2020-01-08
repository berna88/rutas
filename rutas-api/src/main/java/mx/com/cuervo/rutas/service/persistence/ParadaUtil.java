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

package mx.com.cuervo.rutas.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import mx.com.cuervo.rutas.model.Parada;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the parada service. This utility wraps <code>mx.com.cuervo.rutas.service.persistence.impl.ParadaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParadaPersistence
 * @generated
 */
@ProviderType
public class ParadaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Parada parada) {
		getPersistence().clearCache(parada);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Parada> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Parada> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Parada> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Parada> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Parada> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Parada update(Parada parada) {
		return getPersistence().update(parada);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Parada update(Parada parada, ServiceContext serviceContext) {
		return getPersistence().update(parada, serviceContext);
	}

	/**
	 * Returns all the paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the matching paradas
	 */
	public static List<Parada> findByG_R(long groupId, long rutaId) {
		return getPersistence().findByG_R(groupId, rutaId);
	}

	/**
	 * Returns a range of all the paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param start the lower bound of the range of paradas
	 * @param end the upper bound of the range of paradas (not inclusive)
	 * @return the range of matching paradas
	 */
	public static List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end) {

		return getPersistence().findByG_R(groupId, rutaId, start, end);
	}

	/**
	 * Returns an ordered range of all the paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByG_R(long,long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param start the lower bound of the range of paradas
	 * @param end the upper bound of the range of paradas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching paradas
	 */
	@Deprecated
	public static List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Parada> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_R(
			groupId, rutaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param start the lower bound of the range of paradas
	 * @param end the upper bound of the range of paradas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching paradas
	 */
	public static List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Parada> orderByComparator) {

		return getPersistence().findByG_R(
			groupId, rutaId, start, end, orderByComparator);
	}

	/**
	 * Returns the first parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parada
	 * @throws NoSuchParadaException if a matching parada could not be found
	 */
	public static Parada findByG_R_First(
			long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws mx.com.cuervo.rutas.exception.NoSuchParadaException {

		return getPersistence().findByG_R_First(
			groupId, rutaId, orderByComparator);
	}

	/**
	 * Returns the first parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parada, or <code>null</code> if a matching parada could not be found
	 */
	public static Parada fetchByG_R_First(
		long groupId, long rutaId,
		OrderByComparator<Parada> orderByComparator) {

		return getPersistence().fetchByG_R_First(
			groupId, rutaId, orderByComparator);
	}

	/**
	 * Returns the last parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parada
	 * @throws NoSuchParadaException if a matching parada could not be found
	 */
	public static Parada findByG_R_Last(
			long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws mx.com.cuervo.rutas.exception.NoSuchParadaException {

		return getPersistence().findByG_R_Last(
			groupId, rutaId, orderByComparator);
	}

	/**
	 * Returns the last parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parada, or <code>null</code> if a matching parada could not be found
	 */
	public static Parada fetchByG_R_Last(
		long groupId, long rutaId,
		OrderByComparator<Parada> orderByComparator) {

		return getPersistence().fetchByG_R_Last(
			groupId, rutaId, orderByComparator);
	}

	/**
	 * Returns the paradas before and after the current parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param paradaId the primary key of the current parada
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parada
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	public static Parada[] findByG_R_PrevAndNext(
			long paradaId, long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws mx.com.cuervo.rutas.exception.NoSuchParadaException {

		return getPersistence().findByG_R_PrevAndNext(
			paradaId, groupId, rutaId, orderByComparator);
	}

	/**
	 * Removes all the paradas where groupId = &#63; and rutaId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 */
	public static void removeByG_R(long groupId, long rutaId) {
		getPersistence().removeByG_R(groupId, rutaId);
	}

	/**
	 * Returns the number of paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the number of matching paradas
	 */
	public static int countByG_R(long groupId, long rutaId) {
		return getPersistence().countByG_R(groupId, rutaId);
	}

	/**
	 * Caches the parada in the entity cache if it is enabled.
	 *
	 * @param parada the parada
	 */
	public static void cacheResult(Parada parada) {
		getPersistence().cacheResult(parada);
	}

	/**
	 * Caches the paradas in the entity cache if it is enabled.
	 *
	 * @param paradas the paradas
	 */
	public static void cacheResult(List<Parada> paradas) {
		getPersistence().cacheResult(paradas);
	}

	/**
	 * Creates a new parada with the primary key. Does not add the parada to the database.
	 *
	 * @param paradaId the primary key for the new parada
	 * @return the new parada
	 */
	public static Parada create(long paradaId) {
		return getPersistence().create(paradaId);
	}

	/**
	 * Removes the parada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada that was removed
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	public static Parada remove(long paradaId)
		throws mx.com.cuervo.rutas.exception.NoSuchParadaException {

		return getPersistence().remove(paradaId);
	}

	public static Parada updateImpl(Parada parada) {
		return getPersistence().updateImpl(parada);
	}

	/**
	 * Returns the parada with the primary key or throws a <code>NoSuchParadaException</code> if it could not be found.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	public static Parada findByPrimaryKey(long paradaId)
		throws mx.com.cuervo.rutas.exception.NoSuchParadaException {

		return getPersistence().findByPrimaryKey(paradaId);
	}

	/**
	 * Returns the parada with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada, or <code>null</code> if a parada with the primary key could not be found
	 */
	public static Parada fetchByPrimaryKey(long paradaId) {
		return getPersistence().fetchByPrimaryKey(paradaId);
	}

	/**
	 * Returns all the paradas.
	 *
	 * @return the paradas
	 */
	public static List<Parada> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the paradas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of paradas
	 * @param end the upper bound of the range of paradas (not inclusive)
	 * @return the range of paradas
	 */
	public static List<Parada> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the paradas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of paradas
	 * @param end the upper bound of the range of paradas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of paradas
	 */
	@Deprecated
	public static List<Parada> findAll(
		int start, int end, OrderByComparator<Parada> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the paradas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ParadaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of paradas
	 * @param end the upper bound of the range of paradas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of paradas
	 */
	public static List<Parada> findAll(
		int start, int end, OrderByComparator<Parada> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the paradas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of paradas.
	 *
	 * @return the number of paradas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ParadaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ParadaPersistence, ParadaPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ParadaPersistence.class);

		ServiceTracker<ParadaPersistence, ParadaPersistence> serviceTracker =
			new ServiceTracker<ParadaPersistence, ParadaPersistence>(
				bundle.getBundleContext(), ParadaPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}