<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String userName = request.getParameter("name");
		pageContext.setAttribute("pageContextName", userName);
		if (userName != null && userName != "") {
			session.setAttribute("sessionUserName", userName);
			application.setAttribute("ApplicationUserName", userName);
			//pageContext.findAttribute("name");
		}
	%>
	The user in request object is :
	<%=userName%>
	<br> The user in session object is :
	<%=session.getAttribute("sessionUserName")%>
	<br> The user in the application object is:
	<%=application.getAttribute("ApplicationUserName")%>
	<br> The user in the Page context object is:
	<%=pageContext.getAttribute("pageContextName")%>


</body>
</html>