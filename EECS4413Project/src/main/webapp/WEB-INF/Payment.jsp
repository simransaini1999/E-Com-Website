<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1 class="text-center">Payment</h1>
		<p class="text-center">Congratulations on your win! This is your information. Please pay now. </p>
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
				<label class="control-label">Total Cost ($) </label>
				<p class="text-left"> $123.00 </p>
			</div>
			<div class="form-group">
				<label class="control-label" for="creditCardNumber">Credit
					Card Number</label> <input type="text" name="creditCardNumber"
					class="form-control" placeholder="Enter credit card number"
					required>
			</div>
			<div class="form-group">
				<label class="control-label" for="cardHolderName">Name on
					Card</label> <input type="text" name="cardHolderName" class="form-control"
					placeholder="Enter name on card" required>
			</div>
			<div class="form-group">
				<label class="control-label" for="expirationDate">Expiration
					Date</label> <input type="text" name="expirationDate" class="form-control"
					placeholder="MM/YYYY" required>
			</div>
			<div class="form-group">
				<label class="control-label" for="securityCode">Security
					Code</label> <input type="text" name="securityCode" class="form-control"
					placeholder="Enter security code" required>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>

	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
</body>
</html>
