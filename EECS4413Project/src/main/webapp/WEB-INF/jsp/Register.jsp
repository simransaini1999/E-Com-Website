<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign-Up Page</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form id="registrationForm" action="/signup/createuser" method="post">
    <!-- Your input fields go here -->
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">User Registration</h1>
						<br>
						<div class="form-group">
							<label class="control-label" for="firstName">First Name</label> <input
								type="text" name="firstName" class="form-control"
								placeholder="First Name">
						</div>
						<div class="form-group">
							<label class="control-label" for="lastName">Last Name</label> <input
								type="text" name="lastName" class="form-control"
								placeholder="Last Name">
						</div>
						<div class="form-group">
							<label class="control-label" for="street">Street Number</label> <input
								type="text" name="street" class="form-control"
								placeholder="Street Number">
						</div>
						<div class="form-group">
							<label class="control-label" for="street">Street Name</label> <input
								type="text" name="street" class="form-control"
								placeholder="Street Name">
						</div>
						<div class="form-group">
							<label class="control-label" for="city">City</label> <input
								type="text" name="city" class="form-control" placeholder="City">
						</div>
						<div class="form-group">
							<label class="control-label" for="country">Country</label> <input
								type="text" name="country" class="form-control"
								placeholder="Country">
						</div>
						<div class="form-group">
							<label class="control-label" for="postalCode">Postal Code</label>
							<input type="text" name="postalCode" class="form-control"
								placeholder="Postal Code">
						</div>
						<div class="form-group">
							<label class="control-label" for="username">Create a
								Username</label> <input type="text" name="username" class="form-control"
								placeholder="Username">
						</div>
						<div class="form-group">
							<label class="control-label" for="password">Password</label> <input
								type="password" name="password" class="form-control"
								placeholder="Password">
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary">Register</button>
							<a href="Login.jsp" class="btn btn-secondary">Login Instead</a>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
			</div>
		</div>
	</form>
	
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
	
	<script type="text/javascript">
    //$(document).ready(function() {
        $("#registrationForm").on('submit', function(e) {
            e.preventDefault();

            // Capture form data
            var userData = {
                firstName: $('input[name="firstName"]').val(),
                lastName: $('input[name="lastName"]').val(),
                street: $('input[name="street"]').val(),
                city: $('input[name="city"]').val(),
                country: $('input[name="country"]').val(),
                postalCode: $('input[name="postalCode"]').val(),
                username: $('input[name="username"]').val(),
                password: $('input[name="password"]').val()
            };
            
            $.ajax({
                url: $(this).attr('action'), 
                type: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(userData),
                success: function(response) {
                    alert('Registration successful!');
                    // Redirect or update UI as needed
                },
                error: function(xhr, status, error) {
                    alert('Registration failed: ' + error);
                }
            });
        });
    //});
</script>


</body>
</html>
