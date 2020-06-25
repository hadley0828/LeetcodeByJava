package com.hadley;

/*
2020.06.24
29 Divide two integers
Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.

Example 1:
Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = truncate(3.33333..) = 3.

Example 2:
Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = truncate(-2.33333..) = -2.
 */

public class _029 {

    public int divide(int dividend, int divisor) {
        //the only edge case : dividend = Integer.Min_Value divisor = -1 then result will be overflow
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean sign = (dividend < 0) == (divisor < 0);
        dividend = dividend > 0? -dividend: dividend;
        divisor = divisor > 0? -divisor: divisor;
        int res = divideHelper(dividend, divisor);
        return sign? res: -res;
    }

    public int divideHelper(int dividend, int divisor){
        if(dividend > divisor) return 0;
        int sum = divisor, m = 1;
        while((Integer.MIN_VALUE - sum < sum) && (sum + sum > dividend)){
            sum += sum;
            m += m;
        }
        return m + divideHelper(dividend - sum, divisor);
    }
}
