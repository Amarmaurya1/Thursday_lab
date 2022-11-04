/*  Write a program to display the following pattern
    1
   10
  101
 1010
10101 */
public class Numpattern {

	public static void main(String[] args)
	{
	 // TODO Auto-generated method stub
     demo();
	}
    public static void demo()
    {
    	int i,j;
    
    for(i=1;i<=5;i++)//row
    {
    	for (j=4;j>=i;j--)//space
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        { 
            if(j%2==0)
            {
                System.out.print("0");
            }
            
            else
            {
                System.out.print("1");
            }
        }
        
        System.out.println();
        }
       
    }

    
    } 

