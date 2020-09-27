package com.hadley;

/*
387、First Unique Character in a String
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

 */

import java.util.HashSet;

public class _387 {
    public int firstUniqChar(String s) {
        HashSet<Character> ones = new HashSet<>();
        HashSet<Character> twos = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(!ones.contains(s.charAt(i))){
                ones.add(s.charAt(i));
            }else{
                if(!twos.contains(s.charAt(i))){
                    twos.add(s.charAt(i));
                }
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(!twos.contains(s.charAt(i))){
                return i;
            }
        }

        return -1;
    }
}
