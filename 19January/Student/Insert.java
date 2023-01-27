package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert extends Table_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Insert obj=new Insert();
 obj.Insert_value();
	}
   public void Insert_value()
   { 
try {
    String que=("Insert into student_info(Student_id,First_name,Middle_name,Last_name,class"
	  		+ ",Contact,Email,Grade)Values(?,?,?,?,?,?,?,?)");
    String first_name,Middle_name,last_name,contact,Email,grade;
    int id,clas;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the student ID:");
    id=sc.nextInt();
    System.out.println("Enter the student First Name:");
    first_name=sc.next();
    System.out.println("Enter the student Middle Name:");
    Middle_name=sc.next();
    System.out.println("Enter the student Last_name:");
    last_name=sc.next();
    System.out.println("Enter the student Class:");
    clas=sc.nextInt();
    System.out.println("Enter the student Contact:");
    contact=sc.next();
    System.out.println("Enter the student Email:");
    Email=sc.next();
    System.out.println("Enter the student Grade:");
    grade=sc.next();
    
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Root");
		PreparedStatement st=con.prepareStatement(que);
	st.setInt(1,id);
	st.setString(2,first_name);
	st.setString(3,Middle_name);
	st.setString(4,last_name);
	st.setInt(5,clas);
	st.setString(6,contact);
	st.setString(7,Email);
	st.setString(8,grade);
	int count=st.executeUpdate();
	if(count>0)
	{
		System.out.println("Data Is Inserted");
	}else
	{
		System.out.println("Error");
	}	
} catch (Exception e) {
	// TODO Auto-generated catch block
System.out.println(e);
}  
   }
}
