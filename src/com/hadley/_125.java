package com.hadley;

/*
2020.08.03
125、Valid Palindrome
 */

public class _125 {
    public boolean isPalindrome(String s) {
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            if(isNumber(s.charAt(i))||isLetter(s.charAt(i))){
                temp = temp + s.charAt(i);
            }
        }
        //temp contains only alpha
        int n = temp.length()/2;
        for(int i = 0; i < n; i++){
            char a = temp.charAt(i);
            char b = temp.charAt(temp.length()-i-1);
            if(isNumber(a) && isNumber(b) && a == b){
                continue;
            }else if(isLetter(a) && isLetter(b) && (a == b || Math.abs(a-b) == 32)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean isNumber(char c){
        if(c > 47 && c < 58) return true;
        return false;
    }

    public boolean isLetter(char c){
        if((c > 64 && c < 91)||(c > 96 && c < 123)) return true;
        return false;
    }

}
