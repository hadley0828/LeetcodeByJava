package com.hadley;

/*
2020.06.26
50. Pow(x,n)
mplement pow(x, n), which calculates x raised to the power n (xn).

Example 1:

Input: 2.00000, 10
Output: 1024.00000
Example 2:

Input: 2.10000, 3
Output: 9.26100
Example 3:

Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
Note:

-100.0 < x < 100.0
n is a 32-bit signed integer, within the range [−231, 231 − 1]
 */
public class _050 {

    public double myPow(double x, int n) {
        //main problem: |Integer.MIN_VALUE| = Integer.MAX_VALUE + 1;
        double y = x;
        if(n == 0){
            return 1;
        }else{
            if(n == Integer.MIN_VALUE){
                n = n + 2;
            }
            int abs = Math.abs(n);
            double temp = myPow(y, abs/2);
            if(abs % 2 == 0){
                y = temp * temp;
            }else{
                y *= (temp * temp);
            }
            return n < 0 ? Math.max(1/y, 0.0):y;

        }
    }


}
