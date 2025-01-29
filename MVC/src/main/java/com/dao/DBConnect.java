package com.dao;

import java.sql.*;

public class DBConnect {
     
	public static Connection con;
	
	public static Connection getConnection() throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/t1","root", "root");
		return con;
	}
	
}
