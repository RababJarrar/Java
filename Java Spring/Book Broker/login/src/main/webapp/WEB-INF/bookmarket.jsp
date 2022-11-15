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
<a href="/logout">logout</a><br>       
<a href="/book/new">+ Add a to my shelf!</a><br> 
<br>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Owner</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="book" items="${books}">
	    <c:choose>
	    <c:when test="${(book.borrower.id eq null) or (book.user.id eq currentUser.id)}">
		    <tr>
		        <td> ${book.id}</td>
		        <td><a href="/books/${book.id}">${book.title}</a></td>
		        <td>${book.author}</td>
		        <td>${book.user.userName} </td>
		     
		        <td>
		        <c:choose>
			        <c:when test="${book.user.id eq currentUser.id}"><a href="/books/${book.id}/edit">Edit</a> <a href="/books/${book.id}/delete">Delete</a></c:when>
			        <c:otherwise><a href="/books/${book.id}/borrow">Borrow</a></c:otherwise> 
			        </c:choose>
		        </td>
		    </tr>
		</c:when>
	    </c:choose>
    </c:forEach>
    
</table>
<p> Books Iam Borrowing
<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Owner</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="one" items="${borrowedbooksfromuser}"> 
    <tr>
        <td>${one.id}</td>
        <td> ${one.title} </td>
        <td>${one.author} </td>
        <td> ${one.user.userName} </td>
        <td><a href="/books/${one.id}/return">return</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>