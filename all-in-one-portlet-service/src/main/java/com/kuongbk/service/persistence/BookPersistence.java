package com.kuongbk.service.persistence;

import com.kuongbk.model.Book;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookPersistenceImpl
 * @see BookUtil
 * @generated
 */
public interface BookPersistence extends BasePersistence<Book> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BookUtil} to access the book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the books where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.kuongbk.model.Book> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book findByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book findByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.kuongbk.model.Book[] findByUuid_PrevAndNext(long bookId,
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the books where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of books where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book where uuid = &#63; and groupId = &#63; or throws a {@link com.kuongbk.NoSuchBookException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book findByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByUUID_G(java.lang.String uuid,
        long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the book where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the book that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book removeByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of books where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the books where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.kuongbk.model.Book> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.kuongbk.model.Book findByUuid_C_First(java.lang.String uuid,
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByUuid_C_First(java.lang.String uuid,
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.kuongbk.model.Book findByUuid_C_Last(java.lang.String uuid,
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByUuid_C_Last(java.lang.String uuid,
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.kuongbk.model.Book[] findByUuid_C_PrevAndNext(long bookId,
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the books where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of books where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the books where status = &#63;.
    *
    * @param status the status
    * @return the matching books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.kuongbk.model.Book> findByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findByStatus(int status,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findByStatus(int status,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book findByStatus_First(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByStatus_First(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book
    * @throws com.kuongbk.NoSuchBookException if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book findByStatus_Last(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last book in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching book, or <code>null</code> if a matching book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByStatus_Last(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.kuongbk.model.Book[] findByStatus_PrevAndNext(long bookId,
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the books where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of books where status = &#63;.
    *
    * @param status the status
    * @return the number of matching books
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the book in the entity cache if it is enabled.
    *
    * @param book the book
    */
    public void cacheResult(com.kuongbk.model.Book book);

    /**
    * Caches the books in the entity cache if it is enabled.
    *
    * @param books the books
    */
    public void cacheResult(java.util.List<com.kuongbk.model.Book> books);

    /**
    * Creates a new book with the primary key. Does not add the book to the database.
    *
    * @param bookId the primary key for the new book
    * @return the new book
    */
    public com.kuongbk.model.Book create(long bookId);

    /**
    * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookId the primary key of the book
    * @return the book that was removed
    * @throws com.kuongbk.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book remove(long bookId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.kuongbk.model.Book updateImpl(com.kuongbk.model.Book book)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book with the primary key or throws a {@link com.kuongbk.NoSuchBookException} if it could not be found.
    *
    * @param bookId the primary key of the book
    * @return the book
    * @throws com.kuongbk.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book findByPrimaryKey(long bookId)
        throws com.kuongbk.NoSuchBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bookId the primary key of the book
    * @return the book, or <code>null</code> if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.kuongbk.model.Book fetchByPrimaryKey(long bookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the books.
    *
    * @return the books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.kuongbk.model.Book> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Book> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the books from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of books.
    *
    * @return the number of books
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the authors associated with the book.
    *
    * @param pk the primary key of the book
    * @return the authors associated with the book
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.kuongbk.model.Author> getAuthors(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Author> getAuthors(long pk,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.kuongbk.model.Author> getAuthors(long pk,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of authors associated with the book.
    *
    * @param pk the primary key of the book
    * @return the number of authors associated with the book
    * @throws SystemException if a system exception occurred
    */
    public int getAuthorsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the author is associated with the book.
    *
    * @param pk the primary key of the book
    * @param authorPK the primary key of the author
    * @return <code>true</code> if the author is associated with the book; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsAuthor(long pk, long authorPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the book has any authors associated with it.
    *
    * @param pk the primary key of the book to check for associations with authors
    * @return <code>true</code> if the book has any authors associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsAuthors(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPK the primary key of the author
    * @throws SystemException if a system exception occurred
    */
    public void addAuthor(long pk, long authorPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param author the author
    * @throws SystemException if a system exception occurred
    */
    public void addAuthor(long pk, com.kuongbk.model.Author author)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPKs the primary keys of the authors
    * @throws SystemException if a system exception occurred
    */
    public void addAuthors(long pk, long[] authorPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authors the authors
    * @throws SystemException if a system exception occurred
    */
    public void addAuthors(long pk,
        java.util.List<com.kuongbk.model.Author> authors)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the book and its authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book to clear the associated authors from
    * @throws SystemException if a system exception occurred
    */
    public void clearAuthors(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPK the primary key of the author
    * @throws SystemException if a system exception occurred
    */
    public void removeAuthor(long pk, long authorPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param author the author
    * @throws SystemException if a system exception occurred
    */
    public void removeAuthor(long pk, com.kuongbk.model.Author author)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPKs the primary keys of the authors
    * @throws SystemException if a system exception occurred
    */
    public void removeAuthors(long pk, long[] authorPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authors the authors
    * @throws SystemException if a system exception occurred
    */
    public void removeAuthors(long pk,
        java.util.List<com.kuongbk.model.Author> authors)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authorPKs the primary keys of the authors to be associated with the book
    * @throws SystemException if a system exception occurred
    */
    public void setAuthors(long pk, long[] authorPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the book
    * @param authors the authors to be associated with the book
    * @throws SystemException if a system exception occurred
    */
    public void setAuthors(long pk,
        java.util.List<com.kuongbk.model.Author> authors)
        throws com.liferay.portal.kernel.exception.SystemException;
}
