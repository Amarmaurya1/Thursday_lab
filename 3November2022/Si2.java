/*Accept age and gender from user and display the rate of interest as follow
age above 60 and gender Male (RI= 7 %)
age above 60 and gender FeMale (RI= 7.5 %)
below 60 age = RI 5%*/
import java.util.Scanner;

public class Si2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details();
	}
    public static void details()
    {     
    	 Scanner sc=new Scanner(System.in);
    	  String g;
          int a;
         
          {
              System.out.println("Enter Your Gender:"); //user will enter Gender
              g=sc.next();
              System.out.println("Enter Your Age:");  //User will Enter Age
              a=sc.nextInt();
              
          }  
          
              if(g.equals("Male") || g.equals("Female")) //Check for the gender
              {
                  if(a>1 && a<=60)   //check for age between  1 to 60
                  {
                      if (g.equals("Female") && (a>=1 && a<60)) // check for Gender and age (1to60)
                      {
                    	  System.out.println("Interest==5%");   //Print 5%
                      } else if (g.equals("Female") && (a>=60)) //check for gender female and age (60 and above)
                      {
                    	  System.out.println("Interest==7.5%");  //Print 7.5%
                      } else if (g.equals("Male") && (a>=1 && a<60)) //Check for the gender male  and age (1 to 60)
                      {
                          System.out.println("Interest==5%");//Print 5%
                      } else if (g.equals("Male") && (a>=60))// Check for the male and age 60 and above
                      {
                    	  System.out.println("Interest==7%"); //Print 7%
                      }
                  }
              }
          }
      }
  