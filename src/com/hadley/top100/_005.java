package com.hadley.top100;

/*
2020.07.16
5、Longest Palindromic Substring
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */

public class _005 {

    String sub = "";
    int maxLen = 0;
    public void findMaxLongPalindromicNumber(String s, int low, int high){
        int low1 = low;
        while(low >= 0 && high < s.length()){ //extend to left and right side
            if(s.charAt(low) == s.charAt(high)){
                if(maxLen < high - low + 1){
                    maxLen = high - low + 1;
                    sub = s.substring(low,high + 1);
                }
                low--;
                high++;

            }else{
                break;
            }
        }
    }

    public String longestPalindrome(String s){
        if(s == null || s.length() <= 1){
            return s;
        }
        for(int i = 0; i < s.length() - 1; i++){
            findMaxLongPalindromicNumber(s,i,i); //奇
            findMaxLongPalindromicNumber(s,i,i+1); //偶
        }
        return sub;
    }

}
