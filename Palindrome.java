import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String processedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is a palindrome
        if (isPalindrome(processedInput)) {
            System.out.println("The entered string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The entered string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}