package com.hadley.top100;

/*
2020.06.22
26 Remove Duplicates from Sorted Array
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 */

public class _026 {

    //use one extra space: tag
    public int removeDuplicates(int[] nums) {
        int result = 0;

        if(nums.length == 0 || nums == null){
            return 0;
        }

        int tag = nums[0]-1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != tag){
                tag = nums[i];
                result++;
            }
        }

        //思路：从第二个数开始 如果当前的数小于等于全一个数 则把后面的第一个比tag大的数赋值给当前的位置
        tag = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                tag = nums[i];
            }
            if(nums[i-1] > nums[i] || nums[i-1] == nums[i]){
                for(int j = i; j < nums.length; j++){
                    if(nums[j] > tag){
                        nums[i] = nums[j];
                        tag = nums[i];
                        break;
                    }
                }
            }
        }
        return result;
    }

    //use two pointers method
    public int removeDuplicatesByTwoPointers(int[] nums){
        if(nums.length == 0 || nums == null){
            return 0;
        }

        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

}
