
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius to calculate the area of the circle");
        double name = sc.nextDouble();
        double circle = Math.PI * name * name;

        System.out.println(circle);
    
    }
}
