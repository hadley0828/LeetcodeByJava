package com.hadley;

/*
2020.08.07
442、Find All Duplicates in an Array
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set  = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                result.add(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }

        return result;
    }
}
