package com.hadley;

/*
2020.06.30
746、Min Cost Climbing Stairs
On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
Example 2:
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].

 */
public class _746 {

    //dp
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        //length >= 2
        int[] dp = new int[length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i = 2; i < length + 1; i++){
            dp[i] = Math.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
        }
        return dp[length];
    }

    public static void main(String[] args) {
        _746 test = new _746();
        int[] cost = new int[]{0,0,1,1};
        System.out.println(test.minCostClimbingStairs(cost));
    }

}
