package ps002.PS003;

import java.util.Scanner;

public class demo014 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Constants for conversion
        int minutesInDay = 24 * 60;
        int minutesInYear = 365 * minutesInDay;

        // Calculate years and remaining minutes for days
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        // Close the scanner
        scanner.close();
    }
}
