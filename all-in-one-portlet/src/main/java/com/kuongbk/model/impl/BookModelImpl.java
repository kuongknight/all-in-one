package com.kuongbk.model.impl;

import com.kuongbk.model.Book;
import com.kuongbk.model.BookModel;
import com.kuongbk.model.BookSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Book service. Represents a row in the &quot;MTT_Book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.kuongbk.model.BookModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BookImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookImpl
 * @see com.kuongbk.model.Book
 * @see com.kuongbk.model.BookModel
 * @generated
 */
@JSON(strict = true)
public class BookModelImpl extends BaseModelImpl<Book> implements BookModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a book model instance should use the {@link com.kuongbk.model.Book} interface instead.
     */
    public static final String TABLE_NAME = "MTT_Book";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "bookId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "name", Types.VARCHAR },
            { "description", Types.VARCHAR },
            { "publishDate", Types.TIMESTAMP },
            { "status", Types.INTEGER },
            { "viewCount", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table MTT_Book (uuid_ VARCHAR(75) null,bookId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,description VARCHAR(75) null,publishDate DATE null,status INTEGER,viewCount INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table MTT_Book";
    public static final String ORDER_BY_JPQL = " ORDER BY book.createDate ASC";
    public static final String ORDER_BY_SQL = " ORDER BY MTT_Book.createDate ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.kuongbk.model.Book"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.kuongbk.model.Book"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.kuongbk.model.Book"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long STATUS_COLUMN_BITMASK = 4L;
    public static long UUID_COLUMN_BITMASK = 8L;
    public static long CREATEDATE_COLUMN_BITMASK = 16L;
    public static final String MAPPING_TABLE_MTT_BOOK_AUTHOR_NAME = "MTT_book_author";
    public static final Object[][] MAPPING_TABLE_MTT_BOOK_AUTHOR_COLUMNS = {
            { "bookId", Types.BIGINT },
            { "authorId", Types.BIGINT }
        };
    public static final String MAPPING_TABLE_MTT_BOOK_AUTHOR_SQL_CREATE = "create table MTT_book_author (authorId LONG not null,bookId LONG not null,primary key (authorId, bookId))";
    public static final boolean FINDER_CACHE_ENABLED_MTT_BOOK_AUTHOR = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.MTT_book_author"), true);
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.kuongbk.model.Book"));
    private static ClassLoader _classLoader = Book.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Book.class };
    private String _uuid;
    private String _originalUuid;
    private long _bookId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _description;
    private Date _publishDate;
    private int _status;
    private int _originalStatus;
    private boolean _setOriginalStatus;
    private int _viewCount;
    private long _columnBitmask;
    private Book _escapedModel;

    public BookModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Book toModel(BookSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Book model = new BookImpl();

        model.setUuid(soapModel.getUuid());
        model.setBookId(soapModel.getBookId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setName(soapModel.getName());
        model.setDescription(soapModel.getDescription());
        model.setPublishDate(soapModel.getPublishDate());
        model.setStatus(soapModel.getStatus());
        model.setViewCount(soapModel.getViewCount());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Book> toModels(BookSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Book> models = new ArrayList<Book>(soapModels.length);

        for (BookSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _bookId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBookId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bookId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Book.class;
    }

    @Override
    public String getModelClassName() {
        return Book.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("bookId", getBookId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("description", getDescription());
        attributes.put("publishDate", getPublishDate());
        attributes.put("status", getStatus());
        attributes.put("viewCount", getViewCount());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long bookId = (Long) attributes.get("bookId");

        if (bookId != null) {
            setBookId(bookId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Date publishDate = (Date) attributes.get("publishDate");

        if (publishDate != null) {
            setPublishDate(publishDate);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Integer viewCount = (Integer) attributes.get("viewCount");

        if (viewCount != null) {
            setViewCount(viewCount);
        }
    }

    @JSON
    @Override
    public String getUuid() {
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @JSON
    @Override
    public long getBookId() {
        return _bookId;
    }

    @Override
    public void setBookId(long bookId) {
        _bookId = bookId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _columnBitmask |= COMPANYID_COLUMN_BITMASK;

        if (!_setOriginalCompanyId) {
            _setOriginalCompanyId = true;

            _originalCompanyId = _companyId;
        }

        _companyId = companyId;
    }

    public long getOriginalCompanyId() {
        return _originalCompanyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _columnBitmask = -1L;

        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @JSON
    @Override
    public Date getPublishDate() {
        return _publishDate;
    }

    @Override
    public void setPublishDate(Date publishDate) {
        _publishDate = publishDate;
    }

    @JSON
    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _columnBitmask |= STATUS_COLUMN_BITMASK;

        if (!_setOriginalStatus) {
            _setOriginalStatus = true;

            _originalStatus = _status;
        }

        _status = status;
    }

    public int getOriginalStatus() {
        return _originalStatus;
    }

    @JSON
    @Override
    public int getViewCount() {
        return _viewCount;
    }

    @Override
    public void setViewCount(int viewCount) {
        _viewCount = viewCount;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Book.class.getName()));
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Book.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Book toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Book) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BookImpl bookImpl = new BookImpl();

        bookImpl.setUuid(getUuid());
        bookImpl.setBookId(getBookId());
        bookImpl.setGroupId(getGroupId());
        bookImpl.setCompanyId(getCompanyId());
        bookImpl.setUserId(getUserId());
        bookImpl.setUserName(getUserName());
        bookImpl.setCreateDate(getCreateDate());
        bookImpl.setModifiedDate(getModifiedDate());
        bookImpl.setName(getName());
        bookImpl.setDescription(getDescription());
        bookImpl.setPublishDate(getPublishDate());
        bookImpl.setStatus(getStatus());
        bookImpl.setViewCount(getViewCount());

        bookImpl.resetOriginalValues();

        return bookImpl;
    }

    @Override
    public int compareTo(Book book) {
        int value = 0;

        value = DateUtil.compareTo(getCreateDate(), book.getCreateDate());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;

        long primaryKey = book.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        BookModelImpl bookModelImpl = this;

        bookModelImpl._originalUuid = bookModelImpl._uuid;

        bookModelImpl._originalGroupId = bookModelImpl._groupId;

        bookModelImpl._setOriginalGroupId = false;

        bookModelImpl._originalCompanyId = bookModelImpl._companyId;

        bookModelImpl._setOriginalCompanyId = false;

        bookModelImpl._originalStatus = bookModelImpl._status;

        bookModelImpl._setOriginalStatus = false;

        bookModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Book> toCacheModel() {
        BookCacheModel bookCacheModel = new BookCacheModel();

        bookCacheModel.uuid = getUuid();

        String uuid = bookCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            bookCacheModel.uuid = null;
        }

        bookCacheModel.bookId = getBookId();

        bookCacheModel.groupId = getGroupId();

        bookCacheModel.companyId = getCompanyId();

        bookCacheModel.userId = getUserId();

        bookCacheModel.userName = getUserName();

        String userName = bookCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            bookCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            bookCacheModel.createDate = createDate.getTime();
        } else {
            bookCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            bookCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            bookCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        bookCacheModel.name = getName();

        String name = bookCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            bookCacheModel.name = null;
        }

        bookCacheModel.description = getDescription();

        String description = bookCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            bookCacheModel.description = null;
        }

        Date publishDate = getPublishDate();

        if (publishDate != null) {
            bookCacheModel.publishDate = publishDate.getTime();
        } else {
            bookCacheModel.publishDate = Long.MIN_VALUE;
        }

        bookCacheModel.status = getStatus();

        bookCacheModel.viewCount = getViewCount();

        return bookCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", bookId=");
        sb.append(getBookId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", publishDate=");
        sb.append(getPublishDate());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", viewCount=");
        sb.append(getViewCount());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.kuongbk.model.Book");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bookId</column-name><column-value><![CDATA[");
        sb.append(getBookId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>publishDate</column-name><column-value><![CDATA[");
        sb.append(getPublishDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>viewCount</column-name><column-value><![CDATA[");
        sb.append(getViewCount());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
