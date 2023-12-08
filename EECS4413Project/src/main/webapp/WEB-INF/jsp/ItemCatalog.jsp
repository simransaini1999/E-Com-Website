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
                    <th>Item Description</th>
                    <th>Bidding Price</th>
                    <th>Auction Type</th>
                    
                </tr>          
            </thead>
            <tbody id="catalogueTable">
                
                <!-- Additional rows for more items -->
            </tbody>
        </table>
            <div class="text-center">
            <form>
                <button type="button" class="btn btn-primary" id="submitButton">Go Back</button>
            
        </form>
        </div>
    </div>

<script>
$(document).ready(function(){
  
    $.ajax({
        url: "http://localhost:8080/item/allitems",
        type: 'GET',
        success: function(response) {
        	for (var i = 0; i < response.length; i++) {
                var row = '<tr><td>' + response[i].itemName + '</td><td>' + 
                response[i].itemDescription + '</td><td>' +
                response[i].startingBidPrice + '</td><td>' +
                response[i].auctionType + '</td></tr>';
                $('#catalogueTable').append(row);
            }            
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
         window.location.href = "/";
}
    </script>
</body>
</html>
