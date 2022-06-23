import java.util.Scanner;
            public class  W
       {
          public static void main(String[]args)
              {
                    Scanner obj=new Scanner(System.in);
                     System.out.print("\n Enter Character: ");
                       char c=obj.next().charAt(0);
                   

                      switch(c) 
          {
                         case 'A':
						  System.out.println(c+" is a Vowel.");
						  break;
                         case 'E':
						  System.out.println(c+" is a Vowel.");
						  break;
                        case 'I':
						 System.out.println(c+" is a Vowel.");
						 break;
                        case 'O':
						 System.out.println(c+" is a Vowel.");
						 break;
                        case 'U': System.out.println(c+" is a Vowel.");
                         break;

           default: System.out.println(c+" is a Non-Vowel Character.");
                }

       }
}