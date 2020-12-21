<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Portal</title>
<style>
		 	body{
			
				background-image: url("/asset/images/srbac.jpg");
				background-repeat: no-repeat;
				background-size: cover;
				background-attachment: fixed;	
					
			} 
			.bpic{
				width : 100%;
				height : 100%;
			}
			
			.cardm{
				width : 60%;
				margin : 10px auto;
				margin-top : 300px; 
				padding : 20px;
			}
			.cr{
	
				margin : 10px 50px;
				background-color : #2b3647;
				
			}
			
		</style>
				    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
		
</head>
<body>

	
		<div class="cardm">
				<div class="card-group">
			  <div class="card cr">
			   
			    <div class="card-body cb">
			      <h5 class="card-title">Add</h5>
			      <p class="card-text">These button redirects you to insert page for Student Register</p>
			      <a href="addStudData" class="btn btn-primary btn-lg">Add</a>
			    </div>
			  </div>
			    <div class="card cr">
			   
			    <div class="card-body cb">
			      <h5 class="card-title">View</h5>
			      <p class="card-text">These button redirects you to view page for list,update or delete data</p>
			      <a href="listStudData" class="btn btn-primary btn-lg">View</a>
			    </div>
			  </div>
			  	  </div>
			</div>
		</div>
		

</body>
</html>