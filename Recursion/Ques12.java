package Recursion;

public class Ques12 {

    public static void natural(int n, int sum) {
        if (n < 0) {
            System.out.println("Enter the positive number greater than 0");
        }
        if (n == 0) {
            System.out.println(sum);
            return;

        }

        sum += n;
        natural(n - 1, sum);

    }

    public static void main(String args[]) {
        natural(4, 0);
    }
}
