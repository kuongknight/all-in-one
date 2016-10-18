package com.kuongbk.service.persistence;

import com.kuongbk.model.Book;

import com.kuongbk.service.BookLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BookLocalServiceUtil.getService());
        setClass(Book.class);

        setClassLoader(com.kuongbk.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bookId");
    }
}
