package LTCodes;

class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Step 1: Ignore leading whitespace
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check for sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Read digits and convert to integer
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Handle overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}

public class LTCode003 {
    public static void main(String[] args) {
        Solution converter = new Solution();
        System.out.println(converter.myAtoi("42"));
        System.out.println(converter.myAtoi("   -042"));
        System.out.println(converter.myAtoi("1337c0d3"));
        System.out.println(converter.myAtoi("0-1"));
        System.out.println(converter.myAtoi("words and 987"));
    }
}
