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

package mx.com.cuervo.rutas.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import mx.com.cuervo.rutas.exception.NoSuchParadaException;
import mx.com.cuervo.rutas.model.Parada;
import mx.com.cuervo.rutas.model.impl.ParadaImpl;
import mx.com.cuervo.rutas.model.impl.ParadaModelImpl;
import mx.com.cuervo.rutas.service.persistence.ParadaPersistence;
import mx.com.cuervo.rutas.service.persistence.impl.constants.CPersistenceConstants;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the parada service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ParadaPersistence.class)
@ProviderType
public class ParadaPersistenceImpl
	extends BasePersistenceImpl<Parada> implements ParadaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ParadaUtil</code> to access the parada persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ParadaImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByG_R;
	private FinderPath _finderPathWithoutPaginationFindByG_R;
	private FinderPath _finderPathCountByG_R;

	/**
	 * Returns all the paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the matching paradas
	 */
	@Override
	public List<Parada> findByG_R(long groupId, long rutaId) {
		return findByG_R(
			groupId, rutaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end) {

		return findByG_R(groupId, rutaId, start, end, null);
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
	@Override
	public List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Parada> orderByComparator, boolean useFinderCache) {

		return findByG_R(groupId, rutaId, start, end, orderByComparator);
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
	@Override
	public List<Parada> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Parada> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByG_R;
			finderArgs = new Object[] {groupId, rutaId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByG_R;
			finderArgs = new Object[] {
				groupId, rutaId, start, end, orderByComparator
			};
		}

		List<Parada> list = (List<Parada>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Parada parada : list) {
				if ((groupId != parada.getGroupId()) ||
					(rutaId != parada.getRutaId())) {

					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PARADA_WHERE);

			query.append(_FINDER_COLUMN_G_R_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_RUTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(ParadaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(rutaId);

				if (!pagination) {
					list = (List<Parada>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Parada>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Parada findByG_R_First(
			long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws NoSuchParadaException {

		Parada parada = fetchByG_R_First(groupId, rutaId, orderByComparator);

		if (parada != null) {
			return parada;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", rutaId=");
		msg.append(rutaId);

		msg.append("}");

		throw new NoSuchParadaException(msg.toString());
	}

	/**
	 * Returns the first parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parada, or <code>null</code> if a matching parada could not be found
	 */
	@Override
	public Parada fetchByG_R_First(
		long groupId, long rutaId,
		OrderByComparator<Parada> orderByComparator) {

		List<Parada> list = findByG_R(groupId, rutaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Parada findByG_R_Last(
			long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws NoSuchParadaException {

		Parada parada = fetchByG_R_Last(groupId, rutaId, orderByComparator);

		if (parada != null) {
			return parada;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", rutaId=");
		msg.append(rutaId);

		msg.append("}");

		throw new NoSuchParadaException(msg.toString());
	}

	/**
	 * Returns the last parada in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parada, or <code>null</code> if a matching parada could not be found
	 */
	@Override
	public Parada fetchByG_R_Last(
		long groupId, long rutaId,
		OrderByComparator<Parada> orderByComparator) {

		int count = countByG_R(groupId, rutaId);

		if (count == 0) {
			return null;
		}

		List<Parada> list = findByG_R(
			groupId, rutaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Parada[] findByG_R_PrevAndNext(
			long paradaId, long groupId, long rutaId,
			OrderByComparator<Parada> orderByComparator)
		throws NoSuchParadaException {

		Parada parada = findByPrimaryKey(paradaId);

		Session session = null;

		try {
			session = openSession();

			Parada[] array = new ParadaImpl[3];

			array[0] = getByG_R_PrevAndNext(
				session, parada, groupId, rutaId, orderByComparator, true);

			array[1] = parada;

			array[2] = getByG_R_PrevAndNext(
				session, parada, groupId, rutaId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Parada getByG_R_PrevAndNext(
		Session session, Parada parada, long groupId, long rutaId,
		OrderByComparator<Parada> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PARADA_WHERE);

		query.append(_FINDER_COLUMN_G_R_GROUPID_2);

		query.append(_FINDER_COLUMN_G_R_RUTAID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ParadaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(rutaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(parada)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Parada> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the paradas where groupId = &#63; and rutaId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 */
	@Override
	public void removeByG_R(long groupId, long rutaId) {
		for (Parada parada :
				findByG_R(
					groupId, rutaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(parada);
		}
	}

	/**
	 * Returns the number of paradas where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the number of matching paradas
	 */
	@Override
	public int countByG_R(long groupId, long rutaId) {
		FinderPath finderPath = _finderPathCountByG_R;

		Object[] finderArgs = new Object[] {groupId, rutaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PARADA_WHERE);

			query.append(_FINDER_COLUMN_G_R_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_RUTAID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(rutaId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_R_GROUPID_2 =
		"parada.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_R_RUTAID_2 =
		"parada.rutaId = ?";

	public ParadaPersistenceImpl() {
		setModelClass(Parada.class);

		setModelImplClass(ParadaImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the parada in the entity cache if it is enabled.
	 *
	 * @param parada the parada
	 */
	@Override
	public void cacheResult(Parada parada) {
		entityCache.putResult(
			entityCacheEnabled, ParadaImpl.class, parada.getPrimaryKey(),
			parada);

		parada.resetOriginalValues();
	}

	/**
	 * Caches the paradas in the entity cache if it is enabled.
	 *
	 * @param paradas the paradas
	 */
	@Override
	public void cacheResult(List<Parada> paradas) {
		for (Parada parada : paradas) {
			if (entityCache.getResult(
					entityCacheEnabled, ParadaImpl.class,
					parada.getPrimaryKey()) == null) {

				cacheResult(parada);
			}
			else {
				parada.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all paradas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ParadaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the parada.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Parada parada) {
		entityCache.removeResult(
			entityCacheEnabled, ParadaImpl.class, parada.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Parada> paradas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Parada parada : paradas) {
			entityCache.removeResult(
				entityCacheEnabled, ParadaImpl.class, parada.getPrimaryKey());
		}
	}

	/**
	 * Creates a new parada with the primary key. Does not add the parada to the database.
	 *
	 * @param paradaId the primary key for the new parada
	 * @return the new parada
	 */
	@Override
	public Parada create(long paradaId) {
		Parada parada = new ParadaImpl();

		parada.setNew(true);
		parada.setPrimaryKey(paradaId);

		parada.setCompanyId(CompanyThreadLocal.getCompanyId());

		return parada;
	}

	/**
	 * Removes the parada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada that was removed
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	@Override
	public Parada remove(long paradaId) throws NoSuchParadaException {
		return remove((Serializable)paradaId);
	}

	/**
	 * Removes the parada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the parada
	 * @return the parada that was removed
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	@Override
	public Parada remove(Serializable primaryKey) throws NoSuchParadaException {
		Session session = null;

		try {
			session = openSession();

			Parada parada = (Parada)session.get(ParadaImpl.class, primaryKey);

			if (parada == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchParadaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(parada);
		}
		catch (NoSuchParadaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Parada removeImpl(Parada parada) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(parada)) {
				parada = (Parada)session.get(
					ParadaImpl.class, parada.getPrimaryKeyObj());
			}

			if (parada != null) {
				session.delete(parada);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (parada != null) {
			clearCache(parada);
		}

		return parada;
	}

	@Override
	public Parada updateImpl(Parada parada) {
		boolean isNew = parada.isNew();

		if (!(parada instanceof ParadaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(parada.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(parada);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in parada proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Parada implementation " +
					parada.getClass());
		}

		ParadaModelImpl paradaModelImpl = (ParadaModelImpl)parada;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (parada.getCreateDate() == null)) {
			if (serviceContext == null) {
				parada.setCreateDate(now);
			}
			else {
				parada.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!paradaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				parada.setModifiedDate(now);
			}
			else {
				parada.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (parada.isNew()) {
				session.save(parada);

				parada.setNew(false);
			}
			else {
				parada = (Parada)session.merge(parada);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				paradaModelImpl.getGroupId(), paradaModelImpl.getRutaId()
			};

			finderCache.removeResult(_finderPathCountByG_R, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_R, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((paradaModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_R.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					paradaModelImpl.getOriginalGroupId(),
					paradaModelImpl.getOriginalRutaId()
				};

				finderCache.removeResult(_finderPathCountByG_R, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_R, args);

				args = new Object[] {
					paradaModelImpl.getGroupId(), paradaModelImpl.getRutaId()
				};

				finderCache.removeResult(_finderPathCountByG_R, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_R, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, ParadaImpl.class, parada.getPrimaryKey(),
			parada, false);

		parada.resetOriginalValues();

		return parada;
	}

	/**
	 * Returns the parada with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the parada
	 * @return the parada
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	@Override
	public Parada findByPrimaryKey(Serializable primaryKey)
		throws NoSuchParadaException {

		Parada parada = fetchByPrimaryKey(primaryKey);

		if (parada == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchParadaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return parada;
	}

	/**
	 * Returns the parada with the primary key or throws a <code>NoSuchParadaException</code> if it could not be found.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada
	 * @throws NoSuchParadaException if a parada with the primary key could not be found
	 */
	@Override
	public Parada findByPrimaryKey(long paradaId) throws NoSuchParadaException {
		return findByPrimaryKey((Serializable)paradaId);
	}

	/**
	 * Returns the parada with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param paradaId the primary key of the parada
	 * @return the parada, or <code>null</code> if a parada with the primary key could not be found
	 */
	@Override
	public Parada fetchByPrimaryKey(long paradaId) {
		return fetchByPrimaryKey((Serializable)paradaId);
	}

	/**
	 * Returns all the paradas.
	 *
	 * @return the paradas
	 */
	@Override
	public List<Parada> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Parada> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Parada> findAll(
		int start, int end, OrderByComparator<Parada> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
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
	@Override
	public List<Parada> findAll(
		int start, int end, OrderByComparator<Parada> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Parada> list = (List<Parada>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PARADA);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PARADA;

				if (pagination) {
					sql = sql.concat(ParadaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Parada>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Parada>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the paradas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Parada parada : findAll()) {
			remove(parada);
		}
	}

	/**
	 * Returns the number of paradas.
	 *
	 * @return the number of paradas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PARADA);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "paradaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PARADA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ParadaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the parada persistence.
	 */
	@Activate
	public void activate() {
		ParadaModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		ParadaModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParadaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParadaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByG_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParadaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParadaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_R",
			new String[] {Long.class.getName(), Long.class.getName()},
			ParadaModelImpl.GROUPID_COLUMN_BITMASK |
			ParadaModelImpl.RUTAID_COLUMN_BITMASK);

		_finderPathCountByG_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_R",
			new String[] {Long.class.getName(), Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(ParadaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = CPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.mx.com.cuervo.rutas.model.Parada"),
			true);
	}

	@Override
	@Reference(
		target = CPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PARADA =
		"SELECT parada FROM Parada parada";

	private static final String _SQL_SELECT_PARADA_WHERE =
		"SELECT parada FROM Parada parada WHERE ";

	private static final String _SQL_COUNT_PARADA =
		"SELECT COUNT(parada) FROM Parada parada";

	private static final String _SQL_COUNT_PARADA_WHERE =
		"SELECT COUNT(parada) FROM Parada parada WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "parada.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Parada exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Parada exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ParadaPersistenceImpl.class);

	static {
		try {
			Class.forName(CPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}