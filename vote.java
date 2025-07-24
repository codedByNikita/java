import java.util.Scanner;
public class vote
{
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        int age = x.nextInt();
        if(age>18){
            System.out.print("Adult");
        }
        else{
            System.out.print("Not adult");
        }
    }
}        