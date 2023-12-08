<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="shortcut icon" href="#">
</head>
<body>
	<div class="container">
		<h1 class="text-center">Receipt</h1>
		<p class="text-center">Thank you for your payment!</p>
		<form>
			<div class="form-group">
				
    <label class="control-label">First Name</label>
    <p class="text-left" id="firstName"> Sheldon </p>
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
    <label class="control-label">Total Paid ($) </label>
    <p class="text-left" id="totalPaid"> $123.00 </p>
</div>
<div class="form-group">
    <label class="control-label">Item Name </label>
    <p class="text-left" id="itemName"> 897 </p>
</div>

			
			<h4 class="text-left">Shipping Details</h4>
			<p class="text-left">The item will be shipped in... </p>
			<div class="form-group">
				<p class="text-left"> 25 days </p>
			</div>
			<div class="btn-group">
            <a href="/" class="btn btn-primary">Back to Main Page</a>
        </div>
		</form>
	</div>
<script>
    $(document).ready(function(){
        // Retrieve values from localStorage
        var firstName = localStorage.getItem("fName");
        var lastName = localStorage.getItem("lName");
        var streetNumber = localStorage.getItem("streetNumber");
        var streetName = localStorage.getItem("streetName");
        var city = localStorage.getItem("city");
        var country = localStorage.getItem("country");
        var bidPrice = localStorage.getItem("BidPrice");
        var itemName = localStorage.getItem("keyword");
        

        $('#firstName').text(firstName);
        $('#lastName').text(lastName); 
        $('#streetNumber').text(streetNumber);
        $('#streetName').text(streetName);
        $('#city').text(city);
        $('#country').text(country);
        $('#totalCost').text(bidPrice);
        $("#itemName").text(itemName);

    });
</script>

	
</body>
</html>
