package com.hadley.challenge30days;

/*
2020.04.13
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)



Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation:
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class LastStoneWeight {

    //use iterator to delete one element in the list
    //link: https://blog.csdn.net/sinat_38301574/article/details/79601177?depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-3&utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-3
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        if(stones.length == 1){
            return stones[0];
        }else if(stones.length == 0){
            return 0;
        }else{
            int a = stones[stones.length-1];
            int b = stones[stones.length-2];
            if(a == b){
               int[] newList = new int[stones.length-2];
               for(int i = 0; i < stones.length-2; i++){
                   newList[i] = stones[i];
               }
               return lastStoneWeight(newList);
            }else{
                int[] newList = new int[stones.length-1];
                for(int i = 0; i < stones.length-2; i++){
                    newList[i] = stones[i];
                }
                newList[newList.length-1] = a - b;
                return lastStoneWeight(newList);
            }

        }
    }

    //solution2:优先队列做法 link:https://www.cnblogs.com/fatttcat/p/11179442.html

    public static void main(String[] args) {

        String str = "apple";
        char[] charList = str.toCharArray();

        int[] resultList = {2,7,4,1,8,1};
//        Arrays.sort(resultList);
//        for(int i = 0; i < resultList.length; i++){
//            System.out.println(resultList[i]);
//        }
        LastStoneWeight lsw = new LastStoneWeight();
        System.out.println(lsw.lastStoneWeight(resultList));

    }
}
