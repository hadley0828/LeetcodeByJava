package com.hadley;

/*
2020.07.20
213、House Robber II
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
             because they are adjacent houses.
Example 2:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
 */

public class _213 {
    public int rob(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);

        //因为第一个和最后一个只能最多抢一个 去掉第一个 或者 去掉最后一个 再用抢一行的算法
        int[] noFirstList = new int[nums.length - 1];
        int[] noLastList = new int[nums.length - 1];
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                noFirstList[i - 1] = nums[i];
            }
            if(i < nums.length - 1){
                noLastList[i] = nums[i];
            }
        }

        return Math.max(robOneRow(noFirstList),robOneRow(noLastList));

    }

    public int robOneRow(int[] nums){
        int[] dp = new int[nums.length];
        if(nums.length == 0) return 0;
        dp[0] = nums[0];
        if(nums.length == 1) {
            return dp[0];
        }
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i-1]);
        }
        return dp[nums.length - 1];
    }
}
