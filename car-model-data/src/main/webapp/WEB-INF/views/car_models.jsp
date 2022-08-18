<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>car models</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" 
integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>	<!-- sweet alert cdn -->
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="" >Car Models</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
</nav>

	<div class= "container">
		<div class = "row">
			<h1>List of Cars</h1>
		</div>
		<div class = "row">
			<a href = "add" class = "btn btn-primary btn-sm mb-3">Add One</a>
		</div>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Manufacturer</th>
		      <th scope="col">Model Name</th>
		      <th scope="col">Engine Size(cc)</th>
		      <th scope="col">Variant</th>
		      <th scope="col">Action</th>
		    </tr>
		  </thead>
		  <tbody>
		    <c:forEach var="car" items="${listOfCarModel}">
		    <tr >
		      <td >${car.getManufacturer()}</td>
		      <td >${car.getModelName()}</td>
		      <td >${car.getEngineSize()}</td>
		      <td >${car.getVariant()}</td>
		      <td>
		      <a href="edit?id=${car.getId()}" class = "btn btn-primary"> Edit </a>
		      <a  href="delete?id=${car.getId()}"  class = "btn btn-danger" onclick="return doDelete()"> Delete </a>
			  </td>		    
		    </tr>
		    </c:forEach>
		  </tbody>
		</table>
	</div>


	<script type="text/javascript">
		function doDelete() {
			return confirm('Do you really want to delete the data?');
		} 
		
	</script>

</body>
</html>














