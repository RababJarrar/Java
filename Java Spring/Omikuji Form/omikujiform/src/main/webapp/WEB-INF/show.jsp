<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Here's Your Omikuji!</h1>
<div><h2> In <c:out value="${NUM}"></c:out> years ,you will live in <c:out value="${CIYT}"></c:out> with <c:out value="${NAME}"></c:out> as your roommate, <c:out value="${HOPPY}"></c:out>
 for a living . The next time you see a <c:out value="${LIVING}"></c:out> you will have good luck.
 Also , <c:out value="${STH}"></c:out></h2>
</div>
<a href="/omikuji">Go back</a>

</body>
</html>