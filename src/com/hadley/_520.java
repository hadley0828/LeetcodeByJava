package com.hadley;


/*
2020.08.01
520、Detect Capital
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class _520 {

    public boolean detectCapitalUse(String word) {
        int bigNumber = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) < 91 && word.charAt(i) > 64){
                bigNumber ++;
            }
        }

        if(bigNumber == 0 || bigNumber == word.length()|| (bigNumber == 1 && word.charAt(0) < 91)) return true;

        return false;
    }
}
