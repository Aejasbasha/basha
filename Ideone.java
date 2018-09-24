import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        if(x > 0)
        {
            System.out.println("Positive");
        }
        else if(x == 0)
        {
            System.out.println("Zero");
        }
        else
        {
        	System.out.println("Negative");
        }
	}
}
