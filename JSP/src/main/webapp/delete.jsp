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
	try {
		int id = Integer.parseInt(request.getParameter("id"));

		String url = "jdbc:mysql://localhost:3306/t1";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);

		PreparedStatement pst = con.prepareStatement("delete from st2 where id=?");
		pst.setInt(1, id);
		pst.executeUpdate();
		response.sendRedirect("index.jsp");
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

</body>
</html>