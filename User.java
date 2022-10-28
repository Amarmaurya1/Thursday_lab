//*Write a program to accept your basic details (Name, No, Gmail, Address ,gender, percentage ) from user and display the output*//
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,c,d,e,b,f;
		
		
	
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your name:");
     a=sc.next();
     System.out.println("Enter your Number:");
     b=sc.next();
     System.out.println("Enter your Address:");
     c=sc.next();
     System.out.println("Enter your Gmail:");
     d=sc.next();
     System.out.println("Enter your Gender:");
     e=sc.next();
     System.out.println("Enter your Percentage:");
     f=sc.next();
     
     System.out.println("My name:"+a);
     System.out.println("My Number:"+b);
     System.out.println("My Adress:"+c);
     System.out.println("My Gmail:"+d);
     System.out.println("My Gender:"+e);
     System.out.println("My Percentage:"+f);
     }

}




