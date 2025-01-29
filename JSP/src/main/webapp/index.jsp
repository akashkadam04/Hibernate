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

	PreparedStatement pst = con.prepareStatement("select * from st2");
	ResultSet rs = pst.executeQuery();
	%>

	<div class="col-5 offset-4 border shadow p-3 mt-3">

		<h1 class="text-center mt-2 mb-2 display-6">Student Data</h1>
		<table class="table table-bordered">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Marks</th>
				<th>Action</th>
				<th>Action</th>
				<th>Action</th>
			</tr>

			<%
			while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getFloat(3)%></td>
				<td><a href="delete.jsp?id=<%=rs.getInt(1)%>"
					class="btn btn-danger">Delete</a></td>
				<td><a href="update.jsp?id=<%=rs.getInt(1)%>"
					class="btn btn-info">Update</a></td>
			</tr>
			<%
			}
			%>
		</table>
		<div class="border p-3 mt-3">
			<form action="search.jsp">
				Enter id to Search Record:<input type="text" name="search"
					>
				<button type="submit" name="search" class="btn btn-danger">Search Record</button>
				<a href="insert.jsp" class="btn btn-success w-100">Add Student</a>
			</form>
		</div>
		
	</div>
</body>
</html>


































