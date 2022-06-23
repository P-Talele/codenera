/*10 Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 
*/
import java.util.*;

class  SL
 {
  
 	public static void main(String[]args)
	{
 
 		 Scanner obj=new Scanner(System.in);
		
 
		 System.out.print("\n\t\t\tEnter Basic Salary : ");
			int S=obj.nextInt();
	
			if(S<=10000)
			{
			  double DA=(S*0.8);
			  double HRA=(S*0.2);
			  double GS=(DA+HRA+S);
			  System.out.println("\t\t\tGross Salary Is : " + GS);
			}
				else if(S<=20000)
				{
			 	   double DA=(S*0.9);
			         double HRA=(S*0.25);
			         double GS=(DA+HRA+S);
			         System.out.println("\t\t\tGross Salary Is : " + GS);
			      }
					else if(S>=20000)
					{
			 	         double DA=(S*0.95);
			               double HRA=(S*0.30);
			               double GS=(DA+HRA+S);
			               System.out.println("\t\t\tGross Salary Is : " + GS);
			            }
						
							
        }
}