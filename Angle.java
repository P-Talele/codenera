/*
(4) If the three sides of a triangle are entered through the keyboard,
write a program to check whether the triangle is isosceles,
equilateral, scalene or right angled triangle.
*/

 import java.util.Scanner;
 public class  Angle 
 {
	      public static void main(String[]args)
		  {
			  	  int  s1,s2,s3;
			      Scanner obj=new Scanner(System.in);
				  
				   System.out.print("\n\t\t\t Enter the first Side Traingle=");
				    s1=obj.nextInt();
					  System.out.print("\n\t\t\t  Enter the first Side Traingle=");
				    s2=obj.nextInt();
					  System.out.print("\n\t\t\t  Enter the first Side Traingle=");
				    s3=obj.nextInt();
					
					if  (s1== s2  &&   s2== s3)
					     {  
					           System.out.println("\t\t\t it is a Isosceles Traingle");
			
                         }
						 else  if (  s1== s2  ||  s2== s3 ||  s3 == s1)
						 {
							   System.out.println("\t\t\t it is a  Equilateral Traingle");
					  	 }
						 else 
							 
							 {
								   System.out.println("\t\t\t it is a  Scalance Traingle");
							 }
							 
		  }
 }		  
		  
		  
		  
						    
				  
				  
				  