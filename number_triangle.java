import java.util.Scanner;
public class number_triangle
{
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = x.nextInt();
       
        //outer loop
        for( int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();


        }


    }

    

}        