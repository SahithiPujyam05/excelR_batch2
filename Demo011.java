import java.util.Scanner;

public class Demo011 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = s1.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = s1.nextDouble();

        double area = 0.5 * base * height;

        System.out.printf("The area of the triangle with base %.2f and height %.2f is %.2f\n", base, height, area);
    }
}