/*

(6) Using conditional operators determine:
(1) Whether the character entered through the keyboard is a
lower case alphabet or not.

*/

       import java.util.Scanner;
		public class  lowr
		{
			  public static void main(String[]arg)
			  {
				     char ch;
					  
					    Scanner obj=new Scanner(System.in);
				  
				   System.out.print("\n\t\t\t    Enter the charactor=");
				    ch=obj.next().charAt(0);
					
					if (ch>= 'a' )
					{
						        System.out.println("\t\t\t  lower case alphabet"+ch);
					}
					else  if (ch <='z' )
					{
						     System.out.println("\t\t\t    it Not lower case alphabet"+ch);
					}
					
			
						
			  }
		}
		
		/*(2) Whether a character entered through the keyboard is a special
symbol or not.
		*/
		import java.util.Scanner;
		public class  lowr
		{
			  public static void main(String[]arg)
			  {
				     char ch;
					  
					    Scanner obj=new Scanner(System.in);
				  
				   System.out.print("\n\t\t\t    Enter the charactor=");
				    ch=obj.next().charAt(0);
		
		
		          if  ((ch >= 0  && ch <= 47)   ||   (ch >= 58 && ch <=  64) ||  (ch >= 91 && ch <= 96) ||   ( ch >= 123) )  
						
						{
							 System.out.println("\t\t\t    is a Symbols  ");
						}
						else
						{
							 System.out.println("\t\t\t   is not  a Symbols  ");
 					
					
					
						}				

						}
			  }
