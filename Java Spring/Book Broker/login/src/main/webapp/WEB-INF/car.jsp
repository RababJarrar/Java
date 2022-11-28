<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Edit Your Car</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body><br><br><br>
 <div class="row">
   <div class="col-lg-6 mx-auto">
     <div class="bg-white rounded-lg shadow-lg p-4">
	  
	   <form:form action="/editcar/id" method="post" modelAttribute="car">
	      <input type="hidden" name="_method" value="put">
        
        	<div class="tab-content">
          	<div class="tab-pane fade show active">          
              <div class="form-group">
                <form:label path="cartype">Type</form:label>
                <form:input path="cartype" placeholder="Car Type" class="form-control" /> 
                <form:errors path="cartype" class="red"/>               
              </div>
              <br>
              
              <div class="form-group">
                <form:label path="model">Model</form:label>
                <form:input type="number" min="1990" max="2022" path="model" class="form-control" />
                <form:errors path="model" class="red"/>
              </div>
              <br>
              
              <div class="form-group">
                <form:label path="carcolor">Color</form:label>
                <form:input type="text" path="carcolor" placeholder="Car Color" class="form-control" />
                <form:errors path="carcolor" class="red"/>
              </div>
              <br>
              
              <div class="form-group">
                <form:label path="description">Description</form:label>
                <form:input type="textarea" rows="5" path="description" placeholder="Description for Car" class="form-control" />
                <form:errors path="description" class="red"/>
              </div> 
              <br>              
           </div>
         </div>
         
       <input type="submit"  class="btn btn-primary" value="Save">
     </form:form>
       <input type="submit"  class="btn btn-primary" value="Cancel">
     <form:form action="/dashboard" method="get" modelAttribute="project">
		<input type="submit" value="Cancel"/>
	</form:form>
	<form:form action="/" method="get" modelAttribute="car">
		<input type="submit" value="Cancel"/>
	</form:form>
   </div>
  </div>
 </div>
</body>
</html>
