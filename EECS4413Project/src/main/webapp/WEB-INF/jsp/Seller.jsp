<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Sign-Up Page</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="shortcut icon" href="#">
</head>

<body>
<form id="sellerForm">
	<div class="container">
		<h1 class="text-center">Selling Your Item</h1>
			<div class="form-group">
				<label class="control-label" for="itemName">Item
					Name</label>
				<input type="text" name="itemName" class="form-control" 
					placeholder="Enter item name" required></input>
			</div>
			<div class="form-group">
				<label class="control-label" for="itemDescription">Item
					Description</label>
				<input type="text" name="itemDescription" class="form-control" 
					placeholder="Enter item description" required></input>
			</div>
			<div class="form-group">
				<label class="control-label" for="auctionType">Auction Type</label>
				<select name="auctionType" class="form-control" required>
					<option value="select">--Select--</option>
					<option value="Dutch Auction">Dutch Auction</option>
					<option value="Forward Auction">Forward Auction</option>
				</select>
			</div>
			<div class="form-group">
				<label class="control-label" for="expeditedShipmentPrice">Expedited Shipment Price ($)
				</label> <input type="number" name="expeditedShipmentPrice"
					class="form-control" min="1" placeholder="Enter Expedited Shipment Price"
					required>
			</div>
			<div class="form-group">
				<label class="control-label" for="shipmentPrice">Shipment Price ($)
				</label> <input type="number" name="shipmentPrice"
					class="form-control" min="1" placeholder="Enter Shipment Price"
					required>
			</div>
			<div class="form-group">
				<label class="control-label" for="startingBidPrice">Starting
					Bid Price ($)</label> <input type="text" name="startingBidPrice"
					class="form-control" placeholder="Enter starting bid price"
					required>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Upload Item</button>
			</div>
	</div>
	</form>
	
	<script>
    $("#sellerForm").on('submit', function(e) {
        e.preventDefault();
        // Capture form data

        
		var userData = {
				itemName: $('input[name="itemName"]').val(),
				itemDescription: $('input[name="itemDescription"]').val(),
				auctionType: $('select[name="auctionType"]').val(),
				expeditedShipmentPrice: $('input[name="expeditedShipmentPrice"]').val(),
				shipmentPrice: $('input[name="shipmentPrice"]').val(),
				startingBidPrice: $('input[name="startingBidPrice"]').val()
			};
        
        $.ajax({
            url: "http://localhost:8080/seller/createitem", 
			type: 'POST',

			contentType: 'application/json',

			data: JSON.stringify(userData),
			
			 success: function(response) {
				 alert('item added successfully');
                 window.location.href = "/";
             },
             error: function(xhr, status, error) {
                 alert('item failed to add: ' + error);
                 // You might also want to log the details to the console for debugging
                 console.error('XHR Status:', status);
                 console.error('Error:', error);
             }
        });
    });

</script>
	
</body>
</html>
