package com.hadley;

/*
2020.06.29
55 Jump Game
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.



Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */

public class _055 {
    public boolean canJump(int[] nums) {
        boolean[] temp = new boolean[nums.length]; //show whether to reach the current postion

        //length == 0
        if(nums.length == 0){
            return false;
        }

        //length == 1
        temp[0] = true;
        if(nums.length == 1){
            return temp[0];
        }

        //length == 2
        if(nums[0] == 0){
            temp[1] = false;
        }else{
            temp[1] = true;
        }
        if(nums.length == 2){
            return temp[1];
        }

        //length > 2  length = 3 -> 0..2
        a:for(int i = 2; i < nums.length; i++){
            b:for(int j = i - 1; j >=0; j--){
                if(temp[j] && nums[j] + j >= i){
                    temp[i] = true;
                    break b;
                }
            }


        }


        return temp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        _055 test = new _055();
        System.out.println(test.canJump(nums));
    }

    //first try：iterator  72/75 pass: time exceed limit
    public boolean canIndexJump(int[] nums, int index){
        if(index > nums.length - 1){
            return false;
        }
        if(index == 0){
            return true;
        }

        if(index == 1){
            if(nums[0] != 0){
                return true;
            }else{
                return false;
            }
        }

        //index : 0..nums.length - 1
        for(int i = index - 1; i >= 0; i--){
            if(canIndexJump(nums,i) && i +nums[i] >= index){
                return true;
            }
        }

        return false;


    }



}
