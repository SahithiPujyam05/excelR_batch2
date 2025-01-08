import java.util.Scanner;

public class demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a two-digit number
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a valid two-digit number
        if (number < 10 || number > 99) {
            System.out.println("Error: Please enter a valid two-digit number.");
        } else {
            // Extract the tens and ones digits
            int tens = number / 10; // Get the tens place
            int ones = number % 10; // Get the ones place

            // Calculate the sum of the digits
            int sum = tens + ones;

            System.out.println("The sum of the digits is: " + sum);
        }
        scanner.close();
    }
}