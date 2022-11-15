<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 class="welcome">Welcome  <c:out value="${currentUser.userName}"/></h2>
<a href="/logout">logout</a>
<form:form action="/projects/new" method="get">
     <input type="submit" value="+ new project"/>
</form:form>
     <p>All projects <p/>
     <table border="1">
	<tr>
		<th>Project</th>
		<th>Team Lead</th>
		<th>Due Date</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="project" items="${projects}">
	<tr>
		<td>${project.title}</td>
		<td>${project.leader.userName}</td>
		<td>${project.date}</td>
		<td>0</td>
	</tr>
	</c:forEach>
	
</table>
     
     <p>Your projects <p/>
     <table border="1">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author</th>
				<th>posted by</th>
			</tr>
			<tr>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>0 </td>
			</tr>
	</table>


</body>
</html>