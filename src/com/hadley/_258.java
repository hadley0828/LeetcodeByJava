package com.hadley;

/*
2020.07.27
258、Add Digits
 */

public class _258 {

    public int addDigits(int num) {
        if(num < 10) return num;
        int res = 0;
        while(num > 0){
            res = num % 10 + res;
            num = num / 10;
        }
        return addDigits(res);
    }
}
