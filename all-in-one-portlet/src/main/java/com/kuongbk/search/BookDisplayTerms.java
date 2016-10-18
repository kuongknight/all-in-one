package com.kuongbk.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.servlet.http.HttpServletRequest;

public class BookDisplayTerms extends DisplayTerms{

	public static final String NAME = "name";

	public static final String GROUP_ID = "groupId";
	protected String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	protected long groupId;
	
	public BookDisplayTerms(HttpServletRequest request) {
		super(request);
		name = ParamUtil.getString(request, NAME);
		groupId = ParamUtil.getLong(request, GROUP_ID);
	}

}
