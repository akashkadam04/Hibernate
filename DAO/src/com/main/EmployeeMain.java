package com.main;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		
		EmployeeDao dao = new EmployeeDao();
		dao.connect();
		
		 while(true) {
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enlter your choice");
	         System.out.println("1.Insert" +"\n"+  "2.Delete by ID" +"/n"+ "3.Update by ID" +"/n"+ "4.Select All Records " +"/n"+ "5.Exit");
	         int ch = s.nextInt();
	         
	        	 switch(ch) {
	        	 case 1:
	        		//Insert Record
	        			Employee emp = new Employee();
	        			emp.setEid(102);
	        			emp.setEname("Rohit");
	        			emp.setMono(988654321);
	        			dao.insertRecord(emp);
	        			break;
	        			
	        	 case 2:
	        		//Delete Record
	        			Employee emp1 = new Employee();
	        			emp1.setEid(101);
	        			dao.deleteRecord(emp1);
	        			break;
	        			
	        	 case 3:
	        		//Update Record
	        			Employee emp2 = new Employee();
	        			emp2.setEid(0);
	        			emp2.setEname(null);
	        			emp2.setMono(0);
	        			dao.updateRecord(emp2);
	        			break;
	        			
	        	 case 4:
	        		//Disp Record
	        			Employee emp3 = new Employee();
	        			dao.dispRecord(emp3);
	        			break;
	        			
	        	 case 5:
	        		 System.exit(0);
	        		 break;
	        		 
	        	 default:
	        		 System.out.println("Invalid Choice");
	        		 break;
	        	 }
	        	
	        		 
		 }

	        
		
	}

}
