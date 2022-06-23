
/*3 If the three sides of a triangle are entered through the keyboard,
write a program to check whether the triangle is valid or not. The
triangle is valid if the sum of two sides is greater than the largest of
the three sides
*/
 import java.util.Scanner;
 public class Traingle
 {
	     public static void main(String[]args)
		 {
			    int s1,s2,s3;
				Scanner obj=new Scanner(System.in);
				  System.out.print("\n\t\t\t Enter the first Side Traingle=");
				    s1=obj.nextInt();
					  System.out.print("\n\t\t\t  Enter the first Side Traingle=");
				    s2=obj.nextInt();
					  System.out.print("\n\t\t\t  Enter the first Side Traingle=");
				    s3=obj.nextInt();
					
			
					
					if (s1+s2>s3) || (s1+s3>s2)||(s2+s3>s1)
					                        {
                            				System.out.println("\n\t\t\t   Traingle is Valid");
											}
					
                                    else 
                                          {
											  System.out.println("\n\t\t\t   Traingle is not valid");
									      }
		 }
 }
