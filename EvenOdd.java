import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[]args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int num = x.nextInt();
        if(num % 2 == 0)
        {           
            System.out.println(num + " is Even");
        }
        else
        {
            System.out.println(num + " is Odd");

        }

        
    }
}