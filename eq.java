
// 7 Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle.

 import java.util.Scanner;
 public class   eq
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