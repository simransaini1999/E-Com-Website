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
        <h1 class="text-center">Bidding History</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Bidder ID</th>
                    <th>Bidder Amount</th>
                </tr>
            </thead>
           <tbody id="historyTable">

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
        url: "http://localhost:8080/payment/gethistory",
        type: 'GET',
        success: function(response) {
        	for (var i = 0; i < response.length; i++) {
                var row = '<tr><td>' + response[i].bidderID + '</td><td>' + response[i].bidAmount + '</td></tr>';
                $('#historyTable').append(row);
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
         window.location.href = "/auctionended/";
}
    </script>
</body>
</html>