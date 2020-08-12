package com.hadley;

/*
2020.08.04
342、Power of Four
 */
public class _342 {
    public boolean isPowerOfFour(int num) {

        return num > 0 && Integer.bitCount(num) == 1 && Integer.bitCount(num-1)%2 == 0;
    }
}
