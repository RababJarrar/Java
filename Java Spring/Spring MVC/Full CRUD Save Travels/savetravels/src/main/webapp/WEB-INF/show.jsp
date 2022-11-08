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
<h1>Expense Detailes</h1>
<h3><a href="/expenses">Go back</a></h3>
<h2>Expense Name: ${expense.name}</h2>
<h2>Expense  Description:${expense.description}</h2>
<h2>Vendor  ${expense.vendor}</h2>
<h2>Amount Spent  ${expense.amount}</h2>
</body>
</html>