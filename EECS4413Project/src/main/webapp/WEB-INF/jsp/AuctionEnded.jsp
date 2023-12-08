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
        <h2 class="text-center">Auction has ended! Please pay for the item below.</h2>
        <p class="text-center">If you would like expedited shipping, please select the button below. Then proceed by clicking the 'Buy Now' button. </p>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Item Name</th>
                    <th>Item Description</th>
                    <th>Shipping Price</th>
                    <th>Current Price</th>
                    <th>Expedited Price</th>
                    <th>Highest Bidder</th>
                    
                </tr>
            </thead>
            <tbody id="auctionEndedTable">
                
            </tbody>
        </table>
            <div class="btn-group">
            <form>
             <div>
            	<label for="expeditedShipping">Expedited Shipping:</label>
            	<input type="radio" id="expeditedShipping" name="shippingOption" value="expedited">
            	
       		 </div>
 				<button type="button" class="btn btn-primary" id="submitButton">Pay Now</button>
				<a href="/history/" class="button">See Bid History</a>       			
       		</form>
        </div>
        
    </div>
<script>
$(document).ready(function(){
    // Retrieve itemName from the session
    var itemName = localStorage.getItem("keyword");
    var itemDescription = localStorage.getItem("itemDescription");
    var shipmentPrice = localStorage.getItem("shipmentPrice");
    var currentPrice = localStorage.getItem("BidPrice");
    var expeditedPrice = localStorage.getItem("ExpeditedShipmentPrice");
    var highestBidder = localStorage.getItem("Highestbidder");
    var auctionType = localStorage.getItem("auctionType");
    
    $.ajax({
        url: "http://localhost:8080/auction/itemdetails",
        type: 'GET',
        success: function(response) {
            // Print out itemName, auctionType, and startingBidPrice
            $("#auctionEndedTable").append("<tr><td>" + itemName + 
                    "</td><td>" + itemDescription + "</td><td>" +
                    shipmentPrice + "</td><td>" +
                    currentPrice + "</td><td>" +
                   	expeditedPrice + "</td><td>" +
                    highestBidder + "</td>");
            },
                    
        error: function(xhr, status, error) {
            console.error('AJAX Request Failed:', xhr, status, error);
            alert('AJAX Request failed: ' + error);
        }
    });
    $("#submitButton").on("click", function() {
    	var expeditedShipping = $("#expeditedShipping").prop("checked");

        if (expeditedShipping) {
            // Add expeditedPrice to currentPrice
            currentPrice = parseInt(currentPrice) + parseInt(expeditedPrice) + parseInt( shipmentPrice);
        }else{
        	currentPrice = parseInt(currentPrice) + parseInt(shipmentPrice);
        }

        // Update BidPrice in local storage
        localStorage.setItem("BidPrice", currentPrice);
        submit();
    });
});

function submit(){
	var auctionType = localStorage.getItem("auctionType");
	console.log(auctionType);
	
	$.ajax({
        url: "http://localhost:8080/payment/checkBidder/" + auctionType,
        type: 'GET',
        contentType: 'application/json',
        success: function(response) {
            		if(response == true){
            			window.location.href = "/paymentjsp/";
            		}else{
            			alert('Not winning bidder');
            		}
        },
        error: function(xhr, status, error) {
            console.error('AJAX Request Failed:', xhr, status, error);
            alert('AJAX Request failed: ' + error);
        }
    });
	
}
    
</script>
</body>
</html>
