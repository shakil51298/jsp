<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// prevent back button after logout for HTTP v: 1.1
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache"); // http v: 1.0
	response.setHeader("Expires", "0"); // for proxy server
	if (session.getAttribute("username") == null) {
		response.sendRedirect("Login.jsp");
	}
	%>



	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/-VADdBg6EtA"
		title="YouTube video player" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>

</body>
</html>