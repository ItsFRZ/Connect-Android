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
		<br>
		<div class="container">
		<form action="insertData"  method="POST" enctype="multipart/form-data" >
			<!-- <input type="hidden" name="id" >  -->
			<input type="text" name="fname" class="form-control mb-4 col-4" placeholder="Full Name">
			<input type="text" name="city" class="form-control mb-4 col-4" placeholder="City">
			<input type="text" name="state" class="form-control mb-4 col-4" placeholder="State">
			<input type="text" name="hscm" class="form-control mb-4 col-4" placeholder="Higher Secondary Marks">
			<input type="text" name="sscm" class="form-control mb-4 col-4" placeholder="Secondary Marks">
			
			<input type="file" name="photoid" accept=".png,.jpeg,.jpg" class="form-control mb-4 col-4">
			 
			
			<button type="submit" class="btn btn-success form-control mb-4 col-4 btn-lg">Save</button>
		</form>
	<br>
	<a href="home" class="btn btn-dark btn-success form-control mb-4 col-4 btn-lg">Back</a>
	</div>

		
</body>
</html>