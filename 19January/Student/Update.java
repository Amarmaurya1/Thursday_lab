package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update  extends Insert{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Update obj=new Update();
  obj.update_table();
	}
  public void update_table()
  {
	  try {
	  String que=("Update Student_info set contact=? where Student_id=?");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the content that you want to update:");
	  String contact=sc.next();
	  int id=sc.nextInt();
	  Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Root");
			PreparedStatement st=con.prepareStatement(que);
			
		st.setString(1,contact);
		st.setInt(2,id);
		int count=st.executeUpdate();
		if(count>0) {
			System.out.println("Table is Updated");
		}
		else {
			System.out.println("Error");
		}
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
