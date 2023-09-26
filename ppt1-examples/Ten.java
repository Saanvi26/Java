import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double v1 = input.nextDouble();
        double area;
        if (v1 >= 0) {
            area = v1 * v1 * 3.14159;
            System.out.println(
                    "The area for the circle of radius " +
                            v1 + " is " + area);
        }
    }
}
