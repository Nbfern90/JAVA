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
    <title>Dogs</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>The Kennel</h1>
			<a href="/dogs/new">Create a Dog</a>
			<a href="/collars/new">Create a Collar</a>
			<a href="/toys/new">Create a Toy</a>
		</div>
		<div class="main">
			<h2>Here are the dogs in the kennel:</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Age</th>
						<th>Hair Color</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allDogs }" var="dog">
						<tr>
							<td><c:out value="${ dog.name }"/></td>
							<td><c:out value="${ dog.age }"/></td>
							<td><c:out value="${ dog.hairColor }"/></td>
							<td>
								<a href="/dogs/${dog.id}">View</a>
								<a href="/dogs/${dog.id}/edit">Edit</a>
								<a href="/dogs/${dog.id}/delete">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
   
</body>
</html>


