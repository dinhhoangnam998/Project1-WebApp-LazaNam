<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
	<h3>Welcome to add book</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/book/add" modelAttribute="book">
		<table>


			<tr>
				<td><form:label path="language">language</form:label></td>
				<td><form:input path="language" /></td>
			</tr>
			<tr>
				<td><form:label path="pagenumber">pagenumber</form:label></td>
				<td><form:input path="pagenumber" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="republishno">republishno</form:label></td>
				<td><form:input path="republishno" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="isbn">isbn</form:label></td>
				<td><form:input path="isbn" /></td>
			</tr>
			<tr>
				<td><form:label path="width">width</form:label></td>
				<td><form:input path="width" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="height">height</form:label></td>
				<td><form:input path="height" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="weight">weight</form:label></td>
				<td><form:input path="weight" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="coverprice">coverprice</form:label></td>
				<td><form:input path="coverprice" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="imageurl">imageurl</form:label></td>
				<td><form:input path="imageurl" /></td>
			</tr>
			<tr>
				<td><form:label path="description">description</form:label></td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td><form:label path="comment">comment</form:label></td>
				<td><form:input path="comment" /></td>
			</tr>


			<tr>
				<td><form:label path="creation.id">Creation</form:label></td>
				<td><form:select path="creation.id">
						<form:options items="${listCreation}" itemValue="id"
							itemLabel="name" />
					</form:select></td>
			</tr>

			<tr>
				<td><form:label path="type.id">Type</form:label></td>
				<td><form:select path="type.id">
						<form:options items="${listType}" itemValue="id" itemLabel="name" />
					</form:select></td>
			</tr>

			<tr>
				<td><form:label path="publisher.id">Publisher</form:label></td>
				<td><form:select path="publisher.id">
						<form:options items="${listPublisher}" itemValue="id"
							itemLabel="name" />
					</form:select></td>
			</tr>



			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>