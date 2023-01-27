package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Table_create  extends create_db{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Table_create obj=new Table_create();
    obj.create_table();
	}
	 public void create_table()
     {
    	 String que="create table student_info(Student_id Int primary key,First_name varchar(20),Middle_name varchar (20),Last_name varchar(20),class int not null"
    	 		+ ",Contact varchar(13),Email varchar(30),Grade varchar(2));";
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Root");
	  		PreparedStatement st=con.prepareStatement(que);
			st.execute();
	  			System.out.println("Table has been Created");	  		
		} catch (Exception e) {
			// TODO Auto-generated catch block
	  		System.out.println(e);
		}
}}
