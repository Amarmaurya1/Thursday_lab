//*Write a program to accept radius from user and calculate Area of circle and circumference of circle*//

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
 int r=4;
 double pi=3.14;
 System.out.println("Enter radius of circle");
 r=sc.nextInt();
 double A=pi*r*r;
 double c=2+pi+r;
 System.out.println("Area of circle:"+A);
 System.out.println("Circunference of circle:"+c);
 
 
	}

}
