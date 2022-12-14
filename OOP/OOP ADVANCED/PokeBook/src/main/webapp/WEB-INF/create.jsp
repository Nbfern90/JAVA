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
    <title>Create Expense</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>PokeBook</h1>
		</div>
		<div class="main">
			<h2 class="text-primary">Track an expense</h2>
			<form:form action="/expense/create" method="post" modelAttribute="expense">
				<div class="form-group">
					<form:label path="name">Expense Name:</form:label>
					<form:input type="text" path="name"/>
					<form:errors path="name" class="text-danger"/>					
				</div>				
				<div class="form-group">
					<form:label path="vendor">Vendor:</form:label>
					<form:input type="text" path="vendor"/>
					<form:errors path="vendor" class="text-danger"/>					
				</div>
				<div class="form-group">
					<form:label path="amount">Amount:</form:label>
					<form:input type="number" path="amount" step="0.01" value="1.00"/>
					<form:errors path="amount" class="text-danger"/>					
				</div>
				<div class="form-group">
					<form:label path="description">Description:</form:label>
					<form:input type="text" path="description"/>
					<form:errors path="description" class="text-danger"/>					
				</div>
				<button class="btn btn-success">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>

