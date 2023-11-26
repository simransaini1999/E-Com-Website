<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Auction Items</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
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
                    <th>Remaining Time</th>
                    <th>Select to Bid</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Item 1</td>
                    <td>$100.00</td>
                    <td>Forward Auction</td>
                    <td>2 days 4 hours</td>
                    <td><input type="radio" name="selectedItem" value="item1"></td>
                </tr>
                <tr>
                    <td>Item 2</td>
                    <td>$75.00</td>
                    <td>Dutch Auction</td>
                    <td>-</td>
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
