

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
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String qur="Insert into Register(First_name,Last_name,Gender,Contact,Email,Password)values(?,?,?,?,?,?)";
			String first_name,Last_name,Gender,Contact,Email,Password;
			first_name=request.getParameter("firstname");
			Last_name=request.getParameter("lastname");
			Gender=request.getParameter("Gender");
			Contact=request.getParameter("Contact");
			Email=request.getParameter("email");
			Password=request.getParameter("Password");


			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nature", "root", "Root");
			
			PreparedStatement ps=con.prepareStatement(qur);
			
			ps.setString(1, first_name);
			ps.setString(2, Last_name);
			ps.setString(3, Gender);
			ps.setString(4, Contact);
			ps.setString(5, Email);
			ps.setString(6, Password);

			int res=ps.executeUpdate();
		
			if(res>0)
			{
				System.out.println("hii");
	response.sendRedirect("Update_logininfo.jsp");
			}
			else
			{
	response.sendRedirect("Error.jsp");
			}
	con.close();		
			} catch (Exception  e) {
				e.printStackTrace();
			}
		}

	

	}


