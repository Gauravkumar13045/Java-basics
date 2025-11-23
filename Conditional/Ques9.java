package Conditional;
// prime number check
import java.util.Scanner;

public class Ques9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        boolean isprime = true;
        if(input <= 1){
            isprime = false;
        }else{
            for(int i = 2; i <= Math.sqrt(input); i++){
                if(input % i == 0){
                    isprime = false;
                    break;
                }
            }  
        }

        if(isprime){
            System.out.println(input + " is a prime number.");
        }else{
            System.out.println(input + " is not a prime number.");
        }
    }
}
