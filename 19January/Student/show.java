package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    show obj=new show();
    obj.shw();
	}
public void shw()
{
   try{
	   String que=("select * from Student_info");
	   Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Root");
			PreparedStatement st=con.prepareStatement(que);
			 ResultSet rs=st.executeQuery();
	           System.out.println(" Student_id  \t  first_name  \t   Middle_name   \t   last_name   \t   class   \t   contact  \t  Email  \t  Grade");
	           while(rs.next()) {
					System.out.println(rs.getInt(1)+"  \t"+rs.getString(2)+"  \t"+rs.getString(3)+"  \t  "+rs.getString(4)+"  \t  "+rs.getInt(5)+"  \t  "+rs.getString(6)+"  \t  "+rs.getString(7)+"  \t  "+rs.getString(8));
				}
	  			con.close();
   }catch(Exception e) {
	   System.out.println(e);
   }
}
}
