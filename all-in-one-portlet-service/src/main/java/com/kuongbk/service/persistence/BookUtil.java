package com.kuongbk.service.persistence;

import com.kuongbk.model.Book;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the book service. This utility wraps {@link BookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookPersistence
 * @see BookPersistenceImpl
 * @generated
 */
public class BookUtil {
    private static BookPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Book book) {
        getPersistence().clearCache(book);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Book update(Book book) throws SystemException {
        return getPersistence().update(book);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Book update(Book book, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(book, serviceContext);
    }

    /**
    * Returns all the books where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the books where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the books where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the books before and after the current book in the ordered set where uuid = &#63;.
    *
    * @param bookId the primary key of the current book
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next book
    * @throws com.kuongbk.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book[] findByUuid_PrevAndNext(long bookId,
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(bookId, uuid, orderByComparator);
    }

    /**
    * Removes all the books where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of books where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the book where uuid = &#63; and groupId = &#63; or throws a {@link com.kuongbk.NoSuchBookException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByUUID_G(java.lang.String uuid,
        long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the book where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the book that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book removeByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of books where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the books where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the books where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the books where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the books before and after the current book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param bookId the primary key of the current book
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next book
    * @throws com.kuongbk.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book[] findByUuid_C_PrevAndNext(
        long bookId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(bookId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the books where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of books where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the books where status = &#63;.
    *
    * @param status the status
    * @return the matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

    /**
    * Returns a range of all the books where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

    /**
    * Returns an ordered range of all the books where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByStatus_First(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByStatus_First(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByStatus_Last(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByStatus_Last(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the books before and after the current book in the ordered set where status = &#63;.
    *
    * @param bookId the primary key of the current book
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next book
    * @throws com.kuongbk.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book[] findByStatus_PrevAndNext(
        long bookId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus_PrevAndNext(bookId, status, orderByComparator);
    }

    /**
    * Removes all the books where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of books where status = &#63;.
    *
    * @param status the status
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Caches the book in the entity cache if it is enabled.
    *
    * @param book the book
    */
    public static void cacheResult(com.kuongbk.model.Book book) {
        getPersistence().cacheResult(book);
    }

    /**
    * Caches the books in the entity cache if it is enabled.
    *
    * @param books the books
    */
    public static void cacheResult(java.util.List<com.kuongbk.model.Book> books) {
        getPersistence().cacheResult(books);
    }

    /**
    * Creates a new book with the primary key. Does not add the book to the database.
    *
    * @param bookId the primary key for the new book
    * @return the new book
    */
    public static com.kuongbk.model.Book create(long bookId) {
        return getPersistence().create(bookId);
    }

    /**
    * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookId the primary key of the book
    * @return the book that was removed
    * @throws com.kuongbk.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book remove(long bookId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(bookId);
    }

    public static com.kuongbk.model.Book updateImpl(com.kuongbk.model.Book book)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(book);
    }

    /**
    * Returns the book with the primary key or throws a {@link com.kuongbk.NoSuchBookException} if it could not be found.
    *
    * @param bookId the primary key of the book
    * @return the book
    * @throws com.kuongbk.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book findByPrimaryKey(long bookId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(bookId);
    }

    /**
    * Returns the book with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bookId the primary key of the book
    * @return the book, or <code>null</code> if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.kuongbk.model.Book fetchByPrimaryKey(long bookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(bookId);
    }

    /**
    * Returns all the books.
    *
    * @return the books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Book> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the books from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of books.
    *
    * @return the number of books
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the authors associated with the book.
    *
    * @param pk the primary key of the book
    * @return the authors associated with the book
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Author> getAuthors(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getAuthors(pk);
    }

    /**
    * Returns a range of all the authors associated with the book.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the book
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of authors associated with the book
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Author> getAuthors(long pk,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getAuthors(pk, start, end);
    }

    /**
    * Returns an ordered range of all the authors associated with the book.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kuongbk.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the book
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of authors associated with the book
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.kuongbk.model.Author> getAuthors(long pk,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getAuthors(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of authors associated with the book.
    *
    * @param pk the primary key of the book
    * @return the number of authors associated with the book
    * @throws SystemException if a system exception occurred
    */
    public static int getAuthorsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getAuthorsSize(pk);
    }

    /**
    * Returns <code>true</code> if the author is associated with the book.
    *
    * @param pk the primary key of the book
    * @param authorPK the primary key of the author
    * @return <code>true</code> if the author is associated with the book; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsAuthor(long pk, long authorPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsAuthor(pk, authorPK);
    }

    /**
    * Returns <code>true</code> if the book has any authors associated with it.
    *
    * @param pk the primary key of the book to check for associations with authors
    * @return <code>true</code> if the book has any authors associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsAuthors(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsAuthors(pk);
    }

    /**
    * Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPK the primary key of the author
    * @throws SystemException if a system exception occurred
    */
    public static void addAuthor(long pk, long authorPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addAuthor(pk, authorPK);
    }

    /**
    * Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param author the author
    * @throws SystemException if a system exception occurred
    */
    public static void addAuthor(long pk, com.kuongbk.model.Author author)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addAuthor(pk, author);
    }

    /**
    * Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPKs the primary keys of the authors
    * @throws SystemException if a system exception occurred
    */
    public static void addAuthors(long pk, long[] authorPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addAuthors(pk, authorPKs);
    }

    /**
    * Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authors the authors
    * @throws SystemException if a system exception occurred
    */
    public static void addAuthors(long pk,
        java.util.List<com.kuongbk.model.Author> authors)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addAuthors(pk, authors);
    }

    /**
    * Clears all associations between the book and its authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book to clear the associated authors from
    * @throws SystemException if a system exception occurred
    */
    public static void clearAuthors(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearAuthors(pk);
    }

    /**
    * Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPK the primary key of the author
    * @throws SystemException if a system exception occurred
    */
    public static void removeAuthor(long pk, long authorPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAuthor(pk, authorPK);
    }

    /**
    * Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param author the author
    * @throws SystemException if a system exception occurred
    */
    public static void removeAuthor(long pk, com.kuongbk.model.Author author)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAuthor(pk, author);
    }

    /**
    * Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPKs the primary keys of the authors
    * @throws SystemException if a system exception occurred
    */
    public static void removeAuthors(long pk, long[] authorPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAuthors(pk, authorPKs);
    }

    /**
    * Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authors the authors
    * @throws SystemException if a system exception occurred
    */
    public static void removeAuthors(long pk,
        java.util.List<com.kuongbk.model.Author> authors)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAuthors(pk, authors);
    }

    /**
    * Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPKs the primary keys of the authors to be associated with the book
    * @throws SystemException if a system exception occurred
    */
    public static void setAuthors(long pk, long[] authorPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setAuthors(pk, authorPKs);
    }

    /**
    * Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authors the authors to be associated with the book
    * @throws SystemException if a system exception occurred
    */
    public static void setAuthors(long pk,
        java.util.List<com.kuongbk.model.Author> authors)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setAuthors(pk, authors);
    }

    public static BookPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BookPersistence) PortletBeanLocatorUtil.locate(com.kuongbk.service.ClpSerializer.getServletContextName(),
                    BookPersistence.class.getName());

            ReferenceRegistry.registerReference(BookUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BookPersistence persistence) {
    }
}
