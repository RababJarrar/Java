<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256" import="java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="js/time.js"></script>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<p class="time"><c:out value="${date}"/></p>
</body>
</html>