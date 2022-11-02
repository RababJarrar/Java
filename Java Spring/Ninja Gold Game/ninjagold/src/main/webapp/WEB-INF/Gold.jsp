<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256" import="java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<header>
    <label><h2>Your Gold:</h2></label>
    <div><c:out value="${gold}"/></div>
    </header>
    <main>
    <form action="/farm"method="post">
        <h3>Farm</h3>
        <p>(earns 10-20 gold)</p>
        <button>Find Gold!</button>
    </form>

    <form action="/cave"method="post">
        <h3>Cave</h3>
        <p>(earns 10-20 gold)</p>
        <button>Find Gold!</button>
    </form>

    <form action="/house"method="post">
        <h3>House</h3>
        <p>(earns 10-20 gold)</p>
        <button>Find Gold!</button>
    </form>

    <form action="/quest"method="post">
        <h3>Quest</h3>
        <p>(earns/takes 0-50 gold)</p>
        <button>Find Gold!</button>
    </form>
    </main>
    <footer>
        <label><h2>Activities:</h2></label><br>
        <textarea name="activities" cols="100" rows="7">
        <c:forEach var="onecomment" items="${comm}">
        		<c:out value="${onecomment}"></c:out> <%= new Date() %>
    	</c:forEach>   
        </textarea>
    </footer>
</body>
</html>