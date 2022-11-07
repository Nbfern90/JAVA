<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
</head>
<body>
	<div>
		<h1>Fruit Store</h1>
		<table class ="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>	
				
				<c:forEach var="oneFruit" items="${fruitFromController}">
				<tr>
					<td><c:out value="${oneFruit.name}"></c:out></td>
					<td><c:out value="${oneFruit.price}"></c:out></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>