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
    <title>Books</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>Welcome, <c:out value="${ loggedInUser.name }"/> </h1>
			<h2>Books from everyone's shelves:</h2>
			<a href="/logout">Logout</a>
			<a href="/books/new"> Add a Book</a>
		</div>
		<div class="main">
			<table class ="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Author Name</th>
						<th>Posted By</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allBooks }" var="book">
						<tr>
							<td><c:out value="${ book.id }"/></td>
							<td><a href="/books/${book.id}"><c:out value="${ book.title }"/></a></td>
							<td><c:out value="${ book.author }"/></td>	
							<td><c:out value="${ book.user.name }"/></td>
							<td>
								<c:if test="${loggedInUser.id == book.user.id }">
									<a href="/books/${book.id}/edit">Edit</a>
									<a href="/books/${book.id}/delete">Delete</a>						
								</c:if>
							</td>	
											
					
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	
</body>
</html>

