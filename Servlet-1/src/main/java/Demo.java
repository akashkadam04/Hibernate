import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String uname = request.getParameter("uname");
		String lname = request.getParameter("lname");

		pw.print("Username is:"+uname+"<br>"+"Lastname is:"+lname);
		

//		String pass = request.getParameter("pass");
//		String mobile = request.getParameter("mobile");
//		String email = request.getParameter("email");
//    
//		pw.print("Name is:"+uname+"<br>"+"Password is:"+pass+"<br>"+"Phone Number is:"+mobile+"<br>"+"Mail is:"+email);
		
		//response.sendRedirect(" second servlet class name"); Methods of both servlet should be same
		
		
		//RequestDispatcher dis = request.getRequestDispatcher("second servlet class name");
		//dis.forward(request, response);
		
//		HttpSession hs = request.getSession();
//		hs.setAttribute("data", uname);
		
//		Cookie ck = new Cookie("data", lname);    
//		response.addCookie(ck);
		//pw.print("<a href='Test?ak="+uname+"?ak1="+lname+"'>Go to Second servlet<a>");   
		
		pw.print("<form action='Test'>"
				+"<input type='hidden' name='data' value="+uname+">"
				+"<button type='submit'>Submit</button>"
			    + "</form>");
		
		
		}
	}


