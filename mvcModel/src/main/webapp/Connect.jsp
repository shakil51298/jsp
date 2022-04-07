<%@page import="java.sql.*"%>
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
	String Driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/login";
	String username = "root";
	String password = "";
	String sq = "select * from user_info where id = 2";
	// 1st step 
	Class.forName(Driver);
	// second
	Connection conn = DriverManager.getConnection(url, username, password);
	// third
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery(sq);
	rs.next();
	%>
		Id :
		<%=rs.getString(1)%>
		<br> Email :
		<%=rs.getString(2)%>
		<br> Password :
		<%=rs.getString(3)%>
		<br>


</body>
</html>