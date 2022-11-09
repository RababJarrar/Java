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
<h1>Register</h1>
<form:form action="/reg" method="post" modelAttribute="newUser">
    <p>
        <form:label path="userName">User Name</form:label>
        <form:errors path="userName"/>
        <form:input path="userName"/>
    </p>
     <p>
        <form:label path="email">Email</form:label>
        <form:errors path="email"/>
        <form:input path="email"/>
    </p>
    <p>
        <form:label path="password">Password</form:label>
        <form:errors path="password"/>     
        <form:input type="password" path="password"/>
    </p> 
    <p>
        <form:label path="confirm">Confirm Pass</form:label>
        <form:errors path="confirm"/>
        <form:input type="password" path="confirm"/>
    </p>
   
    <input type="submit" value="Submit"/>
</form:form> 
<h1>Login</h1>
<form:form action="/log" method="post" modelAttribute="newLogin">
     <p>
        <form:label path="email">Email</form:label>
        <form:errors path="email"/>
        <form:input path="email"/>
    </p>
    <p>
        <form:label path="password">Password</form:label>
        <form:errors path="password"/>     
        <form:input type="number" path="password"/>
    </p> 
   
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>