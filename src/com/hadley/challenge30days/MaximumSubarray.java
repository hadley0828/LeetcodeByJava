package com.hadley.challenge30days;

/*
2020.04.03
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
ps: the introduction of the divide and conquer approach: https://blog.csdn.net/xlinsist/article/details/79198842
 */

public class MaximumSubarray {

    /*
    O（n）动态规划：钱兑换最少的纸币问题（1、2、5、10）
     */
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0]; //-2
        int max = dp[0]; //-2

        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i] ); //dp[1]=1 dp[2]=-2 dp[3]=2
            max = Math.max(max, dp[i]); //max=1 max=1 max=2
        }

        return max;
    }

    //solution：https://www.cnblogs.com/Xieyang-blog/p/9030663.html


}
