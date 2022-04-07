<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome honey</h1>
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache"); // http v: 1.0
	response.setHeader("Expires", "0"); // for proxy server

	if (session.getAttribute("username") == null) {
		response.sendRedirect("Login.jsp");
	}
	%>
	welcome ${username}
	<a href="videos.jsp">Videos here</a>
	<form action="logout" method="get">
		<br> <input type="submit" value="logOut">
	</form>
</body>
</html>