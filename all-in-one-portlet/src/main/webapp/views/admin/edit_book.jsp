<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.kuongbk.permissions.AllOnePortletPermission"%>
<%@page import="com.kuongbk.service.BookLocalServiceUtil"%>
<%@page import="com.kuongbk.model.Book"%>
<%@ include file="init.jsp" %>
<%
	long bookId = ParamUtil.getLong(request, "bookId");
	Book book = null;
	if(bookId != 0){
		book = BookLocalServiceUtil.fetchBook(bookId);
	}
	System.out.println(AllOnePortletPermission.contains(permissionChecker, PortalUtil.getScopeGroupId(request), "ADD_AUTHOR"));
%>
<liferay-util:include page="/views/admin/toolbar.jsp" servletContext="<%=this.getServletContext() %>" />
<div class="edit-book-form">
	<portlet:actionURL name="editBook" var="editBookURL"></portlet:actionURL>
	<aui:form action="<%=editBookURL %>">
	<aui:model-context bean="<%=book %>" model="<%=Book.class %>"></aui:model-context>
		<aui:input name="bookId" type="hidden"></aui:input>
		<aui:input name="name"></aui:input>
		<aui:input name="description"></aui:input>
		<aui:input name="publishDate"></aui:input>
		<liferay-ui:asset-categories-error />
		<liferay-ui:asset-tags-error />
		<liferay-ui:panel defaultState="closed" extended="<%= false %>" id="bookCategorizationPanel" persistState="<%= true %>" title="categorization">
		    <aui:fieldset>
		        <aui:input name="categories" type="assetCategories" />
		        <aui:input name="tags" type="assetTags" />
		     </aui:fieldset>
		</liferay-ui:panel>
		<liferay-ui:panel defaultState="closed" extended="<%= false %>" id="bookAssetLinksPanel" persistState="<%= true %>" title="related-assets">
		    <aui:fieldset>
		        <liferay-ui:input-asset-links
		            className="<%= Book.class.getName() %>"
		            classPK="<%= bookId %>"
		        />
		    </aui:fieldset>
		</liferay-ui:panel>
		<aui:field-wrapper label="permissions">
			<liferay-ui:input-permissions
			    modelName="<%= Book.class.getName() %>"
			/>
		</aui:field-wrapper>
		<aui:button-row>
			<aui:button type="submit" value="submit"></aui:button>
			<aui:button type="button" value="draft"></aui:button>
		</aui:button-row>
	</aui:form>
</div>