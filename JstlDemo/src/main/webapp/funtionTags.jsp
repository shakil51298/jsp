<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="Shakil Khan is a good boy"></c:set>
length: ${fn:length(str)} <!-- funtions -->

<c:forEach items="${fn:split(str, ' ')}" var="s">
	<br> ${s}
</c:forEach>

<c:set value="My Name is Shakil Khan, i read in class cst" var="strs"></c:set>
<c:if test="${fn:contains(strs , 'classss')}">
	${"u are right"}
</c:if>
<c:out value="${fn:toUpperCase(strs)}"></c:out>
${fn:replace(strs, "Name", "hello")}  



</body>
</html>