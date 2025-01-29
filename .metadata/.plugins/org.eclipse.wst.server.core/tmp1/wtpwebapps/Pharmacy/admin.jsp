<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pharmaceutical Company Template</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .header {
            background-color: #007bff;
            color: white;
            padding: 10px 0;
        }
        .header ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
        }
        .header ul li {
            margin: 0 15px;
        }
        .header ul li a {
            color: white;
            text-decoration: none;
        }
        .footer {
            background-color: #f8f9fa;
            padding: 20px 0;
        }
        .footer a {
            color: #007bff;
            text-decoration: none;
        }
        .footer a:hover {
            text-decoration: underline;
        }
    </style>
    <script>
        function validateForm(form) {
            for (let i = 0; i < form.elements.length; i++) {
                if (form.elements[i].value === "") {
                    alert("Fill out all Fields");
                    form.elements[i].focus();
                    return false;
                }
            }

            if (!isNaN(form.username.value)) {
                alert("User Name must be characters and can't be null");
                form.username.value = "";
                form.username.focus();
                return false;
            }

            if (!isNaN(form.password.value)) {
                alert("Password must be characters and can't be null");
                form.password.value = "";
                form.password.focus();
                return false;
            }

            return true;
        }
    </script>
</head>
<body>

<div class="header text-center">
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="about.jsp">About Us</a></li>
        <li><a href="admin.jsp">Administrator</a></li>
        <li><a href="distributerlogin.jsp">Distributor</a></li>
        <li><a href="customer.jsp">Customer</a></li>
        <li><a href="contactus.jsp">Contact Us</a></li>
    </ul>
</div>

<div class="container my-5">
    <div class="row">
        <div class="col-md-3">
            <img src="C:\Users\Lenovo\OneDrive\Pictures\pharma/hioxindia-pharmacy_08.jpg" alt="" class="img-fluid mb-3">
            <h2>Pharmaceutist</h2>
            <p>Freedesignertemplates.com has a wide collection of HTML web design templates.</p>
            <a href="#" class="btn btn-primary btn-sm">View More</a>
        </div>

        <div class="col-md-6">
            <h1 class="text-center text-primary">WELCOME TO ADMINISTRATION LOGIN</h1>
            <% if (request.getAttribute("aa") != null) { %>
            <div class="alert alert-info">
                <%= request.getAttribute("aa") %>
            </div>
            <% } %>
            <form name="F1" onsubmit="return validateForm(this)" action="adminprocess.jsp" class="mt-4">
                <div class="mb-3">
                    <label for="username" class="form-label">Login Name:</label>
                    <input type="text" name="username" id="username" class="form-control">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password:</label>
                    <input type="password" name="password" id="password" class="form-control">
                </div>
                <div class="d-flex justify-content-between">
                    <button type="submit" class="btn btn-success">Submit</button>
                    <button type="reset" class="btn btn-secondary">Clear</button>
                </div>
            </form>
        </div>

        <div class="col-md-3">
            <img src="C:\Users\Lenovo\OneDrive\Pictures\pharma/hioxindia-pharmacy_10.jpg" alt="" class="img-fluid mb-3">
            <h2>Drug Store</h2>
            <p>Use these HTML templates by replacing the content with your pre-existing site designs.</p>
            <a href="#" class="btn btn-primary btn-sm">View More</a>
        </div>
    </div>

    <div class="row mt-5">
        <div class="col-md-12">
            <h1>Welcome to Pharmaceutical Company</h1>
            <p>This is a free Pharmaceutical Company Template for your website or blog. It's perfect for pharmacy, drug store, or medical store websites. Professionally designed to simplify customization.</p>
        </div>
    </div>
</div>

<div class="footer text-center">
    <div class="container">
        <ul class="list-inline">
            <li class="list-inline-item"><a href="#">Home</a></li>
            <li class="list-inline-item"><a href="#">About Us</a></li>
            <li class="list-inline-item"><a href="#">Specials</a></li>
            <li class="list-inline-item"><a href="#">All Products</a></li>
            <li class="list-inline-item"><a href="#">Contact Us</a></li>
        </ul>
    </div>
</div>

</body>
</html>
    