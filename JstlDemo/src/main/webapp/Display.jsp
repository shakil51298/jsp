<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<c:forEach items="${students}" var="s">
	${s.name} <br>
	${s.rollNum} <br>
	</c:forEach>
	<!-- var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/login" user="root" password="" -->
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/login" user="root" password="" />
	<sql:query var="rs" dataSource="${db}">
				select * from user_info 
		</sql:query>
	<c:forEach items="${rs.rows}" var="user">
		<br>
		<c:out value="${user.Email}"></c:out> :
			
		<c:out value="${user.pass}"></c:out>
	</c:forEach>















</body>
</html>