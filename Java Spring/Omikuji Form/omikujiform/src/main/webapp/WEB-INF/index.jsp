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
<h1> Send an Omikuji!</h1>
<form action="/send" method="post">
<div>
<h3>Pick any number from 5 to 25</h3>
<input type="number" name='number' min="5"max="25">
</div>
<div>
<h3>Enter the name of any city:</h3>
<input type="text" name='city'>
</div>
<div>
<h3>Enter the name of any real person:</h3>
<input type="text" name='name'>
</div>
<div>
<h3>Enter professional endeavor or hoppy:</h3>
<input type="text" name='hoppy'>
</div>
<div>
<h3>Enter any type of living thing:</h3>
<input type="text" name='living'>
</div>
<div>
<h3>Say something nice to someone:</h3>
<input type="text" name='something'>
</div>
<h3>send and show a friend</h3>
<input type='submit' value='send'>
</form>

</body>
</html>