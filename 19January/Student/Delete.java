package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete extends Update{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Delete obj=new Delete();
 obj.Delete_table();
		 
	}
   public void Delete_table() {
	   try {
		   String que=("delete from Student_info where Student_id=?");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter The Student id  that  what you want to Delete:");
		   int id=sc.nextInt();
		   Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Root");
				PreparedStatement st=con.prepareStatement(que);
			st.setInt(1,id);
				int count=st.executeUpdate();
				if(count>0) {
					System.out.println("Data has been deleted");
				}  
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
}
