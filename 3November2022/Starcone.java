/* 3)Write a program to display the following pattern
*********
 *******
  *****
   ***
    * */
public class Starcone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     demo();
	}
	public static void demo()
	{
		int i,j;
        //Printing the pattern
		for(i=5;i>=1;i--)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i)-1;j++)
	    	 {
	    		 System.out.print("*");
	    	 }
			System.out.println();
		}
}}

