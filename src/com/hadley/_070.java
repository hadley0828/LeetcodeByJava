package com.hadley;

/*
2020.06.30
70、Climbing Stairs
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

public class _070 {

    //other method: Fibonacci Number: O(N) Fibonacci Format: O(logN)  Binets Method(*****)

    //use dp
    public int climbStairs(int n) {
        int[] temp = new int[n];

        temp[0] = 1;
        if(n == 1){
            return temp[0];
        }
        temp[1] = 2;
        if(n == 2){
            return temp[1];
        }

        for(int i = 2; i < n; i++){
            temp[i] = temp[i-2] + temp[i-1];
        }

        return temp[n-1];
    }


}
