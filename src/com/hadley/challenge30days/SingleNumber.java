package com.hadley.challenge30days;

/*
2020.04.01
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */

import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if(nums.length == 0){
            return nums[0];
        }else{
            int result = 0;
            for(int i = 0; i < nums.length; i++){
                result ^= nums[i]; //A XOR B XOR B = A
            }
            return result;
        }

    }

    /*
    PS: 1^2^3^4^……^100 = ?
    solution link: https://blog.csdn.net/weixin_33836223/article/details/91677347
     */

    public int singleNumber1(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i: nums){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1); //HashMap.getOrDefault用法
        }

        for(int i: nums){
            if(hashMap.get(i) == 1){
                return i;
            }
        }
        return 0;
    }

}
