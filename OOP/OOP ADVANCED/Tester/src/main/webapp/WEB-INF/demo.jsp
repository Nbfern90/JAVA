<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tester</title>

<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/app.js">
</script>
</head>
<body>
	<h1>First JSP</h1>
	<h3>Here is a java expression: <c:out value="${2+2}"/></h3>
	<h2><c:out value="${fruit}"/></h2>
	
	<h1>User Info:</h1>
	
	<p><c:out value="${first}"/></p>
	<p><c:out value="${last}"/></p>
	<p><c:out value="${email}"/></p>
	<p><c:out value="${age}"/></p>
	
	
	
		
</body>
</html>