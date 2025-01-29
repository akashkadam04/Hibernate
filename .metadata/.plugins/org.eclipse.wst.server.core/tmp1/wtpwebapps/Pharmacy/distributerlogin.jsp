<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pharmaceutical Company Template</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script>
        function ctck() {
            var sds = document.getElementById("dum");
            if (sds == null) {
                alert("You are using a free package.\n You are not allowed to remove the tag.\n");
            }
        }

        function dil(form) {
            for (var i = 0; i < form.elements.length; i++) {
                if (form.elements[i].value == "") {
                    alert("Fill out all Fields");
                    document.F1.username.focus();
                    return false;
                }
            }

            if (!isNaN(document.F1.username.value)) {
                alert("User Name must be characters & can't be null");
                document.F1.username.value = "";
                document.F1.username.focus();
                return false;
            }

            if (!isNaN(document.F1.password.value)) {
                alert("Password must be characters & can't be null");
                document.F1.password.value = "";
                document.F1.password.focus();
                return false;
            }

            return true;
        }
    </script>
</head>
<body onload="ctck();">

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Pharma Co.</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
                <li class="nav-item"><a class="nav-link" href="admin.jsp">Administrator</a></li>
                <li class="nav-item"><a class="nav-link" href="distributer.jsp">Distributer</a></li>
                <li class="nav-item"><a class="nav-link" href="customer.jsp">Customer</a></li>
                <li class="nav-item"><a class="nav-link" href="contactus.jsp">Contact Us</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container my-5">
    <div class="row">
        <div class="col-md-3">
            <img src="images/hioxindia-pharmacy_08.jpg" alt="" class="img-fluid">
            <h2>Pharmaceutist</h2>
            <p>Freedesignertemplates.com has a wide collection of HTML web design templates.</p>
            <p><a href="#" class="btn btn-primary">View More</a></p>
        </div>
        <div class="col-md-6">
            <h3 class="text-danger">Welcome to Distributer Login</h3>
            <form name="F1" onsubmit="return dil(this)" action="distributer.jsp">
                <div class="mb-3">
                    <label for="username" class="form-label">Login Name:</label>
                    <input type="text" class="form-control" name="username" id="username">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password:</label>
                    <input type="password" class="form-control" name="password" id="password">
                </div>
                <button type="submit" class="btn btn-success">Submit</button>
                <button type="reset" class="btn btn-secondary">Clear</button>
            </form>
        </div>
        <div class="col-md-3">
            <img src="images/hioxindia-pharmacy_10.jpg" alt="" class="img-fluid">
            <h2>Drug Store</h2>
            <p>Anyone can use these HTML templates just by replacing the content to the pre-existing site designs.</p>
            <p><a href="#" class="btn btn-primary">View More</a></p>
        </div>
    </div>
</div>

<div class="container my-5">
    <div class="row">
        <div class="col-md-3">
            <img src="images/hioxindia-pharmacy_19.jpg" alt="" class="img-fluid">
        </div>
        <div class="col-md-9">
            <h1>Welcome to Pharmaceutical Company</h1>
            <p>This is a free Pharmaceutical Company Template for your online website, blog, or web page in the Health and Medicine category. Anyone looking for a good, professional template for their pharmacy, drug store, or medical store can use this template.</p>
        </div>
    </div>
</div>

<footer class="bg-light text-center py-4">
    <p>Designed by <a id="dum" href="http://www.javatpoint.com" target="_blank">www.javatpoint.com</a></p>
    <p>&copy; Your Company Name</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

