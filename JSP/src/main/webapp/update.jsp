<%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));

	String url = "jdbc:mysql://localhost:3306/t1";
	String user = "root";
	String pass = "root";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, pass);

	PreparedStatement pst = con.prepareStatement("select * from st2 where id=?");
	pst.setInt(1, id);
	ResultSet rs = pst.executeQuery();
	rs.next();
	%>
	<form action="update.jsp">
		Enter sid : <input type="text" name="id" value=<%=rs.getInt(1)%>>
		<br> <br> Enter name : <input type="text" name="name"
			value=<%=rs.getString(2)%>> <br> <br> Enter marks:
		<input type="text" name="marks" value=<%=rs.getFloat(3)%>> <br>
		<br>



		<button type=submit name="update" class="btn btn-success">Update</button>
	</form>

	<%
	if (request.getParameter("update") != null) {

		String name = request.getParameter("name");
		float marks = Float.parseFloat(request.getParameter("marks"));
		pst = con.prepareStatement("update st2 set name=?,marks=? where id=?");
		pst.setInt(3, id);
		pst.setString(1, name);
		pst.setFloat(2, marks);
		pst.executeUpdate();
		response.sendRedirect("index.jsp");

	}
	%>
</body>
</html>