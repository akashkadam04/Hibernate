<%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>

<body>
<h1>Insert Data</h1>
	<form action="ProductController" method="post">
		Enter ID : <input type="text" name="pid"> <br> <br>
		Enter Name : <input type="text" name="pname"> <br> <br>
		Enter Price: <input type="text" name="price"> <br> <br>
		Enter Color: <input type="text" name="color"> <br> <br>



		<button type=submit class="btn btn-success" name="insert">Insert</button>
	</form>
</body>
</html>