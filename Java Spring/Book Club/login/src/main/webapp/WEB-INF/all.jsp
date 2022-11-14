<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 class="welcome">Welcome ,<c:out value="${currentUser.userName}"/></h2>
<p>Books from everyone shelves:</p>
<a href="/logout">logout</a>         <a href="/book/new">+ Add a to my shelf!</a>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>posted by</th>
    </tr>
    <c:forEach var="book" items="${books}">
    <tr>
        <td> ${book.id}</td>
        <td><a href="/books/${book.id}">${book.title}</a></td>
        <td>${book.author}</td>
        <td>${book.user.userName} </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>