<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.kuongbk.permissions.BookPermission"%>
<%@page import="com.kuongbk.model.Book"%>
<%@ include file="init.jsp" %>
<c:choose>
	<c:when test='<%=tabLink.equals("book") %>'>
		<liferay-util:include page="/views/admin/view_book.jsp" servletContext="<%=this.getServletContext() %>" />
	</c:when>
	<c:when test='<%=tabLink.equals("author") %>'>
		<liferay-util:include page="/views/admin/view_author.jsp" servletContext="<%=this.getServletContext() %>" />
	</c:when>
	<c:otherwise>
		<liferay-util:include page="/views/admin/view_book.jsp" servletContext="<%=this.getServletContext() %>" />
	</c:otherwise>
</c:choose>
