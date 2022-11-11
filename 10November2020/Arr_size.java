/* Write a program to accept size from user accordingly 
 * accept no from the user and find out the greater no,
 *  smaller no, display no in ascending and descending 
 *  order (Using function and array) */
import java.util.Scanner;

public class Arr_size {
    int i,j,temp,size;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Arr_size obj=new Arr_size();
		 obj.arr_s();
		 
	}
	 public void arr_s()
	{
	   System.out.println("Enter your size.");    //Enter the Length of Array
		size=sc.nextInt();
		
		int num[]=new int[size];    //Array
		
		System.out.println("Enter "+size+" numbers :"); 
		for(i=0;i<size;i++)    //Loop
		{
			num[i]=sc.nextInt();
		}
		grt(num);
		sml(num);
		asc(num);
		DESC(num);
	 } 
	 public void grt(int[] num)//For Greater Number
	 {
		 temp=num[0];
		 for(i=0;i<size;i++)  //Condition
		 {
			 if(temp<num[i])   //If Statement
			 {
				 temp=num[i];
			 }
		 }
		 System.out.println("The Greater Number is="+temp);   //Print
	 }
	 public void sml(int[] num)   //Public Void Function With Parameter For Smallest Number
	 {
		 temp=num[0];
		 for(i=0;i<size;i++)   //condition 
		 {
			 if(temp>num[i])
			 {
				 temp=num[i];
			 }
		 }
		 System.out.println("The Smallest Number is="+temp); //Print the value of temp
	}
      public void asc(int[] num)   //Public Void Function With Parameter For Print Number in Ascending Order 
      {
    	  for(i=0;i<num.length;i++)
    	  {   
    		  for(j=0;j<num.length;j++) 
    		  {
    		    if(num[i]<num[j])
    		     {
    			  temp=num[i];
    			  num[i]=num[j];
    			  num[j]=temp;
    	         }
    	      }
    	  }	  
    	  System.out.println("The Number in Ascending Order is=");  //Print Statement
    	  for(i=0;i<num.length;i++)
    	  {
    		  System.out.println(num[i]);
    	  }
      }
      public void DESC(int[] num)  //Public Void Function With Parameter For Print Number in descending Order 
  	{
  		for(i=0;i<num.length;i++)
  		{
  			for(j=0;j<num.length;j++)
  			{
  				if(num[i]>num[j])
  				{
  					temp=num[i];
  					num[i]=num[j];
  					num[j]=temp;
  				}
  			}
  		}
  		System.out.println("The No in descending order is =");  //print Statement
  		for(i=0;i<num.length;i++)
  		{
  			System.out.println(num[i]);
  		}
  	}
 }
		
		    

	
