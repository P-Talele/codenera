/*(5) In boxing the weight class of a boxer is decided as per the following
table. Write a program that receives weight as input and prints out
the boxer’s weight class.
Boxer Class  Weight in Pounds  
Flyweight    < 115
Bantamweight  115 - 121
Featherweight  122 - 153
Middleweight  154 – 189
Heavyweight    >= 190
*/
        import java.util.Scanner;
		public class  box 
		{
			  public static void main(String[]arg)
			  {
				      int  weight;
					  
					    Scanner obj=new Scanner(System.in);
				  
				   System.out.print("\n\t\t\t  Enter the weight=");
				    weight=obj.nextInt();
					
					if (weight<115)
					{
					System.out.println("\n\t\t\t  Flyweight");
					}
					  else if (weight>=115 && weight<=121)
					{
					System.out.println("\n\t\t\t   bantamweight");
					
					}
					  else if (weight>=122 && weight<=153)
					{
					System.out.println("\n\t\t\t   Featherweight");
					
					}
					  else if (weight>=154 && weight<=189)
					{
					System.out.println("\n\t\t\t   Middleweight");
					
					}
					  else if (weight>=190 )
					{
					System.out.println("\n\t\t\t   Heavyweight");
					
					}
			  }
		}
					  
					  
					  
					  