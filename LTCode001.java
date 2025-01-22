package LTCodes;

public class LTCode001 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return false;
            }
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        LTCode001 solution = new LTCode001();
        int num = 121;
        if (solution.isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}