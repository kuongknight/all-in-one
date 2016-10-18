package com.kuongbk.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AuthorService}.
 *
 * @author Brian Wing Shun Chan
 * @see AuthorService
 * @generated
 */
public class AuthorServiceWrapper implements AuthorService,
    ServiceWrapper<AuthorService> {
    private AuthorService _authorService;

    public AuthorServiceWrapper(AuthorService authorService) {
        _authorService = authorService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _authorService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _authorService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _authorService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AuthorService getWrappedAuthorService() {
        return _authorService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAuthorService(AuthorService authorService) {
        _authorService = authorService;
    }

    @Override
    public AuthorService getWrappedService() {
        return _authorService;
    }

    @Override
    public void setWrappedService(AuthorService authorService) {
        _authorService = authorService;
    }
}
