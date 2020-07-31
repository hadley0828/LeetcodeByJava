package com.hadley.top100;

/*
2020.06.22
27 Remove Element
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

Example 2:

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 */

import java.util.Arrays;

public class _027 {

    //use two pointer method
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int valNumber = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                valNumber++;
            }
        }

        int j = nums.length - 1;
        for(int i = 0; i < nums.length - valNumber; i++){
            if(nums[i] == val){
                nums[i] = nums[j];
                j--;
            }
        }

        return nums.length - valNumber;
    }

    //concise version of two pointers
    public int removeElement1(int[] nums, int val){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
            //if nums[j] == val  then j++

        }
        return i;
    }

}
