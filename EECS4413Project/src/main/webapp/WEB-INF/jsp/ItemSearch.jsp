<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Item Search</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="shortcut icon" href="#">
</head>
<body>
    <form id="itemSearchForm" onsubmit="storeKeyword(event)">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                    <div class="jumbotron">
                        <h3 class="text-center">Search For an Item</h3>
                        <br>
                        <div class="form-group">
                            <label class="control-label" for="keyword">Enter a Keyword:</label>
                            <input type="text" name="keyword" class="form-control" placeholder="Keyword">
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">Search</button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
            </div>
        </div>
    </form>

    <script>
        function storeKeyword(event) {
            event.preventDefault();
            var keyword = $('input[name="keyword"]').val();

            $.ajax({
                url: "/item/getitem/" + keyword, // Replace with your server-side endpoint
                type: 'GET',
                data: { keyword: keyword },
                success: function(response) {
                    console.log("Keyword stored successfully");

                    // Store keyword in session (client-side)
                    localStorage.setItem("keyword", keyword);

                    // Redirect to the destination page
                    window.location.href = "/itemfoundjsp/";
                },
                error: function(xhr, status, error) {
                    alert('Failed to store keyword: ' + error);
                    console.error('XHR Status:', status);
                    console.error('Error:', error);
                }
            });
        }
    </script>
</body>
</html>
