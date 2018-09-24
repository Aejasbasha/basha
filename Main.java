import java.util.Scanner;
 
class Main
{
   public static void main(String args[])
   {
      int m;
      Scanner in = new Scanner(System.in);
      m = in.nextInt();
 
      if ( m % 2 == 0 )
      {
         System.out.println(" Even ");
      }
      else if(m<0)
      {
         System.out.println(" invalid ");
      }
        else
        {
           System.out.println(" Odd ");
        }
        
   }
}
