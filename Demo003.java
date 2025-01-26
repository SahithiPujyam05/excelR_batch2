public class Demo003 {

    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 5;
        num2 = 10;
        num3 = 15;
        int greatest;
        if (num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);

    }
}