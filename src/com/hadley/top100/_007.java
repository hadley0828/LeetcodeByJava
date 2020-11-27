package com.hadley.top100;

/*
2020.08.23
7、Reverse Integer
 */

public class _007 {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = 10 * res + x % 10;
            x /= 10;
        }
        return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res;
    }
}
