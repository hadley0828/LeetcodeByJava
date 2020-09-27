package com.hadley;

/*
2020.08.25
983、Minimum Cost For Tickets
 */

import java.util.HashSet;

public class _983 {
    public int mincostTickets(int[] days, int[] costs) {
        HashSet<Integer> daySet = new HashSet<>();
        for(int i = 0; i < days.length; i++){
            daySet.add(days[i]);
        }
        int first = days[0];
        int last = days[days.length - 1];
        int[] dp = new int[last + 1];

        for(int i = first; i < last + 1; i++){
            if(daySet.contains(i)){
                int p1 = i - 1 > 0 ? dp[i-1] : 0;
                int p7 = i - 7 > 0 ? dp[i-7] : 0;
                int p30 = i - 30 > 0 ? dp[i-30] : 0;
                dp[i] = Math.min(p1 + costs[0],Math.min(p7 + costs[1],p30 + costs[2]));
            }else{
                dp[i] = dp[i - 1];
            }
        }
        return dp[last];
    }
}
