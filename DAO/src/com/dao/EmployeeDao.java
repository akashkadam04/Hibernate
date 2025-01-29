package com.dao;

import java.sql.*;

import com.model.Employee;


public class EmployeeDao {
	
	 PreparedStatement pst;
	 Connection con;
	 ResultSet rs;
	 
	 public void connect() throws Exception {
		 String url = "jdbc:mysql://localhost:3306/t1";
         String user = "root";
         String pass = "root";
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(url,user,pass);
         System.out.println("Connection Successful!!!");
	 }
	 
	 public void insertRecord(Employee emp) throws Exception {
		 pst = con.prepareStatement("insert into employee values(?,?,?)");
		 pst.setInt(1, emp.getEid());
		 pst.setString(2, emp.getEname());
		 pst.setLong(3, emp.getMono());
		 pst.executeUpdate();
		 System.out.println("Record Inserted..!");

	 }
	 
	 public void deleteRecord(Employee emp) throws Exception {
		 pst = con.prepareStatement("delete from employee where eid=?");
		 pst.setInt(1, emp.getEid());
		 pst.executeUpdate();
		 System.out.println("Record Deleted..!");
	 }
	 
	 public void updateRecord(Employee emp) throws Exception{
		 pst = con.prepareStatement("update employee set ename=?,mono=? where eid=?");
		 pst.setInt(3, emp.getEid());
		 pst.setString(1, emp.getEname());
		 pst.setLong(2, emp.getMono());
		 pst.executeUpdate();
		 System.out.println("Record Updated..!");
	 }
	 
	 public void dispRecord(Employee emp) throws SQLException {
		 pst = con.prepareStatement("select * from employee");
		 rs = pst.executeQuery();
		 while(rs.next()) {
			 System.out.println("------------------------------------");
			 System.out.println("Eid:" + rs.getInt(1));
			 System.out.println("Ename:" + rs.getString(2));
			 System.out.println("Mono:" + rs.getLong(3));
			 System.out.println("------------------------------------");
		 }
	 }
	 
}
