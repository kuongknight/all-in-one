<%@ include file="../init.jsp" %>
<%
String tabLink = ParamUtil.getString(request, "tabLink","book");
PortletURL portletURL = renderResponse.createRenderURL();
%>