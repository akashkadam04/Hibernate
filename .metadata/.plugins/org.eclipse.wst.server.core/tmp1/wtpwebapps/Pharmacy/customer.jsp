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
</head>
<body>
    <!-- Header and Navigation -->
    <header class="bg-primary text-white py-3">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark">
                <a class="navbar-brand" href="index.jsp">Pharma Co.</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
                        <li class="nav-item"><a class="nav-link" href="admin.jsp">Administrator</a></li>
                        <li class="nav-item"><a class="nav-link" href="customer.jsp">Customer</a></li>
                        <li class="nav-item"><a class="nav-link" href="contactus.jsp">Contact Us</a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </header>

    <!-- Main Content -->
    <main class="container my-5">
        <div class="row">
            <div class="col-lg-3 mb-4">
                <img src="images/hioxindia-pharmacy_08.jpg" class="img-fluid rounded mb-3" alt="Pharmaceutist">
                <h2>Pharmaceutist</h2>
                <p>Freedesignertemplates.com has a wide collection of HTML web design templates.</p>
                <a href="#" class="btn btn-primary">View More</a>
            </div>

            <div class="col-lg-6 mb-4">
                <h2>Distributor Login</h2>
                <form name="F1" onsubmit="return dil(this)" action="login.jsp" class="needs-validation" novalidate>
                    <div class="mb-3">
                        <label for="username" class="form-label">Login Name</label>
                        <input type="text" id="username" name="username" class="form-control" required>
                        <div class="invalid-feedback">Please enter your login name.</div>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" id="password" name="password" class="form-control" required>
                        <div class="invalid-feedback">Please enter your password.</div>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <button type="reset" class="btn btn-secondary">Clear</button>
                    <a href="Register.jsp" class="d-block mt-3">New User?</a>
                </form>
            </div>

            <div class="col-lg-3 mb-4">
                <img src="images/hioxindia-pharmacy_10.jpg" class="img-fluid rounded mb-3" alt="Drug Store">
                <h2>Drug Store</h2>
                <p>Anyone can use these HTML templates just by replacing the content to the pre-existing site designs.</p>
                <a href="#" class="btn btn-primary">View More</a>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12">
                <h2>Welcome to Pharmaceutical Company Template</h2>
                <p>This is a free Pharmaceutical Company Template for your online website, blog, or web page under the Health and Medicine category. If you need a professional template for your pharmacy, drug store, or medical store, this template is a great choice.</p>
                <p>We also offer templates in other categories such as Arts, Agriculture, Computers, Finance, Music, Personal Websites, and more. Browse our collection and find the right template for your needs!</p>
            </div>
        </div>
    </main>

    <!-- Footer -->
    <footer class="bg-dark text-white py-4">
        <div class="container text-center">
            <p>Copyright &copy; Your Company Name</p>
            <p>Designed by <a href="http://www.javatpoint.com" target="_blank" class="text-white">javatpoint.com</a></p>
        </div>
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        (function () {
            'use strict'
            var forms = document.querySelectorAll('.needs-validation')
            Array.prototype.slice.call(forms).forEach(function (form) {
                form.addEventListener('submit', function (event) {
                    if (!form.checkValidity()) {
                        event.preventDefault()
                        event.stopPropagation()
                    }
                    form.classList.add('was-validated')
                }, false)
            })
        })()
    </script>
</body>
</html>
    