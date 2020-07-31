package com.hadley.top100;

/*
2020.07.08
15、3Sum
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

import java.util.*;

public class _015 {
    //重复解决不了
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums.length < 3){
            return res;
        }

        int bit = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] !=0){
                bit = 1;
            }
        }

        if(bit == 0){
            List<Integer> curList = new ArrayList<>();
            curList.add(0);
            curList.add(0);
            curList.add(0);
            res.add(curList);
            return res;
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int first = nums[i]; //对之后的所有数进行2sum操作 2sum = total - first
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j = i + 1; j < nums.length; j++){
                int temp = nums[j];
                if(map.containsKey(temp)){
                    List<Integer> curList = new ArrayList<>(3);
                    curList.add(first);
                    curList.add(temp);
                    curList.add(-first-temp);
                    res.add(curList);
                }
                map.put(-first-temp,1);
            }

        }
        return res;
    }

    //link:https://www.cnblogs.com/stevencooks/p/4472837.html
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int len = nums.length;
        if (len < 3) {
            return result;
        }

        Arrays.sort(nums);

        // for all number that can be the 1st number of triplet
        for (int i = 0; i < len - 1; i++) {
            int firstNumber = nums[i];

            // skip all duplicated first number
            if (i == 0 || firstNumber != nums[i - 1]) {

                int leftIndex  = i + 1;
                int rightIndex = len - 1;
                int twoSumTarget = 0 - firstNumber;

                // try to find two numbers that sum up to twoSumTarget
                while (leftIndex < rightIndex) {
                    int twoSum = nums[leftIndex] + nums[rightIndex];
                    if (twoSum == twoSumTarget) {
                        // one valid triplet found!!
                        result.add(Arrays.asList(firstNumber, nums[leftIndex], nums[rightIndex]));
                        // skip duplicated nums[leftIndex]
                        while (leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex + 1]) {
                            leftIndex++;
                        }
                        // skip duplicated nums[rightIndex]
                        while (leftIndex < rightIndex && nums[rightIndex] == nums[rightIndex - 1]) {
                            rightIndex--;
                        }
                        // move to next non-duplicates
                        leftIndex++;
                        rightIndex--;
                    } else if (twoSum < twoSumTarget) {
                        // move left towards right to
                        // make twoSum larger to get closer to twoSumTarget
                        leftIndex++;
                    } else {
                        rightIndex--;
                    }
                }

            }
        }

        return result;
    }

}
