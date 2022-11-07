<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Create</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>Create a Course</h1>
			<a href="/dashboard">Back to Dashboard</a>			
		</div>
		<div class="main">
			<form:form action="/courses/create" method="post" modelAttribute="course">
				<div class="form-group">
					<form:label path="courseName">Name:</form:label>
					<form:input type="text" path="courseName"/>
					<form:errors path="courseName" class="text-danger"/>					
				</div>
				<div class="form-group">
					<form:label path="weekday">Day of the Week:</form:label>
					<form:input type="text" path="weekday"/>
					<form:errors path="weekday" class="text-danger"/>					
				</div>
				<div class="form-group">
					<form:label path="price">Price:</form:label>
					<form:input type="number" path="price" step="0.50" value="1.00"/>
					<form:errors path="price" class="text-danger"/>					
				</div>
				<div class="form-group">
					<form:label path="description">Description:</form:label>
					<form:input type="text" path="description"/>
					<form:errors path="description" class="text-danger"/>					
				</div>
				<button class="btn btn-success">Submit</button>
			</form:form>
		
		
				<a href="/dashboard"><button class="btn btn-danger text-right ">Cancel</button></a>	
			
		</div>

</div>
</body>
</html>
