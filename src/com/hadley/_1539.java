package com.hadley;

/*
2020.01.06
Kth Missing Positive Number

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 */

public class _1539 {

    //Memory Limit Exceeded
    public int findKthPositive(int[] arr, int k) {
        int[] allList = new int[Integer.MAX_VALUE];
        //index from 0 to Integer.MAX_VALUE-1
        for(int i = 0; i < arr.length; i++){
            allList[arr[i] - 1] = 1;
        }

        int result = 0;
        for(int i = 0; i < allList.length; i++){
            if(k <= 0){
                break;
            }

            if(allList[i] == 1){
                k--;
                result++;
            }
        }
        return result;
    }


    public int findKthPositive1(int[] arr, int k) {
        //ideally, arr[i].value = i + 1
        for(int i = 0; i < arr.length; i++){
            if(arr[i] - i - 1 >= k){
                return k + i;
            }
        }
        return k + arr.length;
    }

}
