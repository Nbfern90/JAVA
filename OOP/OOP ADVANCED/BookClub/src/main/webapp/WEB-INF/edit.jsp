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
    <title>Create a Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>Edit A Book</h1>
			<a href="/dashboard">Back to Dashboard</a>			
		</div>
		<div class="main">
			<form:form action="/books/${book.id}/update" method="post" modelAttribute="book">
				<input type="hidden" name="_method" value="put" />
				<div class="form-group">
					<form:label path="title">Title:</form:label>
					<form:input type="text" path="title"  value="${book.title}"/>
					<form:errors path="title" class="text-danger"/>					
				</div>				
				<div class="form-group">
					<form:label path="author">Author:</form:label>
					<form:input type="text" path="author" value="${book.author}"/>
					<form:errors path="author" class="text-danger"/>					
				</div>
				<div class="form-group">
					<form:label path="thoughts">My Thoughts:</form:label>
					<form:input type="text" path="thoughts" value="${book.thoughts}"/>
					<form:errors path="thoughts" class="text-danger"/>					
				</div>
				<button class="btn btn-success">Update Book</button>
			</form:form>
		
		</div>
	</div>
   
</body>
</html>
