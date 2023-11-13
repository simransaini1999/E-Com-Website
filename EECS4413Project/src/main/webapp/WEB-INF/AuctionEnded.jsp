<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Auction Ended</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
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
                    <th>Expedited Shipping</th>
                    <th>Highest Bidder</th>
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Item 1</td>
                    <td>Description of Item 1</td>
                    <td>$25.00</td>
                    <td>$100.00</td>
                    <td>$15.00</td>
                    <td><input type="radio" name="selectedItem" value="item1"></td>
                    <td>ID: 123</td>
                </tr>
            </tbody>
        </table>
            <div class="btn-group">
            <a href="Payment.jsp" class="btn btn-primary">Buy Now</a>
        </div>
        </form>
    </div>

    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
</body>
</html>
