package ps002.PS003;

public class fibonacei {
    public static void main(String[] args) {

        int n = 30;
        long first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print(first + ", " + second);

        // Generate and print the remaining terms
        for (int i = 3; i <= n; i++) {
            long next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }
}
