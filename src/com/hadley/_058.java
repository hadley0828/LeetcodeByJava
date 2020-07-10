package com.hadley;

/*
2020.07.10
58、Length of Last Word
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */

public class _058 {

    public int lengthOfLastWord(String s) {
        String[] temp = s.split(" ");
        if(temp.length == 0 || temp == null) return 0;
        return temp[temp.length - 1].length();
    }

    //more efficient solution
    public int lengthOfLastWord1(String s){
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }

}
