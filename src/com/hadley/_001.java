package com.hadley;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

date: 1st 2020.01.09
 */


import java.util.HashMap;

public class _001 {

    /*
    Question 1 analyst
     */

    //first time: low time efficiency O(n^2)
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    //improvement: HashMap O(n)
    public int[] twoSum1(int[] nums, int target){
        int[] result = new int[]{-1,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result; //check the current value is valid or not, plus can avoid to the map containing such as 5-1 and 5-2
            }

            map.put(nums[i],i); //HashMap: value-index

        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
