package com.kuongbk.model.impl;

import com.kuongbk.model.Author;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Author in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Author
 * @generated
 */
public class AuthorCacheModel implements CacheModel<Author>, Externalizable {
    public String uuid;
    public long authorId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String description;
    public long born;
    public Boolean male;
    public int status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", authorId=");
        sb.append(authorId);
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
        sb.append(", born=");
        sb.append(born);
        sb.append(", male=");
        sb.append(male);
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Author toEntityModel() {
        AuthorImpl authorImpl = new AuthorImpl();

        if (uuid == null) {
            authorImpl.setUuid(StringPool.BLANK);
        } else {
            authorImpl.setUuid(uuid);
        }

        authorImpl.setAuthorId(authorId);
        authorImpl.setGroupId(groupId);
        authorImpl.setCompanyId(companyId);
        authorImpl.setUserId(userId);

        if (userName == null) {
            authorImpl.setUserName(StringPool.BLANK);
        } else {
            authorImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            authorImpl.setCreateDate(null);
        } else {
            authorImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            authorImpl.setModifiedDate(null);
        } else {
            authorImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            authorImpl.setName(StringPool.BLANK);
        } else {
            authorImpl.setName(name);
        }

        if (description == null) {
            authorImpl.setDescription(StringPool.BLANK);
        } else {
            authorImpl.setDescription(description);
        }

        if (born == Long.MIN_VALUE) {
            authorImpl.setBorn(null);
        } else {
            authorImpl.setBorn(new Date(born));
        }

        authorImpl.setMale(male);
        authorImpl.setStatus(status);

        authorImpl.resetOriginalValues();

        return authorImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        authorId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        description = objectInput.readUTF();
        born = objectInput.readLong();
        male = objectInput.readBoolean();
        status = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(authorId);
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

        objectOutput.writeLong(born);
        objectOutput.writeBoolean(male);
        objectOutput.writeInt(status);
    }
}
