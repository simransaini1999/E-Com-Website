<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Forget Password</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">

</head>
<body>
    <form id = "forgotPasswordForm">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                    <div class="jumbotron">
                        <h1 class="text-center">Forgot Password?</h1>
                        <br>
                        <div class="form-group">
                            <label class="control-label" for="username">Username</label>
                            <input type="text" name="username" class="form-control" placeholder="Username">
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="newPassword">New Password</label>
                            <input type="password" name="newPassword" class="form-control" placeholder="New Password">
                        </div>
                        <div class="form-group">
                            <button type="reset" class="btn btn-primary">Reset</button>
                            <a href="/loginjsp/" class="btn btn-secondary">Login Instead</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
            </div>
        </div>
    </form>

<script>
	
	$("#forgotPasswordForm").on('reset', function(e) {
        e.preventDefault();
	
	var username = $('input[name="username"]').val(); 
	var password = $('input[name="newPassword"]').val();
	
	$.ajax({
        url: "http://localhost:8080/login/" + username + "/" + password, 
		type: 'POST',
		 success: function(response) {
             console.log(response);
			
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
