/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2025-01-20 14:55:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Pharmaceutical Company Template</title>\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Header and Navigation -->\r\n");
      out.write("    <header class=\"bg-primary text-white py-3\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Pharma Co.</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"admin.jsp\">Administrator</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"customer.jsp\">Customer</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"contactus.jsp\">Contact Us</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main Content -->\r\n");
      out.write("    <main class=\"container my-5\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-3 mb-4\">\r\n");
      out.write("                <img src=\"images/hioxindia-pharmacy_08.jpg\" class=\"img-fluid rounded mb-3\" alt=\"Pharmaceutist\">\r\n");
      out.write("                <h2>Pharmaceutist</h2>\r\n");
      out.write("                <p>Freedesignertemplates.com has a wide collection of HTML web design templates.</p>\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">View More</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                <h2>Distributor Login</h2>\r\n");
      out.write("                <form name=\"F1\" onsubmit=\"return dil(this)\" action=\"login.jsp\" class=\"needs-validation\" novalidate>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"username\" class=\"form-label\">Login Name</label>\r\n");
      out.write("                        <input type=\"text\" id=\"username\" name=\"username\" class=\"form-control\" required>\r\n");
      out.write("                        <div class=\"invalid-feedback\">Please enter your login name.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"password\" class=\"form-label\">Password</label>\r\n");
      out.write("                        <input type=\"password\" id=\"password\" name=\"password\" class=\"form-control\" required>\r\n");
      out.write("                        <div class=\"invalid-feedback\">Please enter your password.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-secondary\">Clear</button>\r\n");
      out.write("                    <a href=\"Register.jsp\" class=\"d-block mt-3\">New User?</a>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3 mb-4\">\r\n");
      out.write("                <img src=\"images/hioxindia-pharmacy_10.jpg\" class=\"img-fluid rounded mb-3\" alt=\"Drug Store\">\r\n");
      out.write("                <h2>Drug Store</h2>\r\n");
      out.write("                <p>Anyone can use these HTML templates just by replacing the content to the pre-existing site designs.</p>\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">View More</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <h2>Welcome to Pharmaceutical Company Template</h2>\r\n");
      out.write("                <p>This is a free Pharmaceutical Company Template for your online website, blog, or web page under the Health and Medicine category. If you need a professional template for your pharmacy, drug store, or medical store, this template is a great choice.</p>\r\n");
      out.write("                <p>We also offer templates in other categories such as Arts, Agriculture, Computers, Finance, Music, Personal Websites, and more. Browse our collection and find the right template for your needs!</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer class=\"bg-dark text-white py-4\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("            <p>Copyright &copy; Your Company Name</p>\r\n");
      out.write("            <p>Designed by <a href=\"http://www.javatpoint.com\" target=\"_blank\" class=\"text-white\">javatpoint.com</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        (function () {\r\n");
      out.write("            'use strict'\r\n");
      out.write("            var forms = document.querySelectorAll('.needs-validation')\r\n");
      out.write("            Array.prototype.slice.call(forms).forEach(function (form) {\r\n");
      out.write("                form.addEventListener('submit', function (event) {\r\n");
      out.write("                    if (!form.checkValidity()) {\r\n");
      out.write("                        event.preventDefault()\r\n");
      out.write("                        event.stopPropagation()\r\n");
      out.write("                    }\r\n");
      out.write("                    form.classList.add('was-validated')\r\n");
      out.write("                }, false)\r\n");
      out.write("            })\r\n");
      out.write("        })()\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
