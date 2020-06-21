package com.hadley;

/*
2020.05.24  18.4Sum
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        //the difference between ArrayList and List：https://www.cnblogs.com/zcscnn/p/7743507.html

        if(nums.length < 4){
            return resultList;
        }else{
            //TODO
            return null;
        }


    }
}
