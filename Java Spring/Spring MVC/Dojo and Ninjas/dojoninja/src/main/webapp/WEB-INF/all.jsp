<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>${one_dojo.name} Ninjas</h1>
<table border="1">	
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
	</tr>
	<c:forEach var="o" items="${one_dojo.ninjas}">
	<tr>
	<td>${o.firstName}</td>
	<td>${o.lastName}</td>
	<td>${o.age}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>