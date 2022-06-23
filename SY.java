import java.util.*;
public class SY
{
	  public static void main(String[]args)
	  {
		   Scanner obj=new Scanner(System.in);
		   System.out.println("\t\t\t\t CALCULATER");
		    System.out.println("\t\t\t====================");
		   
		   System.out.println("\t\t\t\t +:Addition");
		      System.out.println("\t\t\t\t -:Subraction");
			     System.out.println("\t\t\t\t *: Multification");
				    System.out.println(" \t\t\t\t/:Division");
					
					 char Symbols;
					
					System.out.print("\n\t\t\t Enter Your Choice=");
			   		Symbols=obj.next().charAt(0);
					
					 switch  (Symbols)
					 {
						  case '+':
					       {
						   int a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						    a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your Second number=");
							 b=obj.nextInt();
								 c=a+b;
								 System.out.println( "\t\t\t\t Result="+c);
						   }
						    break;
					 
						   case '-':
							      {
						   int a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						   a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your  Second number=");
						  b=obj.nextInt();
							c=a-b;
								 System.out.println( " \t\t\t\tResult="+c);
						      }
						   break;
						      
						    case '*':
							      {
						   int a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						   a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your Second number=");
						   b=obj.nextInt();
								 c=a*b;
								 System.out.println( "\t\t\t\t Result="+c);
					      	   }
							   break;
							      
						   case    '/':
							      {
						    double a,b,c;
						   System.out.print("\n\t\t\t Enter your first number=");
						   a=obj.nextInt();
						   System.out.print("\n\t\t\t Enter your Second number=");
							b=obj.nextInt();
						    c=a/b;
							System.out.println( " \t\t\t\tResult="+c);
					      	   }
							   break;
					 }
	  }
} 
							   
							   
								 
								 
	                           				
					
					