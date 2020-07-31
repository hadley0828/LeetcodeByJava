package com.hadley;

/*
2020.07.23
260、Single Number III
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Example:

Input:  [1,2,1,3,2,5]
Output: [3,5]
 */

import java.util.ArrayList;
import java.util.List;

public class _260 {

    public int[] singleNumber(int[] nums) {
        int[] re = new int[2];
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmp = tmp ^ nums[i];
        }
        // find  first one
        int n = 0;
        while ((tmp & 1) == 0) {
            tmp = tmp >> 1;
            n++;
        }
        // split
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {

            int t = nums[i];
            int bit = n;
            while (bit > 0) {
                t = t >> 1;
                bit--;
            }
            if ((t & 1) == 0) {
                l1.add(nums[i]);
            } else {
                l2.add(nums[i]);
            }

        }
        re[0] = l1.get(0);
        for (int i = 1; i < l1.size(); i++) {
            re[0] = re[0] ^ l1.get(i);
        }
        re[1] = l2.get(0);
        for (int i = 1; i < l2.size(); i++) {
            re[1] = re[1] ^ l2.get(i);
        }
        return re;
    }
}
