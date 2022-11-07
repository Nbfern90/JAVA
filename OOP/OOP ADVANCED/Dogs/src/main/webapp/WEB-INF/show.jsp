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
    <title>Show A Dog</title>
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
			<h2>Info on <c:out value="${dog.name }"/></h2>
			<ul style=" list-style: none;">
				<li>Age: <c:out value="${dog.age }"/></li>
				<li>Hair Color: <c:out value="${dog.hairColor }"/></li>
			</ul>
			<h2>This Dog's collar is: </h2>
			<ul style=" list-style: none;">
				<c:forEach items="${dog.collars}" var="collar">
					<li> <c:out value="${collar.color }"></c:out></li>
				</c:forEach>
			</ul>
			<h2>This Dog's toys:</h2>
			<ul>
				<c:forEach items="${ dog.toys }" var="thisToy">
					<li><c:out value="${ thisToy.name }" /></li>
				</c:forEach>
			</ul>
		</div>
		<a href="/dogs/${dog.id}/edit">Edit this Dog</a>
		<a href="/dogs/${dog.id}/delete">Delete this Dog</a>
		
		<form action="/dogs/${ dog.id }/addToy" method="post">
			<select name="toyId" id="">
				<c:forEach items="${ allToys }" var="toy">
					<option value="${ toy.id }"><c:out value="${ toy.name }" /></option>
				</c:forEach>
			</select>
			<button class="btn btn-danger">Add Toy</button>
		</form>
	</div>
  
</body>
</html>

