<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selling Item</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1 class="text-center">Selling Your Item</h1>
		<form action="upload_item.jsp" method="post">
			<div class="form-group">
				<label class="control-label" for="itemDescription">Item
					Name</label>
				<textarea name="itemName" class="form-control" rows="1"
					placeholder="Enter item name" required></textarea>
			</div>
			<div class="form-group">
				<label class="control-label" for="itemDescription">Item
					Description</label>
				<textarea name="itemDescription" class="form-control" rows="3"
					placeholder="Enter item description" required></textarea>
			</div>
			<div class="form-group">
				<label class="control-label" for="auctionType">Auction Type</label>
				<select name="auctionType" class="form-control" required>
					<option value="Dutch">--Select--</option>
					<option value="Dutch">Dutch Auction</option>
					<option value="Forward">Forward Auction</option>
				</select>
			</div>
			<div class="form-group">
				<label class="control-label" for="auctionDuration">Auction
					Duration (in days)</label> <input type="number" name="auctionDuration"
					class="form-control" min="1" placeholder="Enter auction duration"
					required>
			</div>
			<div class="form-group">
				<label class="control-label" for="startingBidPrice">Starting
					Bid Price ($)</label> <input type="text" name="startingBidPrice"
					class="form-control" placeholder="Enter starting bid price"
					required>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Upload Item</button>
			</div>
		</form>
	</div>

	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
</body>
</html>
