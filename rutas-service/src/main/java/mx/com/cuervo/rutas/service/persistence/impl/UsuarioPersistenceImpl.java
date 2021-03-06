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

import mx.com.cuervo.rutas.exception.NoSuchUsuarioException;
import mx.com.cuervo.rutas.model.Usuario;
import mx.com.cuervo.rutas.model.impl.UsuarioImpl;
import mx.com.cuervo.rutas.model.impl.UsuarioModelImpl;
import mx.com.cuervo.rutas.service.persistence.UsuarioPersistence;
import mx.com.cuervo.rutas.service.persistence.impl.constants.CPersistenceConstants;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UsuarioPersistence.class)
@ProviderType
public class UsuarioPersistenceImpl
	extends BasePersistenceImpl<Usuario> implements UsuarioPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UsuarioUtil</code> to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UsuarioImpl.class.getName();

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
	 * Returns all the usuarios where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the matching usuarios
	 */
	@Override
	public List<Usuario> findByG_R(long groupId, long rutaId) {
		return findByG_R(
			groupId, rutaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuarios where groupId = &#63; and rutaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of matching usuarios
	 */
	@Override
	public List<Usuario> findByG_R(
		long groupId, long rutaId, int start, int end) {

		return findByG_R(groupId, rutaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuarios where groupId = &#63; and rutaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByG_R(long,long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching usuarios
	 */
	@Deprecated
	@Override
	public List<Usuario> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Usuario> orderByComparator, boolean useFinderCache) {

		return findByG_R(groupId, rutaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the usuarios where groupId = &#63; and rutaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching usuarios
	 */
	@Override
	public List<Usuario> findByG_R(
		long groupId, long rutaId, int start, int end,
		OrderByComparator<Usuario> orderByComparator) {

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

		List<Usuario> list = (List<Usuario>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Usuario usuario : list) {
				if ((groupId != usuario.getGroupId()) ||
					(rutaId != usuario.getRutaId())) {

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

			query.append(_SQL_SELECT_USUARIO_WHERE);

			query.append(_FINDER_COLUMN_G_R_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_RUTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(UsuarioModelImpl.ORDER_BY_JPQL);
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
					list = (List<Usuario>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Usuario>)QueryUtil.list(
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
	 * Returns the first usuario in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	@Override
	public Usuario findByG_R_First(
			long groupId, long rutaId,
			OrderByComparator<Usuario> orderByComparator)
		throws NoSuchUsuarioException {

		Usuario usuario = fetchByG_R_First(groupId, rutaId, orderByComparator);

		if (usuario != null) {
			return usuario;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", rutaId=");
		msg.append(rutaId);

		msg.append("}");

		throw new NoSuchUsuarioException(msg.toString());
	}

	/**
	 * Returns the first usuario in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	@Override
	public Usuario fetchByG_R_First(
		long groupId, long rutaId,
		OrderByComparator<Usuario> orderByComparator) {

		List<Usuario> list = findByG_R(
			groupId, rutaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last usuario in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	@Override
	public Usuario findByG_R_Last(
			long groupId, long rutaId,
			OrderByComparator<Usuario> orderByComparator)
		throws NoSuchUsuarioException {

		Usuario usuario = fetchByG_R_Last(groupId, rutaId, orderByComparator);

		if (usuario != null) {
			return usuario;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", rutaId=");
		msg.append(rutaId);

		msg.append("}");

		throw new NoSuchUsuarioException(msg.toString());
	}

	/**
	 * Returns the last usuario in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	@Override
	public Usuario fetchByG_R_Last(
		long groupId, long rutaId,
		OrderByComparator<Usuario> orderByComparator) {

		int count = countByG_R(groupId, rutaId);

		if (count == 0) {
			return null;
		}

		List<Usuario> list = findByG_R(
			groupId, rutaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the usuarios before and after the current usuario in the ordered set where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param usuarioId the primary key of the current usuario
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	@Override
	public Usuario[] findByG_R_PrevAndNext(
			long usuarioId, long groupId, long rutaId,
			OrderByComparator<Usuario> orderByComparator)
		throws NoSuchUsuarioException {

		Usuario usuario = findByPrimaryKey(usuarioId);

		Session session = null;

		try {
			session = openSession();

			Usuario[] array = new UsuarioImpl[3];

			array[0] = getByG_R_PrevAndNext(
				session, usuario, groupId, rutaId, orderByComparator, true);

			array[1] = usuario;

			array[2] = getByG_R_PrevAndNext(
				session, usuario, groupId, rutaId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Usuario getByG_R_PrevAndNext(
		Session session, Usuario usuario, long groupId, long rutaId,
		OrderByComparator<Usuario> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_USUARIO_WHERE);

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
			query.append(UsuarioModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(usuario)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Usuario> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the usuarios where groupId = &#63; and rutaId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 */
	@Override
	public void removeByG_R(long groupId, long rutaId) {
		for (Usuario usuario :
				findByG_R(
					groupId, rutaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(usuario);
		}
	}

	/**
	 * Returns the number of usuarios where groupId = &#63; and rutaId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param rutaId the ruta ID
	 * @return the number of matching usuarios
	 */
	@Override
	public int countByG_R(long groupId, long rutaId) {
		FinderPath finderPath = _finderPathCountByG_R;

		Object[] finderArgs = new Object[] {groupId, rutaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USUARIO_WHERE);

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
		"usuario.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_R_RUTAID_2 =
		"usuario.rutaId = ?";

	public UsuarioPersistenceImpl() {
		setModelClass(Usuario.class);

		setModelImplClass(UsuarioImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the usuario in the entity cache if it is enabled.
	 *
	 * @param usuario the usuario
	 */
	@Override
	public void cacheResult(Usuario usuario) {
		entityCache.putResult(
			entityCacheEnabled, UsuarioImpl.class, usuario.getPrimaryKey(),
			usuario);

		usuario.resetOriginalValues();
	}

	/**
	 * Caches the usuarios in the entity cache if it is enabled.
	 *
	 * @param usuarios the usuarios
	 */
	@Override
	public void cacheResult(List<Usuario> usuarios) {
		for (Usuario usuario : usuarios) {
			if (entityCache.getResult(
					entityCacheEnabled, UsuarioImpl.class,
					usuario.getPrimaryKey()) == null) {

				cacheResult(usuario);
			}
			else {
				usuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all usuarios.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UsuarioImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the usuario.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Usuario usuario) {
		entityCache.removeResult(
			entityCacheEnabled, UsuarioImpl.class, usuario.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Usuario> usuarios) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Usuario usuario : usuarios) {
			entityCache.removeResult(
				entityCacheEnabled, UsuarioImpl.class, usuario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new usuario with the primary key. Does not add the usuario to the database.
	 *
	 * @param usuarioId the primary key for the new usuario
	 * @return the new usuario
	 */
	@Override
	public Usuario create(long usuarioId) {
		Usuario usuario = new UsuarioImpl();

		usuario.setNew(true);
		usuario.setPrimaryKey(usuarioId);

		usuario.setCompanyId(CompanyThreadLocal.getCompanyId());

		return usuario;
	}

	/**
	 * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	@Override
	public Usuario remove(long usuarioId) throws NoSuchUsuarioException {
		return remove((Serializable)usuarioId);
	}

	/**
	 * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	@Override
	public Usuario remove(Serializable primaryKey)
		throws NoSuchUsuarioException {

		Session session = null;

		try {
			session = openSession();

			Usuario usuario = (Usuario)session.get(
				UsuarioImpl.class, primaryKey);

			if (usuario == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(usuario);
		}
		catch (NoSuchUsuarioException nsee) {
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
	protected Usuario removeImpl(Usuario usuario) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usuario)) {
				usuario = (Usuario)session.get(
					UsuarioImpl.class, usuario.getPrimaryKeyObj());
			}

			if (usuario != null) {
				session.delete(usuario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (usuario != null) {
			clearCache(usuario);
		}

		return usuario;
	}

	@Override
	public Usuario updateImpl(Usuario usuario) {
		boolean isNew = usuario.isNew();

		if (!(usuario instanceof UsuarioModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(usuario.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(usuario);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in usuario proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Usuario implementation " +
					usuario.getClass());
		}

		UsuarioModelImpl usuarioModelImpl = (UsuarioModelImpl)usuario;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (usuario.getCreateDate() == null)) {
			if (serviceContext == null) {
				usuario.setCreateDate(now);
			}
			else {
				usuario.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!usuarioModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				usuario.setModifiedDate(now);
			}
			else {
				usuario.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (usuario.isNew()) {
				session.save(usuario);

				usuario.setNew(false);
			}
			else {
				usuario = (Usuario)session.merge(usuario);
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
				usuarioModelImpl.getGroupId(), usuarioModelImpl.getRutaId()
			};

			finderCache.removeResult(_finderPathCountByG_R, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_R, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((usuarioModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_R.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					usuarioModelImpl.getOriginalGroupId(),
					usuarioModelImpl.getOriginalRutaId()
				};

				finderCache.removeResult(_finderPathCountByG_R, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_R, args);

				args = new Object[] {
					usuarioModelImpl.getGroupId(), usuarioModelImpl.getRutaId()
				};

				finderCache.removeResult(_finderPathCountByG_R, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_R, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, UsuarioImpl.class, usuario.getPrimaryKey(),
			usuario, false);

		usuario.resetOriginalValues();

		return usuario;
	}

	/**
	 * Returns the usuario with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario
	 * @return the usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	@Override
	public Usuario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsuarioException {

		Usuario usuario = fetchByPrimaryKey(primaryKey);

		if (usuario == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsuarioException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return usuario;
	}

	/**
	 * Returns the usuario with the primary key or throws a <code>NoSuchUsuarioException</code> if it could not be found.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	@Override
	public Usuario findByPrimaryKey(long usuarioId)
		throws NoSuchUsuarioException {

		return findByPrimaryKey((Serializable)usuarioId);
	}

	/**
	 * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
	 */
	@Override
	public Usuario fetchByPrimaryKey(long usuarioId) {
		return fetchByPrimaryKey((Serializable)usuarioId);
	}

	/**
	 * Returns all the usuarios.
	 *
	 * @return the usuarios
	 */
	@Override
	public List<Usuario> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of usuarios
	 */
	@Override
	public List<Usuario> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of usuarios
	 */
	@Deprecated
	@Override
	public List<Usuario> findAll(
		int start, int end, OrderByComparator<Usuario> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuarios
	 */
	@Override
	public List<Usuario> findAll(
		int start, int end, OrderByComparator<Usuario> orderByComparator) {

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

		List<Usuario> list = (List<Usuario>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_USUARIO);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USUARIO;

				if (pagination) {
					sql = sql.concat(UsuarioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Usuario>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Usuario>)QueryUtil.list(
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
	 * Removes all the usuarios from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Usuario usuario : findAll()) {
			remove(usuario);
		}
	}

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USUARIO);

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
		return "usuarioId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_USUARIO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UsuarioModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the usuario persistence.
	 */
	@Activate
	public void activate() {
		UsuarioModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		UsuarioModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByG_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_R",
			new String[] {Long.class.getName(), Long.class.getName()},
			UsuarioModelImpl.GROUPID_COLUMN_BITMASK |
			UsuarioModelImpl.RUTAID_COLUMN_BITMASK);

		_finderPathCountByG_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_R",
			new String[] {Long.class.getName(), Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(UsuarioImpl.class.getName());
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
				"value.object.column.bitmask.enabled.mx.com.cuervo.rutas.model.Usuario"),
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

	private static final String _SQL_SELECT_USUARIO =
		"SELECT usuario FROM Usuario usuario";

	private static final String _SQL_SELECT_USUARIO_WHERE =
		"SELECT usuario FROM Usuario usuario WHERE ";

	private static final String _SQL_COUNT_USUARIO =
		"SELECT COUNT(usuario) FROM Usuario usuario";

	private static final String _SQL_COUNT_USUARIO_WHERE =
		"SELECT COUNT(usuario) FROM Usuario usuario WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "usuario.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Usuario exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Usuario exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UsuarioPersistenceImpl.class);

	static {
		try {
			Class.forName(CPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}