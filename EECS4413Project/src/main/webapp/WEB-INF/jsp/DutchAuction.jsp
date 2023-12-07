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
        <h1 class="text-center">Dutch Auction Items</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Item Name</th>
                    <th>Item Description</th>
                    <th>Shipping Price</th>
                    <th>Current Price</th>
                    <th>Auction Type</th>
                </tr>
            </thead>
            	<tbody id="dutchAuctionItem">
               
            </tbody>
        </table>
            <div class="text-center">
            <form>
 				<button type="button" class="btn btn-primary" id="submitButton">Buy Now</button>
        </form>
        </div>
    </div>

<script>
$(document).ready(function(){
    // Retrieve itemName from the session
    var itemName = localStorage.getItem("keyword");
    
    $.ajax({
        url: "http://localhost:8080/auction/itemdetails",
        type: 'GET',
        success: function(response) {
            // Print out itemName, auctionType, and startingBidPrice
            $("#dutchAuctionItem").append("<tr><td>" + response.itemName + 
                    "</td><td>" + response.itemDescription + "</td><td>" +
                    response.shipmentPrice + "</td><td>" +
                    response.startingBidPrice + "</td><td>" +
                    response.auctionType + "</td>");
            localStorage.setItem("biddingPrice", response.startingBidPrice);
            },
                    
        error: function(xhr, status, error) {
            console.error('AJAX Request Failed:', xhr, status, error);
            alert('AJAX Request failed: ' + error);
        }
    });
    $("#submitButton").on("click", function() {
        submit();
    });
});

function submit(){
	
	var price = localStorage.getItem("biddingPrice");
	console.log(price);
	$.ajax({
        url: "http://localhost:8080/auction/dutchauction/" + price,
        type: 'POST',
        contentType: 'application/json',
        success: function(response) {
            		
			window.location.href = "/auctionendedjsp/";
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
