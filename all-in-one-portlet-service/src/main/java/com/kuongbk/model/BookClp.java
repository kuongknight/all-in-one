package com.kuongbk.model;

import com.kuongbk.service.BookLocalServiceUtil;
import com.kuongbk.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BookClp extends BaseModelImpl<Book> implements Book {
    private String _uuid;
    private long _bookId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _description;
    private Date _publishDate;
    private int _status;
    private int _viewCount;
    private BaseModel<?> _bookRemoteModel;
    private Class<?> _clpSerializerClass = com.kuongbk.service.ClpSerializer.class;

    public BookClp() {
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_bookRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBookId() {
        return _bookId;
    }

    @Override
    public void setBookId(long bookId) {
        _bookId = bookId;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setBookId", long.class);

                method.invoke(_bookRemoteModel, bookId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_bookRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_bookRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_bookRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_bookRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_bookRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_bookRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_bookRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_bookRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPublishDate() {
        return _publishDate;
    }

    @Override
    public void setPublishDate(Date publishDate) {
        _publishDate = publishDate;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setPublishDate", Date.class);

                method.invoke(_bookRemoteModel, publishDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_bookRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getViewCount() {
        return _viewCount;
    }

    @Override
    public void setViewCount(int viewCount) {
        _viewCount = viewCount;

        if (_bookRemoteModel != null) {
            try {
                Class<?> clazz = _bookRemoteModel.getClass();

                Method method = clazz.getMethod("setViewCount", int.class);

                method.invoke(_bookRemoteModel, viewCount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Book.class.getName()));
    }

    public BaseModel<?> getBookRemoteModel() {
        return _bookRemoteModel;
    }

    public void setBookRemoteModel(BaseModel<?> bookRemoteModel) {
        _bookRemoteModel = bookRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _bookRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_bookRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BookLocalServiceUtil.addBook(this);
        } else {
            BookLocalServiceUtil.updateBook(this);
        }
    }

    @Override
    public Book toEscapedModel() {
        return (Book) ProxyUtil.newProxyInstance(Book.class.getClassLoader(),
            new Class[] { Book.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BookClp clone = new BookClp();

        clone.setUuid(getUuid());
        clone.setBookId(getBookId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setName(getName());
        clone.setDescription(getDescription());
        clone.setPublishDate(getPublishDate());
        clone.setStatus(getStatus());
        clone.setViewCount(getViewCount());

        return clone;
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

        if (!(obj instanceof BookClp)) {
            return false;
        }

        BookClp book = (BookClp) obj;

        long primaryKey = book.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
