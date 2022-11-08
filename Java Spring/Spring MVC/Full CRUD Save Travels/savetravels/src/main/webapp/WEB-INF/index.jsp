<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>   


<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Save Travels</h1>
<table border="1">	
	<tr>
	<th>Expense</th>
	<th>Vendor</th>
	<th>Amount</th>
	<th>Actions</th>
	<th>-</th>
	</tr>
	<c:forEach var="one" items="${expenses}">
	<tr>
	<td><a href="/expenses/${one.id}">${one.name}</a></td>
	<td>${one.vendor}</td>
	<td>${one.amount}</td>
	<td><a href="/expenses/${one.id}/edit"> edit</a></td>
	<td><form action="/expenses/${one.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
	</form></td>
	
	</tr>
	</c:forEach>
</table>
<h1>Add an Expense</h1>
<form:form action="/expenses" method="post" modelAttribute="expense">
    <p>
        <form:label path="name">Expense Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
     <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>     
        <form:input type="number" path="amount"/>
    </p> 
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
   
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>