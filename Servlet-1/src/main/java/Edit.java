

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


@WebServlet("/Edit")
public class Edit extends HttpServlet {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));

		String url = "jdbc:mysql://localhost:3306/t1";
        String user = "root";
        String pass = "root";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,user,pass);
			 
			 pst = con.prepareStatement("select * from st2 where id=?");
			 pst.setInt(1, id);
			 rs = pst.executeQuery();
			 rs.next();
			 
			 pw.print("<h1>Insert Student</h1>\r\n"
			 		+ "<form action=\"Update\"  >\r\n"
			 		+ "    Enter New sid:<input type=\"text\" name=\"id\" value='"+rs.getInt(1)+"'><br><br>\r\n"
			 		+ "    Enter New name:<input type=\"text\" name=\"name\"value='"+rs.getString(2)+"'><br><br>\r\n"
			 		+ "    Enter New marks:<input type=\"text\" name=\"marks\"value='"+rs.getFloat(3)+"'><br><br>\r\n"
			 		+ "    <button type=\"submit\">Submit</button>\r\n"
			 		+ "</form>");

					 
					
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}





























