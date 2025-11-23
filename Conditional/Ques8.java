package Conditional;
import java.util.Scanner;

public class Ques8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Press 1 to Enter Marks");
                Thread.sleep(1000);
                System.out.println("Press 0 to Exit");
                Thread.sleep(1000);

                int input = sc.nextInt();

                if (input == 1) {
                    System.out.println("Enter the marks (out of 100): ");
                    int marks = sc.nextInt();

                    if (marks >= 90) {
                        System.out.println("This is Good");
                        Thread.sleep(1000);
                        System.out.println("Because marks don’t matter but our effort does.");
                    } else if (marks >= 60) {
                        System.out.println("This is also Good");
                        Thread.sleep(1000);
                        System.out.println("Because marks don’t matter but our effort does.");
                    } else if (marks >= 0) {
                        System.out.println("This is Good as well");
                        Thread.sleep(1000);
                        System.out.println("Because marks don’t matter but our effort does.");
                    } else {
                        System.out.println("Invalid marks! Please enter between 0 and 100.");
                    }

                } else if (input == 0) {
                    System.out.println("Stopped Successfully!!");
                    break; 
                } else {
                    System.out.println("Invalid choice! Please press 1 or 0.");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

