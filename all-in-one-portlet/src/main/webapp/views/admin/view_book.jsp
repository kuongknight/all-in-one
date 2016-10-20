<%@ include file="init.jsp" %>
<portlet:renderURL var="editBookURL">
	<portlet:param name="tabLink" value="<%=tabLink %>"/>
	<portlet:param name="mvcPath" value="/views/admin/edit_book.jsp"/>
</portlet:renderURL>
<div class="category-buttons">
	<aui:button name="edit" value="edit" href="<%=editBookURL %>"></aui:button>
	<aui:button name="delete" value="delete"></aui:button>
</div>
