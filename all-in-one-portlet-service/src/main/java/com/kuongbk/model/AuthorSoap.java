package com.kuongbk.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.kuongbk.service.http.AuthorServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.kuongbk.service.http.AuthorServiceSoap
 * @generated
 */
public class AuthorSoap implements Serializable {
    private String _uuid;
    private long _authorId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _description;
    private Date _born;
    private Boolean _male;
    private int _status;

    public AuthorSoap() {
    }

    public static AuthorSoap toSoapModel(Author model) {
        AuthorSoap soapModel = new AuthorSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setAuthorId(model.getAuthorId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setDescription(model.getDescription());
        soapModel.setBorn(model.getBorn());
        soapModel.setMale(model.getMale());
        soapModel.setStatus(model.getStatus());

        return soapModel;
    }

    public static AuthorSoap[] toSoapModels(Author[] models) {
        AuthorSoap[] soapModels = new AuthorSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AuthorSoap[][] toSoapModels(Author[][] models) {
        AuthorSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AuthorSoap[models.length][models[0].length];
        } else {
            soapModels = new AuthorSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AuthorSoap[] toSoapModels(List<Author> models) {
        List<AuthorSoap> soapModels = new ArrayList<AuthorSoap>(models.size());

        for (Author model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AuthorSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _authorId;
    }

    public void setPrimaryKey(long pk) {
        setAuthorId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getAuthorId() {
        return _authorId;
    }

    public void setAuthorId(long authorId) {
        _authorId = authorId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public Date getBorn() {
        return _born;
    }

    public void setBorn(Date born) {
        _born = born;
    }

    public Boolean getMale() {
        return _male;
    }

    public void setMale(Boolean male) {
        _male = male;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }
}
