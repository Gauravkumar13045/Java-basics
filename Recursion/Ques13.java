package Recursion;

public class Ques13 {
    public static void main(String args[]) {
        factor(-5, 1);

    }

    public static void factor(int n, int sum) {
        if (n < 0) {
            System.out.println("invalid number");
            return;
        }
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        sum *= n;
        factor(n - 1, sum);

    }

}
