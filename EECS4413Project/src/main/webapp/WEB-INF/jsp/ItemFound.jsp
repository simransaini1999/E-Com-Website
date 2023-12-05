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
        <h1 class="text-center">Auction Items</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Item Name</th>
                    <th>Bidding Price</th>
                    <th>Auction Type</th>
                   <th>Select to Bid</th>
                </tr>
            </thead>
            <tbody id="itemTableBody">
               
            </tbody>
        </table>
        <div class="text-center">
            <form>
            	<button type="button" class="btn btn-primary" onclick="Bid()">Bid</button>
            
                <button type="button" class="btn btn-secondary" onclick="goBack()">Go Back</button>
            	
            </form>
        </div>
    </div>

    <script>
    $(document).ready(function(){
        // Retrieve itemName from the session
        var itemName = localStorage.getItem("keyword");
        
        $.ajax({
            url: "http://localhost:8080/item/getitem/" + itemName,
            type: 'GET',
            success: function(response) {
                // Print out itemName, auctionType, and startingBidPrice
            	$("#itemTableBody").append("<tr><td>" + response.itemName + 
                        "</td><td>" + response.startingBidPrice + "</td><td>" + 
                        response.auctionType + "</td>" +
                        // Add radio button in a new column
                        "<td><input type='radio' name='bidSelection'></td></tr>");
                localStorage.setItem("auction",response.auctionType);
            },
            error: function(xhr, status, error) {
                console.error('AJAX Request Failed:', xhr, status, error);
                alert('AJAX Request failed: ' + error);
            }
        });
    });

    function Bid(){
    	
    	var itemName = localStorage.getItem("keyword");
    	var auctionType = localStorage.getItem("auction");
    	$.ajax({
            url: "http://localhost:8080/item/selectitem/" + itemName,
            type: 'POST',
            success: function(response) {
            	console.log(auctionType); 
            		 if(auctionType ==  "Dutch Auction"){
            			window.location.href = "/DutchAuctionjsp/";
            		}else{
            			window.location.href = "/ForwardAuctionjsp/";
            		} 
                 },
            error: function(xhr, status, error) {
                console.error('AJAX Request Failed:', xhr, status, error);
                alert('AJAX Request failed: ' + error);
            }
        });
    }
    function goBack() {
        window.history.back();
    }
</script>

   
</body>
</html>