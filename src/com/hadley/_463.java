package com.hadley;

/*
2020.07.07
463、Island Perimeter

 */
public class _463 {
    //对于每个岛屿格子先默认加上四条边，然后检查其左面和上面是否有岛屿格子，有的话分别减去两条边
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0) continue;
                res += 4;
                if(i > 0 && grid[i-1][j] == 1) res -= 2;
                if(j > 0 && grid[i][j-1] == 1) res -= 2;
            }

        }
        return res;
    }
}
