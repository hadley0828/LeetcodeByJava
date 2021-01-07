package com.hadley;

/*
2021.01.02
Palindrome Permutation
Given a string, determine if a permutation of the string could form a palindrome.

Example 1:
Input: "code"
Output: false

Example 2:
Input: "aab"
Output: true

Example 3:
Input: "carerac"
Output: true
 */

import java.util.HashSet;

public class _266 {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }

        if(set.size() == 0 || set.size() == 1){
            return true;
        }

        return false;
    }
}
