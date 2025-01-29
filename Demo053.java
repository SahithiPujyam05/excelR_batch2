import java.util.Scanner;

public class Demo053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isStrong(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }

    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return original == sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}