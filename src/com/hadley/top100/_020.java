package com.hadley.top100;

/*
2020.08.13
20、Valid Parentheses
 */

import java.util.Stack;

public class _020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()||s.charAt(i) == 40||s.charAt(i) == 91||s.charAt(i) == 123) {
                stack.push(s.charAt(i));
                continue;
            }else if(s.charAt(i) == 41){
                if(stack.peek() == 40){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i) == 93){
                if(stack.peek() == 91){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i) == 125){
                if(stack.peek() == 123){
                    stack.pop();
                }else{
                    return false;
                }
            }


        }
        return stack.empty();
    }
}
