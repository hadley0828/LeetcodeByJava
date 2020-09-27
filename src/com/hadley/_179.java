package com.hadley;

/*
2020.09.26 Largest Number
Given a list of non negative integers, arrange them such that they form the largest number.

Example 1:

Input: [10,2]
Output: "210"
Example 2:

Input: [3,30,34,5,9]
Output: "9534330"
Note: The result may be very large, so you need to return a string instead of an integer.
 */

import java.util.Arrays;
import java.util.Comparator;

public class _179 {

    public String largestNumber(int[] nums) {
        Integer[] ints = new Integer[nums.length];

        for(int i = 0; i < nums.length; i++){
            ints[i] = nums[i];
        }

        Arrays.sort(ints,new Comparator<Integer>(){
            public int compare(Integer n1, Integer n2){
                String str1 = String.valueOf(n1);
                String str2 = String.valueOf(n2);
                return (str2 + str1).compareTo(str1 + str2);
            }

        });

        if(ints[0] == 0){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            sb.append(ints[i]);
        }

        return sb.toString();
    }
}
