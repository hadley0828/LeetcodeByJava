package com.hadley;

/*
2020.07.30
309、Best Time TO Buy and Sell Stock with Cooldown
 */
public class _309 {
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][3];
        //添加边界判断条件
        if(prices == null || prices.length < 2)  return 0;
        //定义三个数组，买的 卖的 冻结的时刻可以挣的最多的钱。
        dp[0][0]=0;//sell
        dp[0][1]= - prices[0];//buy
        dp[0][2]=0;//cooldown
        for(int i = 1 ;i < prices.length ;i++){
            dp[i][0]=Math.max(dp[i - 1][0],dp[i - 1][1] + prices[i]);
            dp[i][1]=Math.max(dp[i - 1][1],dp[i - 1][2] - prices[i]);
            dp[i][2]=dp[i - 1][0];
        }
        return Math.max(dp[prices.length - 1][0],dp[prices.length - 1][2]);

    }
}
