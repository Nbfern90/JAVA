<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form action="/" method="post" >
		<div class="form">
			<label>Pick any number from 5 to 25</label>
			<input type="number" name="number" value=5>
			<label>Enter the name of any city</label>
			<input type="text" name="city">
			<label>Enter the name of any real person</label>
			<input type="text" name="name">
			<label>Enter professional endeavor or hobby:</label>
			<input type="text" name="hobby">
			<label>Enter any type of living thing.</label>
			<input type="text" name="living">
			<label>Say something nice to someone:</label>
			<input type="text" name="nice">
			<button class="btn">Submit</button>
		</div>	
	</form>
	<p>Send and show a friend</p>
</body>
</html>


