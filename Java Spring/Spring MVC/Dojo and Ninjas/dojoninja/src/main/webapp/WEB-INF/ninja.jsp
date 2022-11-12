<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>New Ninja</h1>
<form:form action="/createninja" method="post" modelAttribute="ninja">
		<form:label path="dojo">Dojo</form:label>
		<form:select path="dojo">
        <c:forEach var="one" items="${dojos}">
        <form:option value="${one.id}"><c:out value="${one.name}"></c:out></form:option>
    	</c:forEach>
        </form:select>
    <p>
        <form:label path="firstName">First Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:input type="number" path="age"/>
    </p>
    
     <input type="submit" value="Submit"/>
 </form:form>
</body>
</body>
</html>