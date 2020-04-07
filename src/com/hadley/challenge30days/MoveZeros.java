package com.hadley.challenge30days;

/*
2020.04.06
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12] (int[] nums = {0,1,0,3,12})
Output: [1,3,12,0,0]
 */

public class MoveZeros {

    //need space for new array
    public void moveZeroes(int[] nums) {
        int[] newArray = new int[nums.length];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            newArray[i] = 0;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                newArray[index] = nums[i];
                index++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = newArray[i];
        }

    }

    //set two pointers j and i
    public void moveZeroes1(int[] nums){
        for(int i = 1, j = 0; i < nums.length ;){
            if(nums[j] == 0 && nums[i] == 0){
                i++;
            }else if(nums[j] == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }else{
                i++;
                j++;
            }


        }

    }


    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
        int[] nums = {0,1,0,3,12};
        mz.moveZeroes1(nums);
        for(int count = 0; count < nums.length; count++){
            System.out.println(nums[count]);
        }
    }
}
