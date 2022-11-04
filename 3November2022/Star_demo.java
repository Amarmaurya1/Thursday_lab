/*Write a program to display the following pattern  
    *         	
   ***		
  *****		
 *******		
*********
 */
public class Star_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     demo();
	}
    public static void demo()
    {
    	int i, j;       
    	//Outer loop work for rows  
    	for (i=0; i<=5; i++)   
    	{  
    	//inner loop work for space      
    	for (j=4; j>=i; j--)   
    	{  
    	System.out.print(" ");   
    	}   
    	//inner loop for columns  
    	for (j=1; j<2*i; j++)   
    	{   
    	//print star      
    	System.out.print("* ");   
    	}   
    	//throws the cursor in a new line after printing each line  
    	System.out.println();   
    	}   
    	}   
    	}  