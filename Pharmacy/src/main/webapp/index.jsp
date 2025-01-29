<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pharmacy</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<header class="bg-primary text-white py-3">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-dark">
            <a class="navbar-brand" href="#">Pharmacy</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
                    <li class="nav-item"><a class="nav-link" href="admin.jsp">Administrator</a></li>
                    <li class="nav-item"><a class="nav-link" href="distributerlogin.jsp">Distributer</a></li>
                    <li class="nav-item"><a class="nav-link" href="customer.jsp">Customer</a></li>
                    <li class="nav-item"><a class="nav-link" href="contactus.jsp">Contact Us</a></li>
                </ul>
            </div>
        </nav>
    </div>
</header>

<main class="container my-4">
    <% if (request.getAttribute("order") != null) { %>
        <div class="alert alert-primary" role="alert">
            <%= request.getAttribute("order") %>
        </div>
    <% } %>

    <div class="row g-4">
        <div class="col-md-3">
            <div class="card h-100">
                <img src="images/hioxindia-pharmacy_08.jpg" class="card-img-top" alt="Pharmaceutist">
                <div class="card-body">
                    <h5 class="card-title">Pharmaceutist</h5>
                    <p class="card-text">Freedesigner s.com has a wide collection of HTML web design templates.</p>
                    <a href="#" class="btn btn-primary">View More</a>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card h-100">
                <img src="images/hioxindia-pharmacy_10.jpg" class="card-img-top" alt="Drug Store">
                <div class="card-body">
                    <h5 class="card-title">Drug Store</h5>
                    <p class="card-text">Anyone can use these HTML templates just by replacing the content to the pre-existing site designs.</p>
                    <a href="#" class="btn btn-primary">View More</a>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card h-100">
                <img src="images/hioxindia-pharmacy_12.jpg" class="card-img-top" alt="Tablets">
                <div class="card-body">
                    <h5 class="card-title">Tablets</h5>
                    <p class="card-text">This high quality free pharmaceutical company template is built using XHTML and CSS.</p>
                    <a href="#" class="btn btn-primary">View More</a>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card h-100">
                <img src="images/hioxindia-pharmacy_14.jpg" class="card-img-top" alt="Medical Shop">
                <div class="card-body">
                    <h5 class="card-title">Medical Shop</h5>
                    <p class="card-text">With each downloaded template you get an HTML page, respective images, and a CSS file.</p>
                    <a href="#" class="btn btn-primary">View More</a>
                </div>
            </div>
        </div>
    </div>

    <section class="mt-5">
        <div class="row">
            <div class="col-md-4">
                <img src="C:\Users\Lenovo\OneDrive\Desktop\hioxindia-pharmacy_14.jpg" class="img-fluid" alt="Welcome">
            </div>
            <div class="col-md-8">
                <h2>Welcome to Pharmaceutical Company</h2>
                <p>This is a free Pharmaceutical Company template for your online website, blog, or web page which is under the Health and Medicine category. Anyone wanting a good, professional template for their pharmacy, drug store, or medical store will find this the best option. This free pharmaceutical company template is designed by professional designers to make customization easier.</p>
                <p>There are many other template categories like Arts, Agriculture, Computers, Satellite, Cars, Finance, Nature, Music, Personal Website, Religious, Fashion, Furniture, Holiday, Travel, and Nightclubs. Explore the collection of HTML templates, pick the right one, preview it, and download it easily.</p>
            </div>
        </div>
    </section>
</main>

<footer class="bg-dark text-white py-4">
    <div class="container text-center">
        <p class="mb-2">Designed by <a href="#" class="text-white text-decoration-underline">Akash Kadam</a></p>
        <p class="mb-0">&copy; 2025 Your Company Name</p>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>