import java.sql.*;
import java.util.*;
public class A {

	public static void main(String[] args) throws Exception {
         String url = "jdbc:mysql://localhost:3306/t1";
         String user = "root";
         String pass = "root";
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(url,user,pass);
         System.out.println("Connection Successful!!!");
         PreparedStatement pst ;
         ResultSet rs;
         Scanner s = new Scanner(System.in);
         Statement st = con.createStatement();

        

         
         //Table creation
        // String query = "create table student(rno int,name varchar(20),marks float)";
         //st.execute(query);
         
         //Insert values
        // String query = "insert into student values(2,'Shyam',75),(3,'Ram',82)";
         //st.executeUpdate(query);
         
         //delete record
         //String query = "delete from student where rno=3";
        // st.executeUpdate(query);
         
         //update record
        // String query = "update student set marks=70 where rno = 2";
         //st.executeUpdate(query);
         
         //Select 
//         String query = "select * from student ";
//         ResultSet rs = st.executeQuery(query);
//         rs.next();
//         System.out.println("Rno:"+rs.getInt(1));
//         System.out.println("Name:"+rs.getString(2));
//         System.out.println("Marks:"+rs.getFloat(3));
//         String query = "delete from student where rno=?";
//         System.out.println("ENter rno:");
//         pst.setInt(1, s.nextInt());
//         pst.executeUpdate();
         
//         CallableStatement cs = con.prepareCall("{call p1()}");
//         ResultSet rs = cs.executeQuery();
//         while(rs.next()) {
//        	 System.out.println(rs.getInt("rno"));
//        	 System.out.println(rs.getString("name"));
//        	 System.out.println(rs.getFloat("marks"));
//
//         }
         
         while(true) {

         System.out.println("Enlter your choice");
         System.out.println("1.Insert" +"\n"+ "2.Select Single Record" +"/n"+ "3.Select All Records" +"/n"+ "4.Delete by ID" +"/n"+ "5.Update by ID" +"/n"+ "6.Exit");
         int ch = s.nextInt();
         
        	 switch(ch) {
        	 case 1:
        		 System.out.println("Enter Sid,Sname.marks:");
        		 pst = con.prepareStatement("insert into student values(?,?,?)");
        		 System.out.println("Enter Roll no:");
        		 pst.setInt(1, s.nextInt());
        		 System.out.println("Enter name:");
        		 pst.setString(2, s.next());
        		 System.out.println("Enter marks:");
        		 pst.setFloat(3, s.nextFloat());
        		 pst.executeUpdate();
        		 System.out.println("Record Inserted..!");
    			 System.out.println("------------------------------------");
        		 break;
        	
        	 case 2:
        		 try {
        		 System.out.println("Enter Sid to get record:");
        		 pst = con.prepareStatement("select * from student where rno="+s.nextInt());
        		 rs = pst.executeQuery();
        		 rs.next();
        		 System.out.println("Roll No:"+rs.getInt(1));
        		 System.out.println("Name:"+rs.getString(2));
        		 System.out.println("Marks:"+rs.getFloat(3));
    			 System.out.println("------------------------------------");
        		 }catch(Exception e) {
        			 System.out.println("Invalid Sid!!");
        		 }
        		 break;
        		 
        	 case 3:
        		 pst = con.prepareStatement("select * from student");
        		 rs = pst.executeQuery();
        		 
        		 while(rs.next()) {
        			 System.out.println("------------------------------------");
        			 System.out.println("Roll No:" + rs.getInt(1));
        			 System.out.println("Name:" + rs.getString(2));
        			 System.out.println("Marks:" + rs.getFloat(3));
        			 System.out.println("------------------------------------");
        		 }
        		 break;
        		
        	 case 4:
        		 try {
        		 System.out.println("Enter Sid to delete record:");
        		 pst = con.prepareStatement("delete from student where rno=?");
        		 System.out.println("Enter Roll no:");
        		 pst.setInt(1, s.nextInt());
        		 pst.executeUpdate();
        		 System.out.println("Record deleted!!!");
    			 System.out.println("------------------------------------");
        	     }catch(Exception e) {
        	    	 System.out.println("Invalid Sid");
        	     }
        		 break;
        		 
        	 case 5:
        		 try {
        		 System.out.println("Enter Sid to update record:");
        		 pst = con.prepareStatement("update student set name=?,marks=? where rno=?");
        		 System.out.println("Enter Roll no:");
        		 pst.setInt(3, s.nextInt());
        		 System.out.println("Enter name for update:");
        		 pst.setString(1, s.next());
        		 System.out.println("Enter marks for update:");
        		 pst.setFloat(2, s.nextFloat());
        		 pst.executeUpdate();
        		 System.out.println("Record updated!!!");
    			 System.out.println("------------------------------------");
        		 }catch(Exception e) {
        	    	 System.out.println("Invalid Sid");
        	     }
        		 break;
        		 
        	 case 6:
        		 System.exit(0);
        		 break;
        		 
        	default :
        		System.out.println("Enter valid choice!!");
        		break;
        		 
        	 }
         }

         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	}
}
























































