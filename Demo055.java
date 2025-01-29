import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = sumOfSquares(number);
        System.out.println("Sum of squares of digits: " + sum);
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
