import java.util.Scanner;
 public class Character_cheack{
    public static void main(String[] args){
        char ch;

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the character:");
        ch = x.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("Upper case letter.");
    
        }
        else if(ch >=97 && ch<=122){
            System.out.println("Lower case letter.");

        }
        else if( ch>=48 && ch<=57){
            System.out.println("Digit.");

        }
        else{
            System.out.println("Special symbol.");
        }

    }
}    