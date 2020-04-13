package com.hadley.challenge30days;

import java.util.ArrayList;

/*
2020.04.10
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
public class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.add(x);
        if(minStack.isEmpty() || minStack.get(minStack.size()-1) >= x ){
            minStack.add(x);
        }
    }

    public void pop() {
        if(stack.isEmpty()) return;
        int elem = stack.remove(stack.size()-1);
        if(!minStack.isEmpty() && elem == minStack.get(minStack.size()-1)){
            minStack.remove(minStack.size()-1);
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.get(stack.size()-1);
        }
        return 0;
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.get(minStack.size()-1);
        }
        return 0;
    }
}
