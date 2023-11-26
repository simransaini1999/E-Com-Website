<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Receipt Page</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1 class="text-center">Receipt</h1>
		<p class="text-center">Thank you for your payment!</p>
		<form action="process_payment.jsp" method="post">
			<div class="form-group">
				<label class="control-label">First Name</label>
				<p class="text-left"> Sheldon </p>
			</div>
			<div class="form-group">
				<label class="control-label">Last Name</label>
				<p class="text-left"> Cooper </p>
			</div>
			<div class="form-group">
				<label class="control-label">Street Number</label>
				<p class="text-left"> 345 </p>
			</div>
			<div class="form-group">
				<label class="control-label">Street Name</label>
				<p class="text-left"> William Street </p>
			</div>
			<div class="form-group">
				<label class="control-label">Province</label>
				<p class="text-left"> Alberta </p>
			</div>
			<div class="form-group">
				<label class="control-label">City</label>
				<p class="text-left"> Edmonton </p>
			</div>
			<div class="form-group">
				<label class="control-label">Country</label>
				<p class="text-left"> Canada </p>
			</div>
			<div class="form-group">
				<label class="control-label">Total Paid ($) </label>
				<p class="text-left"> $123.00 </p>
			</div>
			<div class="form-group">
				<label class="control-label">Item ID </label>
				<p class="text-left"> 897 </p>
			</div>
			
			<h4 class="text-left">Shipping Details</h4>
			<p class="text-left">The item will be shipped in... </p>
			<div class="form-group">
				<p class="text-left"> 25 days </p>
			</div>
			<div class="btn-group">
            <a href="ItemCatalog.jsp" class="btn btn-primary">Back to Main Page</a>
        </div>
		</form>
	</div>

	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
</body>
</html>
