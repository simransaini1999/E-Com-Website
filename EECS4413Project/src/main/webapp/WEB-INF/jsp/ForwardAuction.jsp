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

<body onload = "refresh()">
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
                    
                </tr>
            </thead>
           <tbody id="forwardAuctionItem">

                <!-- Additional rows for more items -->
            </tbody>
        </table>
            <div class="text-center">
            <form>
    
        <label for="bidInput">Enter Bid Amount:</label>
        <input type="text" name="bidInput" class="form-control" placeholder="Enter bid amount">
    
    <button type="button" class="btn btn-primary" id="submitButton">Buy Now</button>
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
    var bidPrice;
    
    if(counter == 0){
        bidPrice = localStorage.getItem("StartingBidPrice");
        
    }
    else{
        bidPrice = localStorage.getItem("BidPrice");
    }
    console.log("Bid price", bidPrice);
    
    var expeditedShipmentPrice = localStorage.getItem("ExpeditedShipmentPrice");

    
    $.ajax({
        url: "http://localhost:8080/auction/forwardauction/getbidder",
        type: 'GET',
        success: function(response) {
            
			var highestBidder = response
			localStorage.setItem("Highestbidder", highestBidder);

            // Print out itemName, auctionType, and startingBidPrice
            $("#forwardAuctionItem").append("<tr><td>" + itemName +
                "</td><td>" + itemDescription + "</td><td>" +
                shipmentPrice + "</td><td>" +
                bidPrice + "</td><td>" +
                highestBidder + "</td><td>" +
                auctionType + "</td></tr>");
        },
        error: function(xhr, status, error) {
            console.error('AJAX Request Failed:', xhr, status, error);
            alert('AJAX Request failed: ' + error);
        }
    });
    
        
    $("#submitButton").on("click", function() {
        // Retrieve the bid input value here
        var bid = $('input[name="bidInput"]').val();

        // Store the bid value in the localStorage with the key "BidPrice"
        checkBid = localStorage.getItem("BidPrice");
        if(bid<checkBid){
        	counter--;
        	alert('Enter a bid higher than current bid');
        }else{
        	
        localStorage.setItem("BidPrice", bid);
        }
        console.log("Bid entered:", bid);
        
        submit();
    });
});

function submit(){
    var bid = localStorage.getItem("BidPrice");
    var counter = localStorage.getItem("counter");
    console.log("Bid in local storage ", bid);
    $.ajax({
        url: "http://localhost:8080/auction/forwardauction/" + bid,
        type: 'POST',
        contentType: 'application/json',
        success: function(response) {
            console.log("response is ",response);
            if(counter == 1){
                window.location.href = "/auctionendedjsp/";
            } else {
                console.log(counter);
                counter++;
                localStorage.setItem("counter", counter);
                console.log(counter);
                window.location.href = "/ForwardAuctionjsp/";
            }
        },
        error: function(xhr, status, error) {
            console.error('AJAX Request Failed:', xhr, status, error);
            alert('AJAX Request failed: ' + error);
        }
    });
}

function refresh(){
	setInterval(function () {
        location.reload(true); // Reload the page, forcing cache refresh
    }, 10000);
}
</script>

</body>
</html>
