/*Write a program to accept 5 students record from the 
 * user and calculate the grade and percentage. (accept 
 * name, roll_no, Marks of 5 Subject) Perform by using 
 * array and function*/
import java.util.Scanner;

public class Students {

	String name;
	int roll,i,sum,per;
	int marks[]=new int[5];
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Students[] obj=new Students[5];  //create a class
		for(int i=0;i<5;i++)  //loop
		{
			obj[i]=new Students(); 
			System.out.println("Enter the student details");   //Print the given Statement
			obj[i].accept();  
		}
		System.out.println("The Enterd details are:");    //Print the given Statement
		for(int i=0;i<5;i++)  //loop
		{
		obj[i].calc_per();
		obj[i].grade();
		}
		
	}
	public void accept()      //to Accept the  Value From User
	{
		
		
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your roll no");
		roll=sc.nextInt();
		System.out.println("Enter marks of 5 Subject");
		for(i=0;i<5;i++)    //Loop for Marks
		{
			marks[i]=sc.nextInt();
		}
		
	}
	public void calc_per()   //Calculate the percentage
	{
		for(i=0;i<5;i++)  //Loop
		{
			sum=sum+marks[i];   
		}
		
		per=(sum*100)/500;  //Calculation
		
		System.out.println("name="+name);
		System.out.println("Roll number="+roll);
		System.out.println("The percentage is ="+per);
	}
	public void grade()
	{
		System.out.println("name="+name);
		System.out.println("Roll number="+roll);
		System.out.println("The percentage is ="+per);
		if(per>=90 && per<=100)
		{
			System.out.println("O Grade");    //if Percentage is between 90 to 100 then Print O Grade
		}
		else if(per>=70 && per<89)
		{
			System.out.println("A Grade");   //if Percentage is between 70 to 89  then Print  A Grade 
		}
		else if(per>=50 && per<69)
		{
			System.out.println("B Grade");   //if Percentage is between 50 to 69  then Print  B Grade 
		}
		else if(per>=35 && per<49)
		{
			System.out.println("C Grade");    //if Percentage is between 35 to  then Print  C Grade 
		}
		else
		{
			System.out.println("D Grade");    //if Percentage is Less then Print  D Grade 
		}
		
	}

}