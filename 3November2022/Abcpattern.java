/*Write a program to display the following pattern
 * A
   BC
   DEF
   GHIJ
   KLMNO

 * */
 
public class Abcpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     demo();
	}
  public static void demo()
  {
	  int i,j;
		char ch='A';
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(ch+"");
				ch++;
			}
			
			System.out.println();
		}
 
  }
}
