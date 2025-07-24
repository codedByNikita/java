import java.util.Scanner;

public class AddTwoNumbers
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner y=new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER:");
        int num1=y.nextInt();
        System.out.print("ENTER THE SECOND NUMBER:");
         int num2=y.nextInt();
         System.out.println("Sum:"+(num1+num2));

    }

} // ab ho gya run