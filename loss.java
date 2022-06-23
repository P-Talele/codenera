//8 Write a Java program to calculate profit or loss.

  import java.util.Scanner;
  {
   public static void main(String args[]) 
    {   
	      double b,s;
            Scanner obj= new Scanner(System.in);
         	System.out.print("\n\t\t\t Enter the  Buying price= ");
         	   b=obj.nextDouble();
	        	System.out.print("\n\t\t\t Enter the Selling price=");
             s=obj.nextDouble();
 
		      if(b-s>0)
                {
		  System.out.println(" \t\t\tloss:" +(b-s));
		       }
		else if (b-s<0)
                {
		            System.out.println("\t\t\tprofit:" +(b-s));
	         	}
	
          
   }
}