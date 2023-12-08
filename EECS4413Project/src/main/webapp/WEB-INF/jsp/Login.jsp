<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="shortcut icon" href="#">
</head>
<body>
    <form id = "loginForm">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                    <div class="jumbotron">
                        <h1 class="text-center">Login Page</h1>
                        <br>
                        <div class="form-group">
                            <label class="control-label" for="username">Username</label>
                            <input type="text" name="username" class="form-control" placeholder="Username">
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="password">Password</label>
                            <input type="password" name="password" class="form-control" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <a href="/forgotpassword/">Forgot your password?</a>
                        </div>
                   
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">Login</button>
                            <a href="/register/" class="btn btn-secondary">Register Instead</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
            </div>
        </div>
    </form>
    
    	<script>
	
	$("#loginForm").on('submit', function(e) {
        e.preventDefault();
	
	var username = $('input[name="username"]').val(); 
	var password = $('input[name="password"]').val();
	
	$.ajax({
        url: "http://localhost:8080/login/" + username + "/" + password, 
		type: 'GET',
		 success: function(response) {
             console.log(response);
			if(response == true){
				
             window.location.href = "/itemjsp/";
			}
			else{
			alert('Login failed: ' + error);
			}
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
