package com.hadley;

/*
2020.07.01
441 Arranging Coins
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */

public class _441 {

    //first try: when MAX_VALUE, time exceed limit  fix: temp from int to long
    public int arrangeCoins(int n) {
        int res = 0;
        long temp = 0;

        if(n == 0){
            return 0;
        }
        if(n == 1){
            res ++;
            temp += res;
            return res;
        }

        while(temp <= n){

            res ++;
            temp += res;
        }

        return res - 1;
    }

    //another two solution: Binary Search + Pure Maths solution
}
