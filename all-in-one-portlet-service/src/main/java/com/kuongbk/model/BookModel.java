package com.kuongbk.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Book service. Represents a row in the &quot;MTT_Book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.kuongbk.model.impl.BookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.kuongbk.model.impl.BookImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Book
 * @see com.kuongbk.model.impl.BookImpl
 * @see com.kuongbk.model.impl.BookModelImpl
 * @generated
 */
public interface BookModel extends BaseModel<Book>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a book model instance should use the {@link Book} interface instead.
     */

    /**
     * Returns the primary key of this book.
     *
     * @return the primary key of this book
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this book.
     *
     * @param primaryKey the primary key of this book
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this book.
     *
     * @return the uuid of this book
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this book.
     *
     * @param uuid the uuid of this book
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the book ID of this book.
     *
     * @return the book ID of this book
     */
    public long getBookId();

    /**
     * Sets the book ID of this book.
     *
     * @param bookId the book ID of this book
     */
    public void setBookId(long bookId);

    /**
     * Returns the group ID of this book.
     *
     * @return the group ID of this book
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this book.
     *
     * @param groupId the group ID of this book
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this book.
     *
     * @return the company ID of this book
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this book.
     *
     * @param companyId the company ID of this book
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this book.
     *
     * @return the user ID of this book
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this book.
     *
     * @param userId the user ID of this book
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this book.
     *
     * @return the user uuid of this book
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this book.
     *
     * @param userUuid the user uuid of this book
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this book.
     *
     * @return the user name of this book
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this book.
     *
     * @param userName the user name of this book
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this book.
     *
     * @return the create date of this book
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this book.
     *
     * @param createDate the create date of this book
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this book.
     *
     * @return the modified date of this book
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this book.
     *
     * @param modifiedDate the modified date of this book
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the name of this book.
     *
     * @return the name of this book
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this book.
     *
     * @param name the name of this book
     */
    public void setName(String name);

    /**
     * Returns the description of this book.
     *
     * @return the description of this book
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this book.
     *
     * @param description the description of this book
     */
    public void setDescription(String description);

    /**
     * Returns the publish date of this book.
     *
     * @return the publish date of this book
     */
    public Date getPublishDate();

    /**
     * Sets the publish date of this book.
     *
     * @param publishDate the publish date of this book
     */
    public void setPublishDate(Date publishDate);

    /**
     * Returns the status of this book.
     *
     * @return the status of this book
     */
    public int getStatus();

    /**
     * Sets the status of this book.
     *
     * @param status the status of this book
     */
    public void setStatus(int status);

    /**
     * Returns the view count of this book.
     *
     * @return the view count of this book
     */
    public int getViewCount();

    /**
     * Sets the view count of this book.
     *
     * @param viewCount the view count of this book
     */
    public void setViewCount(int viewCount);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.kuongbk.model.Book book);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.kuongbk.model.Book> toCacheModel();

    @Override
    public com.kuongbk.model.Book toEscapedModel();

    @Override
    public com.kuongbk.model.Book toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
