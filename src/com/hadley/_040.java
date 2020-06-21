package com.hadley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
2020.05.07
Given a collection of candidate numbers (candidates) and a target number (target),
find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
 */
public class _040 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<Integer>(),ans);

        return ans;
    }

    /*
    curList = current operating List
     */
    public void dfs(int[] candidates, int target, int index, List<Integer> curList, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curList));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(candidates[i] > target){
                break;
            }

            //skip the same element
            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }
            curList.add(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, curList, ans);
            curList.remove(curList.size()-1);
        }

    }
}
