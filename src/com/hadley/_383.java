package com.hadley;

/*
383、Ransom note
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

import java.util.HashMap;

public class _383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> letterMap = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if (!letterMap.containsKey(magazine.charAt(i))){
                letterMap.put(magazine.charAt(i),1);
            }else{
                letterMap.put(magazine.charAt(i),letterMap.get(magazine.charAt(i)) + 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            if(!letterMap.containsKey(ransomNote.charAt(i)) || letterMap.get(ransomNote.charAt(i)) == 0){
                return false;
            }else{
                letterMap.put(ransomNote.charAt(i),letterMap.get(ransomNote.charAt(i)) - 1);
            }
        }

        return true;
    }
}
