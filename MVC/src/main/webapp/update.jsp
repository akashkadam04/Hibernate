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
<h1>Update Data</h1>

<form action="ProductController" method="post">
		Enter ID : <input type="text" name="pid"> <br> <br>
		Enter New Name : <input type="text" name="pname"> <br> <br>
		Enter New Price: <input type="text" name="price"> <br> <br>
		Enter New Color: <input type="text" name="color"> <br> <br>

    <%!ResultSet rs; %>
       
		<button type=submit class="btn btn-success" name="update"  >Update</button>
	</form>
</body>
</html>