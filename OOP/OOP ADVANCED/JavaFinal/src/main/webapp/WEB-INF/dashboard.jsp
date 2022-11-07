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
    <title>Classes</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>Namaste, <c:out value="${ loggedInUser.name }"/></h1>
			<h3>Class Schedule:</h3>
			<a href="/logout">Logout</a>
		</div>
		<div class="main">
			<table class="table">
				<thead>
					<tr>
						<th>Class Name</th>
						<th>Instructor</th>
						<th>Weekday</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ allCourses }" var="course">
						<tr>
							<td><a href="/courses/${course.id}"><c:out value="${ course.courseName }"/></a></td>
							<td><c:out value="${ course.user.name }"/></td>
							<td><c:out value="${ course.weekday }"/></td>
							<td>$<c:out value="${ course.price }"/></td>
							<td>
								<c:if test="${loggedInUser.id == course.user.id }">
										<a href="/courses/${course.id}/edit">Edit</a>
								</c:if>
							</td>
						</tr>					
					</c:forEach>
				
				</tbody>
			</table>
			<a href="/courses/new"><button class="btn btn-info">Add New Class</button></a>
		</div>
	</div>
	
</body>
</html>

