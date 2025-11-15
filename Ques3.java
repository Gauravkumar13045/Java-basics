import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get its table: ");
        int table = sc.nextInt();

        System.out.println(table + " x 1 = " + (table * 1));
        System.out.println(table + " x 2 = " + (table * 2));
        System.out.println(table + " x 3 = " + (table * 3));
        System.out.println(table + " x 4 = " + (table * 4));
        System.out.println(table + " x 5 = " + (table * 5));
        System.out.println(table + " x 6 = " + (table * 6));
        System.out.println(table + " x 7 = " + (table * 7));
        System.out.println(table + " x 8 = " + (table * 8));
        System.out.println(table + " x 9 = " + (table * 9));
        System.out.println(table + " x 10 = " + (table * 10));

        sc.close();
    }
}
