package com.hadley;

/*
2020.07.10
14、Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class _014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0 || strs == null) return "";
        if(strs.length == 1) return strs[0];
        //process strs[0]
        String result = "";
        for(int i = 0; i < strs[0].length(); i ++){
            for(int j = 1; j < strs.length; j ++){
                if(strs[j].length() - 1 < i  ||strs[j].charAt(i) != strs[0].charAt(i)){
                    return result;
                }

            }
            result = result + strs[0].charAt(i);
        }

        return result;
    }

}
