import java.util.Scanner;

public class Demo036 {
    public void M1(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is greater");
        } else {
            System.out.println("Num3 is greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Num3: ");
        int num3 = sc.nextInt();
        Demo036 demo = new Demo036();
        demo.M1(num1, num2, num3);
        sc.close();
    }
}
