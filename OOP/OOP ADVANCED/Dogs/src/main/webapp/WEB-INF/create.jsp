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
    <title>Create A Dog</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>The Kennel</h1>
			<a href="/dashboard">Dashboard</a>
		</div>
		<div class="main">
			<h2>Add a Dog to the Kennel</h2>
			<form:form action="/dogs/create" method="post" modelAttribute="dog">
				<div class="form-group">
					<form:label path="name">Name:</form:label>
					<form:input type="text" path="name"/>
					<form:errors path="name" class="text-danger"/>					
				</div>				
				<div class="form-group">
					<form:label path="age">Age:</form:label>
					<form:input type="number" path="age" min="0"/>
					<form:errors path="age" class="text-danger"/>					
				</div>
				<div class="form-group">
					<form:label path="hairColor">Hair Color:</form:label>
					<form:input type="text" path="hairColor"/>
					<form:errors path="hairColor" class="text-danger"/>					
				</div>
				<button class="btn btn-success">Add a Dog</button>
			</form:form>
		</div>
	</div>
	
   
</body>
</html>
