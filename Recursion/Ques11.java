package Recursion;

public class Ques11 {

        public static void main(String arg[]) {
        print(1);
    }
    public static void print(int n) {

        if (n == 6) {
            return;

        }

        System.out.println(n);
        print(n + 1);

    }


}
