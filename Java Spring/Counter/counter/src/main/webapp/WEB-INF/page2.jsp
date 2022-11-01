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
<h1>You have visited <a href="/">http://your_server</a><c:out value="${count} "></c:out> times</h1>
<h1><a href="/">Test another visit?</a></h1>


</body>
</html>