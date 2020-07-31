package com.hadley.top100;

/*
2020.06.28
62、 Unique Paths
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

Example 1:

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
Example 2:

Input: m = 7, n = 3
Output: 28
 */

public class _062 {

    //递归超时了
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1){
            return 1;
        }else{
            return uniquePaths(m - 1,n) + uniquePaths(m, n - 1);
        }

    }

    //用二维数组进行DP
    public int uniquePathsByDP(int m, int n){
        int[][] temp = new int[m][n];

        if(m == 1 && n == 1){
            return 1;
        }

        if(m == 1 ){
            return 1;
        }
        for(int i = 0; i < m; i++){
            temp[i][0] = 1;
        }

        if(n == 1){
            return 1;
        }
        for(int i = 0; i < n; i++){
            temp[0][i] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                temp[i][j] = temp[i-1][j] + temp[i][j-1];
            }
        }

        return temp[m-1][n-1];

    }


}
