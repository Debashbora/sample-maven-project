<%@page import="com.sevya.carmodeldata.entities.Car"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
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
	  <a class="navbar-brand" href="" >Car Model</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	</nav>
	
	
	<div class="container">
	<h1> edit car model data </h1>
	<form action ="edited"  method = "post" onsubmit="carUpdate()" >		 
		<%-- <%
		 	CarModels carModel = (CarModels)request.getAttribute("car");
		 	out.print("<input type='hidden' name='id' value="+carModel.getId()+" />");
		 %>  --%> 
		<input type='hidden' name='id' value="${ car.getId()}" />
		<div class="form-group">
			<label for="exampleInputEmail1">Manufacturer </label> 
			<input type="text" name="manufacturer" placeholder="Manufacturer"
				class="form-control" id="exampleInputEmail1" value="${car.getManufacturer()}"
				aria-describedby="emailHelp">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Model Name</label> 
			<input type="text" name="modelName" placeholder="model name"
				class="form-control" id="exampleInputPassword1" value="${car.getModelName()}">
		</div>
		<div class="form-group">
			<label for="Engine Size(cc)">Engine Size(cc)</label> 
			<input type="text" name="engineSize" placeholder="engine size"
				class="form-control" id="Engine Size(cc)" value="${car.getEngineSize()}">
		</div>
		<div class="form-group">
			<label for="Variant">Variant</label> 
			<input type="text" name="variant" placeholder="variant" class="form-control" 
				id="Variant" value="${car.getVariant()}">
		</div>
		<button type="submit" class="btn btn-primary">Update</button>
	</form>
	</div>	
	
		
	<script type="text/javascript">
		function carUpdate() {
			swal("updated successfully...");
		}
		
		
		
	</script>	
		
</body>
</html>











