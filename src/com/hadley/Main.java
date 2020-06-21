package com.hadley;


import java.util.Stack;

public class Main {

    public int longestValidParentheses(String s) {
        int result = 0;
        //用栈来进行处理
        Stack<Integer> stack = new Stack<>();
        int index = -1; //指针

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{  //s.charAt(i) == ')'
                if(stack.isEmpty()){
                    index = i;
                }else{
                    stack.pop();
                    if(stack.isEmpty()){ //i - index是当前的子串长度
                        result = Math.max(result,i - index);
                    }else{
                        result = Math.max(result, i - stack.peek());
                    }
                }

            }
        }
        return result;
    }

}
