package com.kuongbk.permissions;

import com.kuongbk.model.Book;
import com.kuongbk.service.BookLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class BookPermission {
	public static void check(PermissionChecker permissionChecker,
            long guestbookId, String actionId) throws PortalException,
            SystemException {

        if (!contains(permissionChecker, guestbookId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(PermissionChecker permissionChecker,
            long bookId, String actionId) throws PortalException,
            SystemException {

        Book guestbook = BookLocalServiceUtil.getBook(bookId);
        return permissionChecker
                .hasPermission(guestbook.getGroupId(),
                		Book.class.getName(), guestbook.getBookId(),
                        actionId);

    }
}
