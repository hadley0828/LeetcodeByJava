package com.hadley.top100;

/*
2020.07.21
79、Word Search
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 */

public class _079 {

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || board == null)
            return false;
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (solve(board, words, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean solve(char[][] board, char[] words, int i, int j, int index) {
        if (index >= words.length)
            return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[index])
            return false;
        // 与512异或是防止递归中重复使用该元素。相当于一个标记(这里使用256,512,1024都可以)
        board[i][j] ^= 512;
        boolean flag = solve(board, words, i - 1, j, index + 1)
                || solve(board, words, i + 1, j, index + 1)
                || solve(board, words, i, j - 1, index + 1)
                || solve(board, words, i, j + 1, index + 1);
        board[i][j] ^= 512;
        return flag;
    }
}
