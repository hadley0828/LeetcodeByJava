package com.hadley.challenge30days;

/*
2020.04.10
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 */

import java.util.Stack;

public class BackspaceStringCompare {

    //use stack: first in, last out
    public boolean backspaceCompare(String S, String T) {
        String resultS = "";
        String resultT = "";
        Stack<Character> stack = new Stack<Character>();
        char[] charListS = S.toCharArray();
        for(int i = 0; i < charListS.length; i++){
            if(charListS[i] == '#'){
                if(!stack.empty()){
                    stack.pop();
                }
            }else{
                stack.push(charListS[i]);
            }
        }
        //resultS
        while(!stack.empty()){
            resultS += stack.pop();
        }

        char[] charListT = T.toCharArray();
        for(int j = 0; j < charListT.length; j++){
            if(charListT[j] == '#'){
                if(!stack.empty()){
                    stack.pop();
                }
            }else{
                stack.push(charListT[j]);
            }
        }
        while(!stack.empty()){
            resultT += stack.pop();
        }

        return resultS.equals(resultT);
    }

    //method 2: use pointer

    public static void main(String[] args) {
        BackspaceStringCompare bs = new BackspaceStringCompare();
        System.out.println(bs.backspaceCompare("xywrrmp","xywrrm#p"));
    }

}
