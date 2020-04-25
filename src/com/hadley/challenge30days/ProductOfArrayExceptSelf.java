package com.hadley.challenge30days;

/*
2020.04.19
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).
 */

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] frontProduct = new int[length];
        int[] backProduct = new int[length];

        int temp = 1;
        for(int i = 0; i < nums.length; i++){
            temp *= nums[i];
            frontProduct[i] = temp;
        }

        int total = 1;
        for(int i = nums.length - 1; i > -1; i--){
            total *= nums[i];
            backProduct[i] = total;
        }

        int[] resultList = new int[length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                resultList[i] = backProduct[1];
            }else if(i == nums.length-1){
                resultList[i] = frontProduct[nums.length-2];
            }else{
                resultList[i] = frontProduct[i-1] * backProduct[i+1];
            }

        }
        return resultList;
    }

    //solution 2 reduce the O(space)
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length, right = 1;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; ++i) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        for (int i = n - 1; i >= 0; --i) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

}
