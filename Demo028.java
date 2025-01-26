import java.util.Scanner;

public class Demo028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms in Fibonacci series:");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // using recursion
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // recursion method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}