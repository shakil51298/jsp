<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Videos page honey</h1>
	<%
	if (request.getAttribute("username") == null && request.getAttribute("password") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/4QSlg-tfr5M"
		title="YouTube video player" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>
</body>
</html>