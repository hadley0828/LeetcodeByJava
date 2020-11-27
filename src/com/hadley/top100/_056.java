package com.hadley.top100;

/*
2020.11.19
56、Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

import java.util.ArrayList;
import java.util.Arrays;


public class _056 {

    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        if(intervals == null || intervals.length < 2){
            return intervals;
        }
        //sort the intervals
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        for(int[] interval: intervals){
            if(result.size() == 0 || result.get(result.size() - 1)[1] < interval[0]){
                result.add(interval);
            }else{
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][2]);

    }
}
