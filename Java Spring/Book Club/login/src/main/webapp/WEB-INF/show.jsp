<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1>${book.title}</h1>
<p>${book.user.userName} read ${book.title} by ${book.author} .</p>
<p>Here are ${book.user.userName} thoughts </p>
<br>
<p> ${book.thought} </p>
<a href="/books">Back to the shelves</a>
</body>
</html>