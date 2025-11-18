
import java.util.Scanner;

public class Ques6 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();


        for(int i = 0; i<=n ; i++){
            if(i%2==0){
                System.out.println(i);
            }

        }

    }
}
