package jdbc.Student;

import java.util.Scanner;

public class choose extends Delete  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	choose obj=new choose();
	obj.Choice();

	}
 public  void Choice() {
	    char Student;
			//String show_db,create_db,create_table,insert_table,update,delete,show_all;
			Scanner sc= new Scanner(System.in);
			System.out.println("Press[s] For Show Database...\nPress[c] For Create Database...\nPress[t] For Create Tables..."
					+ "\nPress[i] For Insert Value...\nPress[u] For Update...\nPress[d] For Delete...");
			Student=sc.next().charAt(0);
			
			switch(Student) 
			{
			case 's':
				show obj=new  show();
				obj.shw();
				break;
			case 'c':
				create_db obj1=new create_db();
				obj1.db_create();
		        break;
			case't':
				Table_create obj2=new Table_create();
				obj2.create_table();
				break;
			case'i':
				Insert obj3=new Insert();
				obj3.Insert_value();
				break;
			case'u':
				Update obj4=new Update();
				obj4.update_table();
				break;
			case'd':
				Delete obj5=new Delete();
				obj5.Delete_table();
				break;	
			}
			System.out.println("\nDo you want to order again:");
			System.out.println("If yes press y or else press n:");
			 char select = sc.next().charAt(0);
			if(select=='y') {
				 select = 't';// t for True.....
				 choose obj=new choose();
				 obj.Choice();
			}
			while(select == 't');
		         select= 'f';
		         System.out.println("end");
		}

	}

