<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Sign-Up Page</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="shortcut icon" href="#">
</head>

<body>
	<form id="registrationForm">
		<!-- Your input fields go here -->
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">User Registration</h1>
						<br>
						<div class="form-group">
							<label class="control-label" for="fName">First Name</label> <input
								type="text" name="fName" class="form-control"
								placeholder="First Name">
						</div>
						<div class="form-group">
							<label class="control-label" for="lName">Last Name</label> <input
								type="text" name="lName" class="form-control"
								placeholder="Last Name">
						</div>
						<div class="form-group">
							<label class="control-label" for="streetNumber">Street
								Number</label> <input type="text" name="streetNumber"
								class="form-control" placeholder="Street Number">
						</div>
						<div class="form-group">
							<label class="control-label" for="streetName">Street Name</label>
							<input type="text" name="streetName" class="form-control"
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
							<label class="control-label" for="email">Email</label> <input
								type="text" name="email" class="form-control"
								placeholder="Email">
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
							<a href="/loginjsp/" class="btn btn-secondary">Login Instead</a>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
			</div>
		</div>
	</form>
	



	<script>
    $("#registrationForm").on('submit', function(e) {
        e.preventDefault();
        // Capture form data

        
		var userData = {
				fName: $('input[name="fName"]').val(),
   		 		lName: $('input[name="lName"]').val(),
    			streetNumber: $('input[name="streetNumber"]').val(),
    			streetName: $('input[name="streetName"]').val(),
    			city: $('input[name="city"]').val(),
    			country: $('input[name="country"]').val(),
    			postalCode: $('input[name="postalCode"]').val(),
    			email: $('input[name="email"]').val(),
    			username: $('input[name="username"]').val(),
    			password: $('input[name="password"]').val()
			};
        
        $.ajax({
            url: "http://localhost:8080/signup/createuser", 
			type: 'POST',

			contentType: 'application/json',

			data: JSON.stringify(userData),
			
			 success: function(response) {
                 window.location.href = "/loginjsp/";
             },
             error: function(xhr, status, error) {
                 alert('Registration failed: ' + error);
                 // You might also want to log the details to the console for debugging
                 console.error('XHR Status:', status);
                 console.error('Error:', error);
             }
        });
    });

</script>


</body>
</html>