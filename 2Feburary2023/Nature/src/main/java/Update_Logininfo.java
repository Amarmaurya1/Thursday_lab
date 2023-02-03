

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
 * Servlet implementation class Update_Logininfo
 */
@WebServlet("/Update_Logininfo")
public class Update_Logininfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_Logininfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     try {
         String qur="Insert into Login(Contact,Password) values(?,?)";
			String Contact,Password;
			Contact=request.getParameter("Contact");
			Password=request.getParameter("Password");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nature", "root", "Root");
			
			PreparedStatement ps=con.prepareStatement(qur);
			
			ps.setString(1, Contact);
			ps.setString(2, Password);
			int res=ps.executeUpdate();
		
			if(res>0)
			{
				System.out.println("hii");
	response.sendRedirect("Login.jsp");
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
