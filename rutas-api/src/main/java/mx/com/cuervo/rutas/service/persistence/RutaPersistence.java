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

import mx.com.cuervo.rutas.exception.NoSuchRutaException;
import mx.com.cuervo.rutas.model.Ruta;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ruta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RutaUtil
 * @generated
 */
@ProviderType
public interface RutaPersistence extends BasePersistence<Ruta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RutaUtil} to access the ruta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the rutas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching rutas
	 */
	public java.util.List<Ruta> findByUuid(String uuid);

	/**
	 * Returns a range of all the rutas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @return the range of matching rutas
	 */
	public java.util.List<Ruta> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the rutas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rutas
	 */
	@Deprecated
	public java.util.List<Ruta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Ruta> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the rutas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rutas
	 */
	public java.util.List<Ruta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the first ruta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ruta
	 * @throws NoSuchRutaException if a matching ruta could not be found
	 */
	public Ruta findByUuid_First(
			String uuid, OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Returns the first ruta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	public Ruta fetchByUuid_First(
		String uuid, OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the last ruta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ruta
	 * @throws NoSuchRutaException if a matching ruta could not be found
	 */
	public Ruta findByUuid_Last(
			String uuid, OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Returns the last ruta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	public Ruta fetchByUuid_Last(
		String uuid, OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the rutas before and after the current ruta in the ordered set where uuid = &#63;.
	 *
	 * @param rutaId the primary key of the current ruta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ruta
	 * @throws NoSuchRutaException if a ruta with the primary key could not be found
	 */
	public Ruta[] findByUuid_PrevAndNext(
			long rutaId, String uuid, OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Removes all the rutas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of rutas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching rutas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ruta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRutaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ruta
	 * @throws NoSuchRutaException if a matching ruta could not be found
	 */
	public Ruta findByUUID_G(String uuid, long groupId)
		throws NoSuchRutaException;

	/**
	 * Returns the ruta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	@Deprecated
	public Ruta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the ruta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	public Ruta fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the ruta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ruta that was removed
	 */
	public Ruta removeByUUID_G(String uuid, long groupId)
		throws NoSuchRutaException;

	/**
	 * Returns the number of rutas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching rutas
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the rutas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching rutas
	 */
	public java.util.List<Ruta> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the rutas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @return the range of matching rutas
	 */
	public java.util.List<Ruta> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the rutas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rutas
	 */
	@Deprecated
	public java.util.List<Ruta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Ruta> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the rutas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rutas
	 */
	public java.util.List<Ruta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the first ruta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ruta
	 * @throws NoSuchRutaException if a matching ruta could not be found
	 */
	public Ruta findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Returns the first ruta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	public Ruta fetchByUuid_C_First(
		String uuid, long companyId, OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the last ruta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ruta
	 * @throws NoSuchRutaException if a matching ruta could not be found
	 */
	public Ruta findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Returns the last ruta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	public Ruta fetchByUuid_C_Last(
		String uuid, long companyId, OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the rutas before and after the current ruta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param rutaId the primary key of the current ruta
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ruta
	 * @throws NoSuchRutaException if a ruta with the primary key could not be found
	 */
	public Ruta[] findByUuid_C_PrevAndNext(
			long rutaId, String uuid, long companyId,
			OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Removes all the rutas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of rutas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching rutas
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the rutas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching rutas
	 */
	public java.util.List<Ruta> findByGroupId(long groupId);

	/**
	 * Returns a range of all the rutas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @return the range of matching rutas
	 */
	public java.util.List<Ruta> findByGroupId(long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the rutas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rutas
	 */
	@Deprecated
	public java.util.List<Ruta> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Ruta> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the rutas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rutas
	 */
	public java.util.List<Ruta> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the first ruta in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ruta
	 * @throws NoSuchRutaException if a matching ruta could not be found
	 */
	public Ruta findByGroupId_First(
			long groupId, OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Returns the first ruta in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	public Ruta fetchByGroupId_First(
		long groupId, OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the last ruta in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ruta
	 * @throws NoSuchRutaException if a matching ruta could not be found
	 */
	public Ruta findByGroupId_Last(
			long groupId, OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Returns the last ruta in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ruta, or <code>null</code> if a matching ruta could not be found
	 */
	public Ruta fetchByGroupId_Last(
		long groupId, OrderByComparator<Ruta> orderByComparator);

	/**
	 * Returns the rutas before and after the current ruta in the ordered set where groupId = &#63;.
	 *
	 * @param rutaId the primary key of the current ruta
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ruta
	 * @throws NoSuchRutaException if a ruta with the primary key could not be found
	 */
	public Ruta[] findByGroupId_PrevAndNext(
			long rutaId, long groupId,
			OrderByComparator<Ruta> orderByComparator)
		throws NoSuchRutaException;

	/**
	 * Removes all the rutas where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of rutas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching rutas
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the ruta in the entity cache if it is enabled.
	 *
	 * @param ruta the ruta
	 */
	public void cacheResult(Ruta ruta);

	/**
	 * Caches the rutas in the entity cache if it is enabled.
	 *
	 * @param rutas the rutas
	 */
	public void cacheResult(java.util.List<Ruta> rutas);

	/**
	 * Creates a new ruta with the primary key. Does not add the ruta to the database.
	 *
	 * @param rutaId the primary key for the new ruta
	 * @return the new ruta
	 */
	public Ruta create(long rutaId);

	/**
	 * Removes the ruta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rutaId the primary key of the ruta
	 * @return the ruta that was removed
	 * @throws NoSuchRutaException if a ruta with the primary key could not be found
	 */
	public Ruta remove(long rutaId) throws NoSuchRutaException;

	public Ruta updateImpl(Ruta ruta);

	/**
	 * Returns the ruta with the primary key or throws a <code>NoSuchRutaException</code> if it could not be found.
	 *
	 * @param rutaId the primary key of the ruta
	 * @return the ruta
	 * @throws NoSuchRutaException if a ruta with the primary key could not be found
	 */
	public Ruta findByPrimaryKey(long rutaId) throws NoSuchRutaException;

	/**
	 * Returns the ruta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rutaId the primary key of the ruta
	 * @return the ruta, or <code>null</code> if a ruta with the primary key could not be found
	 */
	public Ruta fetchByPrimaryKey(long rutaId);

	/**
	 * Returns all the rutas.
	 *
	 * @return the rutas
	 */
	public java.util.List<Ruta> findAll();

	/**
	 * Returns a range of all the rutas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @return the range of rutas
	 */
	public java.util.List<Ruta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rutas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rutas
	 */
	@Deprecated
	public java.util.List<Ruta> findAll(
		int start, int end, OrderByComparator<Ruta> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the rutas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RutaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rutas
	 * @param end the upper bound of the range of rutas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rutas
	 */
	public java.util.List<Ruta> findAll(
		int start, int end, OrderByComparator<Ruta> orderByComparator);

	/**
	 * Removes all the rutas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rutas.
	 *
	 * @return the number of rutas
	 */
	public int countAll();

}