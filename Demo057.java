import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = sumOfFirstAndLastDigits(number);
        System.out.println("Sum of first and last digits: " + sum);
    }

    public static int sumOfFirstAndLastDigits(int num) {
        int lastDigit = num % 10;
        int firstDigit = 0;

        while (num != 0) {
            firstDigit = num % 10;
            num /= 10;
        }

        return firstDigit + lastDigit;
    }
}