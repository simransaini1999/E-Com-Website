<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Item Search</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="shortcut icon" href="#">
</head>
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
				 <p class="text-left" id="firstName"> </p>
			</div>
			<div class="form-group">
				<label class="control-label">Last Name</label>
				<p class="text-left" id="lastName"> Cooper </p>
			</div>
			<div class="form-group">
		    <label class="control-label">Street Number</label>
		    <p class="text-left" id="streetNumber"> 345 </p>
			</div>
			<div class="form-group">
			    <label class="control-label">Street Name</label>
			    <p class="text-left" id="streetName"> William Street </p>
			</div>
			<div class="form-group">
			    <label class="control-label">City</label>
			    <p class="text-left" id="city"> Edmonton </p>
			</div>
			<div class="form-group">
			    <label class="control-label">Country</label>
			    <p class="text-left" id="country"> Canada </p>
			</div>
			<div class="form-group">
			    <label class="control-label">Total Cost ($) </label>
			    <p class="text-left" id="totalCost"> $123.00 </p>
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
<script>
$(document).ready(function(){
 
            
			var auctionType = localStorage.getItem("auctionType");
			var bidPrice = localStorage.getItem("BidPrice");
            $.ajax({
            	url: "http://localhost:8080/payment/user/" + auctionType, 
                type: 'GET',
                success: function(response) {
                    console.log(response.fName);
                    $('#firstName').text(response.fName);
                    $('#lastName').text(response.lName); 
                    $('#streetNumber').text(response.streetNumber);
                    $('#streetName').text(response.streetName);
                    $('#city').text(response.city);
                    $('#country').text(response.country);
                    $('#totalCost').text(bidPrice);
                    
                    // Redirect to the destination page
                    //window.location.href = "/itemfoundjsp/";
                },
                error: function(xhr, status, error) {
                    alert('Failed to store keyword: ' + error);
                    console.error('XHR Status:', status);
                    console.error('Error:', error);
                }
            });
});
    </script>
</body>
</html>
