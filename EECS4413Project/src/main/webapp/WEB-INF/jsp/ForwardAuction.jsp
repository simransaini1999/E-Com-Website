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
        <h1 class="text-center">Forward Auction Items</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Item Name</th>
                    <th>Item Description</th>
                    <th>Shipping Price</th>
                    <th>Highest Bidding Price</th>
                    <th>Highest Bidder</th>
                    <th>Auction Type</th>
                    <th>New Bidding Price</th>
                </tr>
            </thead>
           <tbody id="forwardAuctionItem">

                <!-- Additional rows for more items -->
            </tbody>
        </table>
            <div class="text-center">
            <form>
                <button type="submit" class="btn btn-primary">Bid</button>
        </form>
        </div>
    </div>

<script>
$(document).ready(function(){
    // Retrieve itemName from the session
    var counter = localStorage.getItem("counter");
    var itemName = localStorage.getItem("keyword");
    var itemDescription = localStorage.getItem("itemDescription");
    var shipmentPrice = localStorage.getItem("shipmentPrice");
    var auctionType = localStorage.getItem("auctionType");
    
    if(counter == 0){
    	var bidPrice = localStorage.getItem("StartingBidPrice");
    }
    
    var expeditedShipmentPrice = localStorage.getItem("ExpeditedShipmentPrice");

    
    $.ajax({
        url: "http://localhost:8080/auction/forwardauction/getbidder",
        type: 'GET',
        success: function(response) {
        	
        	var highestBidder = response.length > 0 ? response[0] : 0;
            var highestBiddingPrice = response.length > 1 ? response[1] : bidPrice;

        	
            // Print out itemName, auctionType, and startingBidPrice
            $("#forwardAuctionItem").append("<tr><td>" + itemName + 
                    "</td><td>" + itemDescription + "</td><td>" +
                    shipmentPrice + "</td><td>" +
                    highestBiddingPrice + "</td><td>" +
                    highestBidder + "</td><td>" +
                    auctionType + "</td>" +
                    "<td><input type='text' id='bidInput' placeholder='Enter bid'></td></tr>");
            },
                    
        error: function(xhr, status, error) {
            console.error('AJAX Request Failed:', xhr, status, error);
            alert('AJAX Request failed: ' + error);
        }
    });
    $("#submitButton").on("click", function() {
        submit();
        /*
        change submit button to the correct name.
        The submit button should take the bid value and run the settingForward 
        bid function.
        The success function of that script will have an if else
       	if ocunter < 2, refresh the forward auction page for all users
       	with updated values else redirect to auction ended.
        */
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
