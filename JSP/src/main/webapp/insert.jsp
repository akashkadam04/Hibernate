<%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<%
try {
	String url = "jdbc:mysql://localhost:3306/t1";
	String user = "root";
	String pass = "root";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, pass);

	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	float marks = Float.parseFloat(request.getParameter("marks"));

	PreparedStatement pst = con.prepareStatement("insert into st2 values(?,?,?)");
	pst.setInt(1, id);
	pst.setString(2, name);
	pst.setFloat(3, marks);
	pst.executeUpdate();
	response.sendRedirect("index.jsp");
} catch (Exception e) {
	e.printStackTrace();
}
%>
<body>
	<form>
		Enter sid : <input type="text" name="id"> <br> <br>
		Enter name : <input type="text" name="name"> <br> <br>
		Enter marks: <input type="text" name="marks"> <br> <br>



		<button type=submit class="btn btn-success">Insert</button>
	</form>
</body>
</html>