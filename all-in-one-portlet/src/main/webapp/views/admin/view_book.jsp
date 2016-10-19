<%@page import="com.kuongbk.service.BookLocalServiceUtil"%>
<%@page import="com.kuongbk.model.Book"%>
<%@ include file="init.jsp" %>
<%
	long bookId = ParamUtil.getLong(request, "bookId");
	Book book = BookLocalServiceUtil.fetchBook(bookId);
%>
<div class="category-buttons">
	<aui:button name="edit" value="edit"></aui:button>
	<aui:button name="permission" value="permission"></aui:button>
</div>
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
		<liferay-ui:panel defaultState="closed" extended="<%= false %>" id="insultsCategorizationPanel" persistState="<%= true %>" title="categorization">
		    <aui:fieldset>
		        <aui:input name="categories" type="assetCategories" />
		        <aui:input name="tags" type="assetTags" />
		     </aui:fieldset>
		</liferay-ui:panel>
		<aui:button-row>
			<aui:button type="subit" value="submit"></aui:button>
			<aui:button type="button" value="draft"></aui:button>
		</aui:button-row>
	</aui:form>
</div>