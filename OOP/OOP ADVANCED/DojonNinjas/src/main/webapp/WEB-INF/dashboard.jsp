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
    <title>Dojos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header d-flex justify-content-between align-items-center">
			<h1>Information</h1>
			<a href="/dojos/new">Create a Dojo</a>
			<a href="/ninjas/new">Create a Ninja</a>
		</div>
		<div class="main">
			<table>
				<thead>
					<tr>
						<th style="width:200px;">Dojo Name</th>
						<th style="width:200px;"># of Ninja </th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allDojos }" var="dojo">
						<tr>						
							<td style="width:200px;"><a href="/dojos/<c:out value="${ dojo.id }"/>"><c:out value="${ dojo.name }"/></a></td>
							<td style="width:200px;">${ dojo.ninjas.size() } Ninjas</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	
	</div>
   
</body>
</html>


