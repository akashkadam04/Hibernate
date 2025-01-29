

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBConnect;
import com.model.Product;
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
            if(request.getParameter("delete")!=null) {		
			int pid = Integer.parseInt(request.getParameter("pid"));
			try {

				Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("delete from products where pid=?");
				pst.setInt(1, pid);
				pst.executeUpdate();
				response.sendRedirect("products.jsp");
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
	}
	


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("login")!=null) {
			String username = request.getParameter("uname");
			String password = request.getParameter("pass");

			try {
				Connection con=DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("select * from users where username=? and password=?");
				pst.setString(1, username);
				pst.setString(2, password);
				ResultSet rs = pst.executeQuery();

				if(rs.next()) {
					response.sendRedirect("products.jsp");
				}
				else {
					response.sendRedirect("index.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if(request.getParameter("insert")!=null) {

			int pid = Integer.parseInt(request.getParameter("pid"));
			String pname = request.getParameter("pname");
			double price = Double.parseDouble(request.getParameter("price"));
			String color = request.getParameter("color");

			Product product = new Product();
			product.setPid(pid);
			product.setPname(pname);
			product.setPrice(price);
			product.setColor(color);

			try {
				Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("insert into products values(?,?,?,?)");
				pst.setInt(1, product.getPid());
				pst.setString(2, product.getPname());
				pst.setDouble(3, product.getPrice());
				pst.setString(4, product.getColor());
				pst.executeUpdate();
				response.sendRedirect("products.jsp");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

		
		if(request.getParameter("update")!=null) {
		try {
			int pid = Integer.parseInt(request.getParameter("pid"));
			 Connection con = DBConnect.getConnection();
			 PreparedStatement pst = con.prepareStatement("select * from products where pid=?");
			 pst.setInt(1, pid);
			 ResultSet rs = pst.executeQuery();
			 
			 try {
					 pid = Integer.parseInt(request.getParameter("pid"));
					String pname = request.getParameter("pname");
					double price = Double.parseDouble(request.getParameter("price"));
					String color = request.getParameter("color");
					Product product = new Product();
					product.setPid(pid);
					product.setPname(pname);
					product.setPrice(price);
					product.setColor(color);

					  con = DBConnect.getConnection();
					  pst = con.prepareStatement("update products set pname=?,price=?,color=? where pid=?");
					 pst.setInt(4, product.getPid());
					 pst.setString(1, product.getPname());
					 pst.setDouble(2, product.getPrice());
					 pst.setString(3, product.getColor());
					 pst.executeUpdate();
					response.sendRedirect("products.jsp");
				}catch(Exception e) {
					e.printStackTrace();
				}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		}	
		
		
		
		
		
		
		
		

		

		
		
	}

}






























