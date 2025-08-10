package com.example;
import java.util.*;

/*
 * The input consists of an integer- num, representing the car registration number.
 */
public class Solution {
    public static int smallestPermutation(int num) {
        boolean isNegative = num < 0;
        String numStr = Integer.toString(num);
        char[] digits;
        if (isNegative) {
            // Handle Integer.MIN_VALUE safely
            digits = numStr.substring(1).toCharArray();
        } else {
            digits = numStr.toCharArray();
        }
        Arrays.sort(digits);
        if (!isNegative) {
            // Find first non-zero digit
            int firstNonZero = 0;
            while (firstNonZero < digits.length && digits[firstNonZero] == '0') {
                firstNonZero++;
            }
            if (firstNonZero < digits.length) {
                // Swap first non-zero with first digit
                char tmp = digits[0];
                digits[0] = digits[firstNonZero];
                digits[firstNonZero] = tmp;
            }
            return Integer.parseInt(new String(digits));
        } else {
            // For negative, largest permutation
            // Reverse digits
            for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
                char tmp = digits[i];
                digits[i] = digits[j];
                digits[j] = tmp;
            }
            String resStr = new String(digits);
            // Check for overflow
            try {
                int res = Integer.parseInt(resStr);
                return -res;
            } catch (NumberFormatException e) {
                // If overflow, just return num itself (as a fallback)
                return num;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input for num
        int num = in.nextInt();
        int result = smallestPermutation(num);
        System.out.print(result);
    }
}
