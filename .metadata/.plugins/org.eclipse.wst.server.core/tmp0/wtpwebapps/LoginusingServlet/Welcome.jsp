<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is Welcome page honey!!!</h1>
	<!-- Session management to authentication -->
	<%
	// prevent back button after logout
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma" ,"no-cache"); // http v: 1.0
	response.setHeader("Expires", "0"); // for proxy server
	 
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	welcome ${username}
	<a href="Videos.jsp">Videos here</a>
	
	<!-- logout funtionality -->
	<form action="Logout">
	<br>
		<input type="submit" value="logOut">
	</form>
</body>
</html>