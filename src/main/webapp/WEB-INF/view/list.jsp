<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Portal</title>


	
	  <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
		
	
</head>
<body>

	
	<div class="container">
		<table class="table table-bordered table-stripped">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>City</th>
			<th>State</th>
			<th>HSSC</th>
			<th>SSC</th>
			<th>Download</th>
			<th>Update</th>
			<th>Delete</th>	
		</tr>
		<c:forEach var="listData" items="${list}">
			<tr>
				<td>${listData.id}</td>
				<td>${listData.fname}</td>
				<td>${listData.city}</td>
				<td>${listData.state}</td>
				<td>${listData.hscm}</td>
				<td>${listData.sscm}</td>
		
				<td><a href="download?id=${listData.id}" class="btn btn-success btn-sm">Download</a></td>
				<td><a href="update?id=${listData.id}" class="btn btn-info btn-sm">Update</a></td>
				<td><a href="delete?id=${listData.id}" class="btn btn-danger btn-sm">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	</div>


</body>
</html>