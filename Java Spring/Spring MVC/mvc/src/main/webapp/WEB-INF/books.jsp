<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Books</h1>
    <c:forEach var="book" items="${books}">
        <p><c:out value="${book.title}"></c:out> <c:out value="${book.description}"></c:out> <c:out value="${book.language}"></c:out></p>
    </c:forEach>
    
</body>
</html>