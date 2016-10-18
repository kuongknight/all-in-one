<%@page import="com.kuongbk.search.BookDisplayTerms"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="../init.jsp" %>
<%
	String tabLink = ParamUtil.getString(request, "book");
	PortletURL portletURL = renderResponse.createRenderURL();
	BookDisplayTerms displayTerms = new BookDisplayTerms(request);
%>
<aui:nav-bar>
	<aui:nav>
		<%portletURL.setParameter("tabLink", "book"); %>
		<aui:nav-item cssClass="active" selected="true" label="book" href="<%=portletURL.toString() %>" />
		<%portletURL.setParameter("tabLink", "author"); %>
		<aui:nav-item label="author" href="<%=portletURL.toString() %>"/>
	</aui:nav>
	<aui:nav-bar-search cssClass="pull-right">
		<liferay-ui:search-toggle
			autoFocus="<%= liferayPortletRequest.getWindowState().equals(WindowState.MAXIMIZED) %>"
			buttonLabel="search"
			displayTerms="<%= displayTerms %>"
			id="<%= renderResponse.getNamespace() %>"
		>
			<aui:fieldset>
				<aui:input name="<%= displayTerms.NAME %>" size="20" type="text" value="<%= displayTerms.getName() %>" />
				<aui:input name="<%= displayTerms.GROUP_ID %>" size="20" type="text" value="<%= displayTerms.getGroupId() %>" />

			</aui:fieldset>
		</liferay-ui:search-toggle>
	</aui:nav-bar-search>
</aui:nav-bar>