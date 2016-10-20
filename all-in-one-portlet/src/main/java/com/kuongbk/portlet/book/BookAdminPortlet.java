package com.kuongbk.portlet.book;

import com.kuongbk.NoSuchBookException;
import com.kuongbk.model.Book;
import com.kuongbk.service.BookLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class BookAdminPortlet extends MVCPortlet {
	public void editBook(ActionRequest actionRequest, ActionResponse actionResponse) {
		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			Book book = BookLocalServiceUtil.updateBook(bookId, name, description, new Date(), serviceContext);
			actionRequest.setAttribute("book", book);

		} catch (Exception e) {
			if (e instanceof PortalException || e instanceof SystemException) {

			} else if (e instanceof NoSuchBookException) {

			}

		}
	}

}
