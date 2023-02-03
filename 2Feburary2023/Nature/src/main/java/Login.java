

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String qur="select * from Login where Contact=? and Password=?";
			String Contact,Password;
			Contact=request.getParameter("Contact");
			Password=request.getParameter("Password");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nature", "root", "Root");
			
			PreparedStatement ps=con.prepareStatement(qur);
			
			ps.setString(1, Contact);
			ps.setString(2, Password);
			ResultSet res=ps.executeQuery();
		
			if(res.next())
			{
				System.out.println("hii");
	response.sendRedirect("Welcom.jsp");
			}
			else
			{
	response.sendRedirect("Error.jsp");
			}
	con.close();		
			} catch (Exception  e) {
				e.printStackTrace();
			}System.out.println("hii");
		}

	

	}


