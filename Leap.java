/*(1) Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical operators
&& and ||.
*/
import java.util.Scanner;
public class Leap
{
	     public static void main(String[]args)
		 {
			    Scanner obj=new Scanner(System.in);
				
				int year;
				
				System.out.print("\n\t\t\t Enter the year=");
				year=obj.nextInt();
				
				if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 
				     {
					  System.out.println("\t\t\t is leap year=" +year);
					 }
					 else
						 
						 {
							   System.out.println("\t\t\t is not leap year="+year);
						 }
		 }
}