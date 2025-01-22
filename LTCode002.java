package LTCodes;

class reversenum {
    public int reverse(int x) {

        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}

public class LTCode002 {
    public static void main(String[] args) {
        reversenum obj = new reversenum();
        int num = obj.reverse(1234);
        System.out.println("reversed number is " + num);
    }
}
