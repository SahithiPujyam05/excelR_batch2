import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Username = null;
        String Pswd = null;
        String reply;
        boolean attemptedLogin = false;

        do {
            System.out.println("Welcome to MallaReddy University!");
            System.out.println("Have you visited our site? (yes/no)");
            System.out.print("Reply: ");
            reply = sc.nextLine();

            if (reply.equalsIgnoreCase("no")) {
                System.out.println("Login here");
                System.out.print("Enter Username: ");
                Username = sc.nextLine();
                System.out.print("Enter Pswd: ");
                Pswd = sc.nextLine();
                attemptedLogin = true;
            } else {
                System.out.println("You are a valid Customer");
                break;
            }
        } while (!attemptedLogin);

        if (attemptedLogin) {
            if ("Sahithi".equals(Username) && "Sahithi@123".equals(Pswd)) {
                System.out.println("Login successful! Welcome.");
            } else {
                System.out.println("Incorrect Username & Password");
            }
        }

        sc.close();
    }
}
