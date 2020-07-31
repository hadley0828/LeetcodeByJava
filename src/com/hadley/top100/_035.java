package com.hadley.top100;

/*
2020.06.27
35 Search Insect Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 */

public class _035 {

    //brute solution: O(n)   binary search: O(logN)
    public int searchInsert(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }

        if(target > nums[nums.length - 1]){
            return nums.length - 1;
        }


        return 0;

    }

    public int searchInsectByBinarySearch(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        if(target > nums[nums.length - 1]){
            return nums.length;
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return low;
    }
}
