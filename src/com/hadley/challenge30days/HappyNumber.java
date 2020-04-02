package com.hadley.challenge30days;

/*
2020.04.02
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    /*
    无法处理无限循环的情况
     */
    public boolean isHappy(int n) {
        int total = 0;
        while(n > 0){
            int v = n%10;
            n /= 10;
            total += Math.pow(v,2);
            System.out.println(total);
        }
        if(total == 1){
            return true;
        }else{
            return isHappy(total);
        }

    }

    /*
    效率慢 可能是把integer转换为char比较费
     */
    HashSet<Integer> hashSet = new HashSet<>();
    public boolean isHappy1(int n){
        if(n < 1){
            return false;
        }else if(n == 1){
            return true;
        }

        int total = 0;
        String str = n + "";
        for(int count = 0; count < str.length(); count++){
            total += Math.pow(str.charAt(count)-'0',2);
        }

        if(total == 1){
            return true;
        }else if(hashSet.contains(total)){
            return false;
        }else{
            hashSet.add(total);
        }

        return isHappy1(total);

    }

    public boolean isHappy2(int n){
        HashSet<Integer> set = new HashSet<>();

       while(n > 1){
           int m = 0;
           while(n > 0){
               int d = n % 10;
               m += d * d;
               n /= 10;

           }

           if(set.contains(m)){
               return false;
           }
           set.add(m);
           n = m; //处理循环
       }

       return true;

    }




}
