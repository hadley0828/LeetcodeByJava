package com.hadley;

/*
2020.06.25
8 String to Integer

Example 1:
Input: "42"
Output: 42

Example 2:
Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.

Example 3:
Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.

Example 4:
Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical
             digit or a +/- sign. Therefore no valid conversion could be performed.

Example 5:
Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.
 */

import java.math.BigInteger;

public class _008 {
    public static int myAtoi(String str) {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isSpaceChar(c))
                return convertToInteger(str.substring(i));

        }

        return 0;
    }

    public static int convertToInteger(String str) {
        double result = 0;
        int sign = 1, i = 0;

        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = str.charAt(0) == '+' ? 1 : -1;
            i++;
        }

        while (i < str.length()) {
            char c = str.charAt(i);

            if ((c >= '0' && c <= '9')) {

                result = 10 * result + (c - '0');

            } else break;

            i++;

        }

        if (sign==-1)
            result = -result;

        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;



        return (int) result;
    }
}
