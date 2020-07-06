package com.hadley;

/*
2020.07.05
461、Hamming Distance
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */

public class _461 {
    public int hammingDistance(int x, int y) {
        if(x == y){
            return 0;
        }

        //modify the small and big, make x the smaller one
        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);

        int m = binaryX.length();
        int n = binaryY.length();

        for(int i = 0; i < n - m ; i++){
            binaryX = "0" + binaryX;
        }

        int res = 0;

        for(int i = 0; i < n; i++){
            if(binaryX.charAt(i)!=binaryY.charAt(i)){
                res++;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        _461 test = new _461();
        System.out.println(test.hammingDistance(4,4));
    }

}
