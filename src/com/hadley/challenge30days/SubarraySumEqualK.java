package com.hadley.challenge30days;

/*
2020.04.23
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
 */

import java.util.HashSet;

public class SubarraySumEqualK {

    //calculate the separate total of first i numbers
    public int subarraySum(int[] nums, int k) {
        int[] totalList = new int[nums.length];
        totalList[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            totalList[i] = totalList[i-1] + nums[i];
        }

        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(totalList[i] == k){
                result++;
            }
            for(int j = 0; j < i; j++){
                if(totalList[i] - totalList[j] == k){
                    result++;
                }
            }
        }

        return result;
    }

    //solution2: use HashMap to make O(n) come true
}
