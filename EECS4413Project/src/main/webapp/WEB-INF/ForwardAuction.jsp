<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title> Forward Auction Bidding</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
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
                    <th>Remaining Time</th>
                    <th>New Bidding Price</th>
                    <th>Select to Bid</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Item 1</td>
                    <td>Description of Item 1</td>
                    <td>$25.00</td>
                    <td>$100.00</td>
                    <td>ID: 123</td>
                    <td>Forward Auction</td>
                    <td>2 days 4 hours 15 minutes 10 seconds</td>
                    <td><input type="number" name="newBidPrice" min="101" placeholder="Enter new bid"></td>
                    <td><input type="radio" name="selectedItem" value="item1"></td>
                </tr>
                <tr>
                    <td>Item 2</td>
                    <td>Description of Item 2</td>
                    <td>$15.00</td>
                    <td>$75.00</td>
                    <td>ID: 897</td>
                    <td>Forward Auction</td>
                    <td>1 day 12 hours 30 minutes 5 seconds</td>
                    <td><input type="number" name="newBidPrice" min="76" placeholder="Enter new bid"></td>
                    <td><input type="radio" name="selectedItem" value="item2"></td>
                </tr>
                <!-- Additional rows for more items -->
            </tbody>
        </table>
            <div class="text-center">
                <button type="submit" class="btn btn-primary">Bid</button>
            </div>
        </form>
    </div>

    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
</body>
</html>
