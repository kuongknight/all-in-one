package com.kuongbk.model.impl;

import com.kuongbk.model.Book;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Book in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Book
 * @generated
 */
public class BookCacheModel implements CacheModel<Book>, Externalizable {
    public String uuid;
    public long bookId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String description;
    public long publishDate;
    public int status;
    public int viewCount;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", bookId=");
        sb.append(bookId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", description=");
        sb.append(description);
        sb.append(", publishDate=");
        sb.append(publishDate);
        sb.append(", status=");
        sb.append(status);
        sb.append(", viewCount=");
        sb.append(viewCount);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Book toEntityModel() {
        BookImpl bookImpl = new BookImpl();

        if (uuid == null) {
            bookImpl.setUuid(StringPool.BLANK);
        } else {
            bookImpl.setUuid(uuid);
        }

        bookImpl.setBookId(bookId);
        bookImpl.setGroupId(groupId);
        bookImpl.setCompanyId(companyId);
        bookImpl.setUserId(userId);

        if (userName == null) {
            bookImpl.setUserName(StringPool.BLANK);
        } else {
            bookImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            bookImpl.setCreateDate(null);
        } else {
            bookImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            bookImpl.setModifiedDate(null);
        } else {
            bookImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            bookImpl.setName(StringPool.BLANK);
        } else {
            bookImpl.setName(name);
        }

        if (description == null) {
            bookImpl.setDescription(StringPool.BLANK);
        } else {
            bookImpl.setDescription(description);
        }

        if (publishDate == Long.MIN_VALUE) {
            bookImpl.setPublishDate(null);
        } else {
            bookImpl.setPublishDate(new Date(publishDate));
        }

        bookImpl.setStatus(status);
        bookImpl.setViewCount(viewCount);

        bookImpl.resetOriginalValues();

        return bookImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        bookId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        description = objectInput.readUTF();
        publishDate = objectInput.readLong();
        status = objectInput.readInt();
        viewCount = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(bookId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeLong(publishDate);
        objectOutput.writeInt(status);
        objectOutput.writeInt(viewCount);
    }
}
