package com.kuongbk.service.persistence;

import com.kuongbk.model.Author;

import com.kuongbk.service.AuthorLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AuthorActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AuthorActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AuthorLocalServiceUtil.getService());
        setClass(Author.class);

        setClassLoader(com.kuongbk.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("authorId");
    }
}
