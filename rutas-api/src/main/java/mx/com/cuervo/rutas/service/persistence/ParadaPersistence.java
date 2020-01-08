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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import mx.com.cuervo.rutas.exception.NoSuchParadaException;
import mx.com.cuervo.rutas.model.Parada;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the parada service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParadaUtil
 * @generated
 */
@ProviderType
public interface ParadaPersistence extends BasePersistence<Parada> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParadaUtil} to access the parada persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the matching paradas
	 */
	public java.util.List<Parada> findByG_R(long groupId, long rutaId);

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
	public java.util.List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end);

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
	public java.util.List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Parada> orderByComparator, boolean useFinderCache);

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
	public java.util.List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Parada> orderByComparator);

	/**
	 * Returns the first parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parada
	 * @throws NoSuchParadaException if a matching parada could not be found
	 */
	public Parada findByG_R_First(
			long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws NoSuchParadaException;

	/**
	 * Returns the first parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parada, or <code>null</code> if a matching parada could not be found
	 */
	public Parada fetchByG_R_First(
		long groupId, long rutaId, OrderByComparator<Parada> orderByComparator);

	/**
	 * Returns the last parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parada
	 * @throws NoSuchParadaException if a matching parada could not be found
	 */
	public Parada findByG_R_Last(
			long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws NoSuchParadaException;

	/**
	 * Returns the last parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parada, or <code>null</code> if a matching parada could not be found
	 */
	public Parada fetchByG_R_Last(
		long groupId, long rutaId, OrderByComparator<Parada> orderByComparator);

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
	public Parada[] findByG_R_PrevAndNext(
			long paradaId, long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws NoSuchParadaException;

	/**
	 * Removes all the paradas where groupId = &#63; and rutaId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 */
	public void removeByG_R(long groupId, long rutaId);

	/**
	 * Returns the number of paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the number of matching paradas
	 */
	public int countByG_R(long groupId, long rutaId);

	/**
	 * Caches the parada in the entity cache if it is enabled.
	 *
	 * @param parada the parada
	 */
	public void cacheResult(Parada parada);

	/**
	 * Caches the paradas in the entity cache if it is enabled.
	 *
	 * @param paradas the paradas
	 */
	public void cacheResult(java.util.List<Parada> paradas);

	/**
	 * Creates a new parada with the primary key. Does not add the parada to the database.
	 *
	 * @param paradaId the primary key for the new parada
	 * @return the new parada
	 */
	public Parada create(long paradaId);

	/**
	 * Removes the parada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada that was removed
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	public Parada remove(long paradaId) throws NoSuchParadaException;

	public Parada updateImpl(Parada parada);

	/**
	 * Returns the parada with the primary key or throws a <code>NoSuchParadaException</code> if it could not be found.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	public Parada findByPrimaryKey(long paradaId) throws NoSuchParadaException;

	/**
	 * Returns the parada with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada, or <code>null</code> if a parada with the primary key could not be found
	 */
	public Parada fetchByPrimaryKey(long paradaId);

	/**
	 * Returns all the paradas.
	 *
	 * @return the paradas
	 */
	public java.util.List<Parada> findAll();

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
	public java.util.List<Parada> findAll(int start, int end);

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
	public java.util.List<Parada> findAll(
		int start, int end, OrderByComparator<Parada> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<Parada> findAll(
		int start, int end, OrderByComparator<Parada> orderByComparator);

	/**
	 * Removes all the paradas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of paradas.
	 *
	 * @return the number of paradas
	 */
	public int countAll();

}