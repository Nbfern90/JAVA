<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>All Books</h1>
<table >
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody >
         <c:forEach var="books" items="${books}">
         <tr>
	         <td> <c:out value="${books.id}"></c:out></td>
	         <td><a href="/books/${books.id}"> <c:out value="${books.title}"></c:out></a></td>
	         <td><c:out value="${books.language}"></c:out></td>
	         <td><c:out value="${books.numberOfPages}"></c:out></td>
         </tr>
         	
         </c:forEach>
    </tbody>
</table>

<a href="/books/new"><button>Add New Book</button></a>
	
	


</body>
</html>