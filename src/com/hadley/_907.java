package com.hadley;

/*
2020.07.01
746、Sum of Subarray Minimums

Given an array of integers A, find the sum of min(B), where B ranges over every (contiguous) subarray of A.

Since the answer may be large, return the answer modulo 10^9 + 7.

Example 1:

Input: [3,1,2,4]
Output: 17
Explanation: Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].
Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.  Sum is 17.
 */

public class _907 {


    //time exceed limit
    public int sumSubarrayMins(int[] A) {
        long res = 0;
        int[] temp = new int[A.length];
        if(A.length == 0) return 0;
        if(A.length == 1){
            temp[0] = A[0];
            res = res + temp[0];
            return temp[0];
        }

        for(int i = 0; i < A.length; i++){
            //在temp中存 i + 1个数  temp[0..i-1] A[i]
            for(int j = 0; j < i; j ++){
                temp[j] = Math.min(temp[j], A[i]);
                res += temp[j];
            }
            temp[i] = A[i];
            res += temp[i];
            if(res > Integer.MAX_VALUE){
                res = res % (1000000007);
            }
            System.out.println(res);
        }

        if(res > Integer.MAX_VALUE){
            return (int)(res % (1000000007));
        }
        return (int)res;
    }

}
