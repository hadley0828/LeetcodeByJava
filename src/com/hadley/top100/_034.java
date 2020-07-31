package com.hadley.top100;

/*
2020.06.20
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */

public class _034 {

    //time complexity: O(n)
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        boolean flag = false;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target){
                continue;
            }

            if(nums[i] == target && !flag){
                result[0] = i;
                result[1] = i;
                flag = true;
            }else if(nums[i] == target && flag){
                result[1] = i;
            }
        }

        return result;
    }

    //come from the Solution time complexity: O(logN)
    public int[] searchRange1(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int l = left;
        int r = right;

        //find the left border of target
        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        if(left > right||nums[left]!= target){
            return new int[]{-1,-1};
        }

        //find the right border of target
        while(l < r){
            int mid = (l + r)/2 + 1;
            if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid;
            }
        }

        if(left > right || left > r){
            return new int[]{-1,-1};
        }else{
            return new int[]{left,r};
        }
    }
}
