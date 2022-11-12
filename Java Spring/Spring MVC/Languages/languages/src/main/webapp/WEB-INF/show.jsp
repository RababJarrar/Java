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
<form:form  modelAttribute="language">
<c:out value="${language.name}"/>
<h1>${language.name}</h1>
<h1>${language.creator}</h1>

	<a href="/languages/edit/${language.id}"> edit</a> <br>
    <a href="/languages/delete/${language.id}"> delete</a> <br>
</form:form>
</body>
</html>