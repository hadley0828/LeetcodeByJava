package com.hadley.challenge30days;

/*
2020.04.19
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */

import java.util.Arrays;

public class MinimumPathSum {

    //solution: 动态规划
    public int minPathSum(int[][] grid) {
        int col = grid[0].length;
        int row = grid.length;
        int[][] ret = new int[row][col];

        for(int i = 0; i < grid.length; i++){
            Arrays.fill(ret[i],0);
        }

        ret[0][0] = grid[0][0];

        //the process of the row 1
        for(int i = 1; i < col; i++){
            ret[0][i] = ret[0][i-1] + grid[0][i];
        }

        //the process of the col 1
        for(int i = 1; i < row; i++){
            ret[i][0] = ret[i-1][0] + grid[i][0];
        }

        for(int i = 1; i < row; i++){
            for(int j =1; j < col; j++){
                ret[i][j] = grid[i][j] + Math.min(ret[i-1][j],ret[i][j-1]);
            }
        }
        int result = ret[row-1][col-1];

        return result;
    }
}
