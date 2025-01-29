<%@page import="java.sql.*,java.util.*,java.io.*,com.dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ProductController" method="get">
<p>Are you sure if you want to delete a record:</p>
<input type="text" name="i1">
<button type="submit" value=>Submit</button>
</form>
</body>
</html>