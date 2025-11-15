import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Simple Calculator\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus\n");

        int input = sc.nextInt();

        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        if (input == 1) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (input == 2) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (input == 3) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (input == 4) {
            if (b != 0) {
                System.out.println(a + " / " + b + " = " + (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed!");
            }
        } else if (input == 5) {
            if (b != 0) {
                System.out.println(a + " % " + b + " = " + (a % b));
            } else {
                System.out.println("Error: Modulus by zero is not allowed!");
            }
        } else {
            System.out.println("Wrong input! Try again");
        }

        sc.close();
    }
}
