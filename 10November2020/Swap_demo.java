/* Write a program to perform the swapping of two
 *  number with third variable and without third variable 
 *  using function*/
import java.util.Scanner;
public class Swap_demo {
	int n1,n2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       With();
       Without();
	}
    public static void With()  // Using Three Variables
    {
    	int n1,n2,t;
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers:");   // User Will Enter Two Number
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Your number is:"+n1+"   "+n2);  //Print Number
        t=n1;  
        n1=n2;  
        n2=t;  
        System.out.println("Number After swapping: "+n1 +"   " + n2);  //Print both Number After Swapping
        System.out.println( );  	
    }
    public static void Without()   //Without Using Three Variables
    {
        int n1,n2;
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers:");   // User Will Enter Number
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Your number is:"+n1+"   "+n2); //Print Number
        n1=n1+n2;  
        n2=n1-n2; 
        n1=n1-n2;  
        System.out.println("Number After swapping: "+n1 +"   " + n2);  //Print both Number After Swapping 
        System.out.println( );  
}
}