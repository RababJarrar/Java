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
<table border="1">	
	<tr>
	<th>Name</th>
	<th>Creator</th>
	<th>Version</th>
	<th>Actions</th>
	</tr>
	<c:forEach var="one" items="${languages}">
	<tr>
	<td><a href="/languages/${one.id}">${one.name}</a></td>
	<td>${one.creator}</td>
	<td>${one.version}</td>
	<td>
    <a href="/languages/delete/${one.id}"> delete</a>
	<a href="/languages/edit/${one.id}"> edit</a>
	</td>
	</tr>
	</c:forEach>
</table>
<form:form action="/createlang" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
     <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>     
        <form:input path="version"/>
    </p> 
   
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>