

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


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			int id = Integer.parseInt(request.getParameter("id"));
			
		
		
	 String url = "jdbc:mysql://localhost:3306/t1";
     String user = "root";
     String pass = "root";
     try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,user,pass);
			 
			pst = con.prepareStatement("delete from st2 where id=?");
			pst.setInt(1, id);
			pst.executeUpdate();
			response.sendRedirect("index.html");
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

























