package Recursion;

public class Ques15 {
    public static void main(String[] args) {
        int result = power(5,5);

       System.out.println(result);
    }

    public static int power(int x, int n) {

        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
}
