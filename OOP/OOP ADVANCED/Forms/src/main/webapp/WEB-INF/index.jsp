<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="css/style.css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter the Secret Code:</h1>
	<form action="/" method="post">
		<input type="text" name="code" id="" />
		<button class="btn">Submit</button>
	</form>
	<h1 class="error"><c:out value="${ error }"/></h1>
	
		
	
</body>
</html>