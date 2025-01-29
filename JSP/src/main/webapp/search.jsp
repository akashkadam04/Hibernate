<%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
 if(request.getParameter("search")!=null){
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

	<div class="col-3offset-4 border shadow p-3 mt-3">
		<table class="table table-bordered">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Marks</th>
			</tr>

			<tr>
				<td><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getFloat(3)%></td>
			</tr>

		</table>
	</div>
	<%}
	%>

</body>
</html>