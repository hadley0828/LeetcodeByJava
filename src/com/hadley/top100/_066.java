package com.hadley.top100;

/*
2020.07.06
66、Plus One
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */

public class _066 {

    public int[] plusOne(int[] digits) {

        int temp = 0;

        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for(int i = digits.length - 1; i >= 0; i--){
            if(temp == 1){
                digits[i] = digits[i] + 1;
            }

            if(digits[i] == 10){
                digits[i] = 0;
                temp = 1;
            }else{
                temp = 0;
            }

        }

        if(temp == 1){
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for(int i = 0; i < digits.length; i++){
                res[i+1] = 0;
            }
            return res;
        }

        return digits;
    }
}
