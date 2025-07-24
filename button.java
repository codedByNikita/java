import java.util.Scanner;
public class button
{
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number:");
        int button = x.nextInt();
        switch(button){
        case 1:
            System.out.print("Hello!");
            break;
        case 2:
            System.out.print("Namaste!");
            break;
        case 3:
            System.out.print("Bonjour!");
            break;
        default:
            System.out.print("Invalid button !");
        }
    }
}