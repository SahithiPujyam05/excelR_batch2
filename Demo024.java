import java.util.Scanner;

class Friend {
    String name;
    String phoneNumber;
    String address;

    public Friend(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

public class Demo024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of friends:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Create an array of Friend objects
        Friend[] friends = new Friend[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for friend " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            // Create a new Friend object and store it in the array
            friends[i] = new Friend(name, phoneNumber, address);
        }

        System.out.println("\nFriend Details:");
        for (Friend friend : friends) {
            friend.displayInfo();
        }

        scanner.close();
    }
}