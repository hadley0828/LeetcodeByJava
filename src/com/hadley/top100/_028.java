package com.hadley.top100;

/*
2020.06.23
28 Implement strStr()
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */

public class _028 {

    public int bruteStrStr(String haystack, String needle){
        int hLen = haystack.length();
        int nLen = needle.length();
        int i = 0;
        int j = 0;
        while(i < hLen && j < nLen){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }

        }

        if(j == nLen){
            return i - j;
        }else{
            return -1;
        }
    }


    //instead of brute solution, we use KMP algorithm here to improve the efficiency
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0 || needle == null){
            return 0;
        }
        //TODO
        return -1;
    }


    //link: https://blog.csdn.net/v_july_v/article/details/7041827


}
