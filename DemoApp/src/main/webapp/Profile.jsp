<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

 	String Driver = "com.mysql.jdbc.Driver" ; 
	String url = "jdbc:mysql://localhost:3306/login" ; 
	String username = "root" ; 
	String password = "" ; 
	String sq = "select * from user_info where id = 2" ; 
	Class.forName(Driver) ;
	Connection conn = DriverManager.getConnection(url , username, password) ;
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery(sq); 
	rs.next() ; 
%>

<table bgcolor="yellow">
	<thead>Result from Database</thead>
	<td>id: <%= rs.getString(1) %></td>
	<td>email: <%= rs.getString(2) %></td>
	<td>Pass: <%= rs.getString(3) %></td>
</table>
</body>
</html>