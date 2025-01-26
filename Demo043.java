import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an UpperCase Character: ");
        char ch = sc.next().charAt(0);
        char NChar = Character.toLowerCase(ch);
        System.out.println("LowerCase Character: " + NChar);
    }
}
