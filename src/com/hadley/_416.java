package com.hadley;

/*
2020.11.27
Partition Equal Subset Sum
Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

Example 1:
Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].

Example 2:
Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.

guidance: https://wangxin1248.github.io/algorithm/2020/06/leetcode-416.html
 */

public class _416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if(n < 1){
            return true;
        }
        int sum  = 0;
        for(int i : nums){
            sum += i;
        }

        if(sum % 2 != 0){
            return false;
        }

        int c = sum/2;
        boolean[] memo = new boolean[c+1];
        for(int i = 0; i <= c; i++){
            memo[i] = (nums[0] == i);
        }

        for(int i = 1; i < n; i++){
            for(int j =c; j >= nums[i]; j--){
                memo[j] = memo[j] || memo[j-nums[i]];
            }
        }



        return memo[c];
    }

}
