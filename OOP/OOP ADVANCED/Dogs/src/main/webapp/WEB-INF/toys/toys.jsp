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
    <title>ADD NAME</title>
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
		<div class="main d-flex">
			<div class="col">
				<h2>Create a Toy!</h2>
				<form:form action="/toys/create" method="post" modelAttribute="toy">
					<div class="form-group">
						<form:label path="name">Name:</form:label>
						<form:input type="text" path="name" />
					</div>
					<div class="form-group">
						<form:label path="type">Type:</form:label>
						<form:input type="text" path="type" />
					</div>
					<div class="form-group">
						<label for="">Is Squeaky?</label>
						<form:checkbox path="squeaky" value="true" />
					</div>
					<button class="btn btn-success">Add a toy</button>
				</form:form>
			</div>
			<div class="col">
				<h2>All of the Toys</h2>
				<table class="table">
					<thead>
						<tr>
							<th>Name</th>
							<th>Type</th>
							<th>Is Squeaky?</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ allToys }" var="thisToy">
							<tr>
								<td><a href="/toys/${ thisToy.id }"><c:out value="${ thisToy.name }" /></a></td>
								<td><c:out value="${ thisToy.type }" /></td>
								<td><c:out value="${ thisToy.squeaky }" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>

