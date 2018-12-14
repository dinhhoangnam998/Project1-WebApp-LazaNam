<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Types</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Name</td>
		</tr>
		
		<c:forEach var="listItem" items="${typeList}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>