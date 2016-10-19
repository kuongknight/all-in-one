package com.kuongbk.portlet.book;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class BookAdminPortlet extends MVCPortlet{
	public void editBook(ActionRequest actionRequest, ActionResponse actionResponse){
		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
	}

}
