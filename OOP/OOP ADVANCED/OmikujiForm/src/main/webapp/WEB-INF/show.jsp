<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show</title>
<c:url value="/css/style.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
</head>
<body>
	<div class="info">
		<p>In <c:out value="${number}"/> you will live in <c:out value="${city}"/>
		with <c:out value="${name}"/> as your roommate, <c:out value="${hobby}"/> for a living. The next time
		you see a <c:out value="${living}"/>, you will have good luck. Also, <c:out value="${nice}"/>. </p>
	</div>
	<br>
	<a href="/">Go Back</a>

</body>
</html>