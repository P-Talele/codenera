/*9 Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/


 import java.util.Scanner;
 public class   G
 {
	      public static void main(String[]args)
		  {
			  	  int   p,c,b,m,co;
			      Scanner obj=new Scanner(System.in);
				    
				   System.out.print("\n\t\t\t  physics =");
				    p=obj.nextInt();
					   
				   System.out.print("\n\t\t\t  chemestry =");
				    c=obj.nextInt();
					   
				   System.out.print("\n\t\t\t  Biology =");
				    b=obj.nextInt();
					   
				   System.out.print("\n\t\t\t   Math =");
				    m=obj.nextInt();
					   
				   System.out.print("\n\t\t\t   Computer =");
				    co=obj.nextInt();
					
					 int t =p+c+b+m+co;
					  System.out.print("\n\t\t\t  Your Total Marks ="+t);
					  double   percent= (t *100)/500;
					   
					   if (percent >=90 )
					  
						    System.out.println("\t\t\t A Grade");
					   
					   else if (percent>=80)
					   
						     System.out.println("\t\t\t b Grade");
						   
					   
					    else if (percent>=70)
					   
						     System.out.println("\t\t\t C Grade");
						   
					   
					    else if (percent>=60)
					   
						     System.out.println("\t\t\t  D Grade");
						   
					   
					 
					    else if (percent>=40)
					   
						     System.out.println("\t\t\t E Grade");
						   
					   
						    else if (percent<40)
					  
						     System.out.println("\t\t\t f Grade");
						   
					   
		  }
 }
					   