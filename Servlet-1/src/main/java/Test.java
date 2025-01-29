import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		HttpSession hs = request.getSession();    //Session Tracing-HttpSession
//		String uname = (String) hs.getAttribute("data");
		PrintWriter pw = response.getWriter();
//		pw.print("Username is:"+uname);
		
		//Cookie ck[] = request.getCookies();      //Session Tracing-Cookies
		//pw.print("Username is:"+ck[0].getValue());
		
		//String uname = request.getParameter("ak");   //URL Writing
		//String lname = request.getParameter("ak1");   //URL Writing
		
		String uname = request.getParameter("data");    //Hidden 
		pw.print("Username is:"+uname);


		
	}

}
