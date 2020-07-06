package com.hadley;

/*
2020.07.04
264、Ugly Number II
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

Example:

Input: n = 10
Output: 12
Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
Note:

1 is typically treated as an ugly number.
n does not exceed 1690.
 */

public class _264 {
    public int nthUglyNumber(int n) {

        if(n == 1){
            return 1;
        }

        int res[] = new int[n];
        res[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        for(int i = 1; i < n ; i++){
            int cur2 = res[index2] * 2;
            int cur3 = res[index3] * 3;
            int cur5 = res[index5] * 5;
            int min = Math.min(cur2,Math.min(cur3,cur5));
            if(cur2 == min){
                index2++;
            }
            if(cur3 == min){
                index3++;
            }
            if(cur5 == min){
                index5++;
            }
            res[i] = min;

        }
        return res[n-1];
    }

    public static void main(String[] args) {
        _264 test = new _264();
        System.out.println(test.nthUglyNumber(11));
    }
}
