

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display")
public class Display extends HttpServlet {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	    response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String url = "jdbc:mysql://localhost:3306/t1";
        String user = "root";
        String pass = "root";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,user,pass);
			 
			 pst = con.prepareStatement("select * from st2");
			 rs =  pst.executeQuery();
			 pw.print("<h1>Student Data</h1>");
			 pw.print("<table border=1 cellspacing=0 cellpadding=10>");
			 pw.print("<tr><th>ID</th> <th>Name</th> <th>Marks</th> <th>Action</th> <th>Action</th> ");
			 
			 while(rs.next()) {
				 pw.print("<tr>");
				 pw.print("<td>" + rs.getInt(1) + "</td>");
				 pw.print("<td>" + rs.getString(2) + "</td>");
				 pw.print("<td>" + rs.getFloat(3) + "</td>");
				 pw.print("<td> <a href = 'Delete?id="+rs.getInt(1)+"'>Delete</a> </td>");
			     pw.print("<td> <a href = 'Edit?id="+rs.getInt(1)+"'>Update</a> </td>" );
				 pw.print("</tr>");

				 
			 }
			 pw.print("</table>");
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
        
        
	}

}


















