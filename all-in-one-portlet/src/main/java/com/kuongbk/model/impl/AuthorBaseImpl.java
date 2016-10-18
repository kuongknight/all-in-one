package com.kuongbk.model.impl;

import com.kuongbk.model.Author;

import com.kuongbk.service.AuthorLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Author service. Represents a row in the &quot;MTT_Author&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuthorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuthorImpl
 * @see com.kuongbk.model.Author
 * @generated
 */
public abstract class AuthorBaseImpl extends AuthorModelImpl implements Author {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a author model instance should use the {@link Author} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AuthorLocalServiceUtil.addAuthor(this);
        } else {
            AuthorLocalServiceUtil.updateAuthor(this);
        }
    }
}