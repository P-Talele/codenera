/*


11 Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill

*/     
import java.util.Scanner;
public class EL 
{
      public static void main(String[]args)
      {
        
           Scanner obj=new Scanner(System.in);

           System.out.println("Enter Your Electricity Unit");
            int a=obj.nextInt();

              if (a<=50)
              {
                  double b=0.50;
                  Double c=a*b; 
                  Double s=c*0.2; //  
                 System.out.println(" Your  Electricity Bill=="+s);

                }

                  else if (  a>=50  && a<=100)
                   {

                double b=0.75;
                Double c=a*b;
                Double s=c*0.2; 

                
               System.out.println(" Your  Electricity Bill"+s);
                    
               }

               else if (  a>=100&& a<=150)
               {
 
                 double b=1.20;
                  double c=a*b;
                  Double s=c*0.2; 
                System.out.println(" Your  Electricity Bill"+s);
                     
                }

                else  if  ( a>=150 a<=250)
               {
 
                double   b=1.20;
                 Double   c=a*b;
                 Double s=c*0.2; 
                System.out.println(" Your  Electricity Bill"+s);
                     
                }

        }
} 

