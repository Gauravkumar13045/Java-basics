// Q7. Print x^n (with stack height = logn)

package Recursion;

public class Ques16 {
    public static void main(String args[]){
       int x = 2, n = 6;
       int output = powerlog(x, n);
       System.out.println(output); 

    }
    public static int powerlog(int x, int n) {
        if(n==0){
            return 1;
        }
        if(n % 2 == 0){
            return powerlog(x, n/2) * powerlog(x, n/2);
        }else{
            return x * powerlog(x, n/2) * powerlog(x, n/2);
        }
        

        
    }
}
