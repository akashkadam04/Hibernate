<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>

	<%
	String url = "jdbc:mysql://localhost:3306/t1";
	String user = "root";
	String pass = "root";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, pass);

	PreparedStatement pst = con.prepareStatement("select * from products");
	ResultSet rs = pst.executeQuery();
	%>

	<div class="col-5 offset-4 border shadow p-3 mt-3">

		<h1 class="text-center mt-2 mb-2 display-6">Product Data</h1>
		<table class="table table-bordered">
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Product Price</th>
				<th>Color</th>
				<th>Action</th>
			</tr>

			<%
			while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getDouble(3)%></td>
				<td><%=rs.getString(4)%></td>

				<td><a href="ProductController?pid=<%=rs.getInt(1)%>"
					name="delete" class="btn btn-danger">Delete</a></td>
				<td><a href="update.jsp?pid=<%=rs.getInt(1)%>"
					class="btn btn-info">Update</a></td>

			</tr>
			<%
			}
			%>
		</table>
		

		<a href="insert.jsp" class="btn btn-success w-100">Add Product</a>

	</div>

	</div>
</body>
</html>


































