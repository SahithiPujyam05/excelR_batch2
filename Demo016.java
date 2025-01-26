import java.util.Scanner;

public class Demo016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        final long MINUTES_IN_HOUR = 60;
        final long HOURS_IN_DAY = 24;
        final long DAYS_IN_YEAR = 365;

        long totalDays = minutes / (MINUTES_IN_HOUR * HOURS_IN_DAY);

        long years = totalDays / DAYS_IN_YEAR;
        long days = totalDays % DAYS_IN_YEAR;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }
}