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
<h1>Fruit Store</h1>
	<table border="1">
    	<tr>
    	 <th> Name </th>
    	 <th> Price </th>
    	</tr>
    	<c:forEach var="one" items="${d}">
    	<tr>
        	<td><c:out value="${one.name}"></c:out></td>
        	<td><c:out value="${one.price}"></c:out></td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>