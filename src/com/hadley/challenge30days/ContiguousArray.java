package com.hadley.challenge30days;

/*
2020.04.14
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 */

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        for(int start = 0; start < nums.length; start++){
            int zeroes = 0, ones = 0;
            for(int end = start ; end < nums.length; end++){
                if(nums[end] == 0){
                    zeroes++;
                }else{
                    ones++;
                }
                if(zeroes == ones){
                    maxLen = Math.max(maxLen, end - start +1);
                }
            }
        }
        return maxLen;

    }
}
