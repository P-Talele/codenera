import java.util.*;
public class C
{
	  public static void main(String[]args)
	  {
		   Scanner obj=new Scanner(System.in);
		   System.out.println("\t\t\t\t CALCULATER");
		    System.out.println("\t\t\t====================");
		   
		   System.out.println("\t\t\t\t 1:Add");
		      System.out.println("\t\t\t\t 2:Sub");
			     System.out.println("\t\t\t\t3: Mul");
				    System.out.println(" \t\t\t\t4:Div");
					
					int num;
					
					System.out.print("\n\t\t\t Enter Your Choice=");
					num=obj.nextInt();
					
					if (num==1)
					       {
						   int a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						    a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your Second number=");
							 b=obj.nextInt();
								 c=a+b;
								 System.out.println( "\t\t\t\t Result="+c);
						   }
						   
						   else if (num ==2 )
							      {
						   int a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						   a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your  Second number=");
						  b=obj.nextInt();
							c=a-b;
								 System.out.println( " \t\t\t\tResult="+c);
						   }
						      
						   else if (num ==3 )
							      {
						   int a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						   a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your Second number=");
						   b=obj.nextInt();
								 c=a*b;
								 System.out.println( "\t\t\t\t Result="+c);
					      	   }
							      
						   else if (num ==4)
							      {
						    double a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						   a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your Second number=");
							b=obj.nextInt();
						    c=a/b;
							System.out.println( " \t\t\t\tResult="+c);
					      	   }
	  }
} 
							   
							   
								 
								 
	                           				
					
					