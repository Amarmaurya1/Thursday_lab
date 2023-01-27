package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class create_db {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   create_db obj=new create_db();
   obj.db_create();
   obj.create_table();
	}
     public void db_create() {
  	   String que="Create databases Student;";
  	 try {
  		Class.forName("com.mysql.cj.jdbc.Driver");
  		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Root");
  		PreparedStatement st=con.prepareStatement(que);
  		ResultSet rs=st.executeQuery();
  		while(rs.next())
  		{
  			System.out.println(rs.getString(1));
  		}
  	} catch (Exception e) {
  		// TODO Auto-generated catch block
  		System.out.println(e);
  	}
   }
     public void create_table()
     {
    	 String que="create table student_info(Student_id Int primary key,First_name varchar(20),Middle_name varchar (20),Last_name varchar(20),class int not null"
    	 		+ ",Contact varchar(13),Email varchar(30),Grade varchar(2));";
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Root");
	  		PreparedStatement st=con.prepareStatement(que);
			   ResultSet rs=st.executeQuery();
	  			System.out.println("Table has been Created");
	  			con.close();
	  		
		} catch (Exception e) {
			// TODO Auto-generated catch block
	  		System.out.println(e);
		}
     }
  }
 
