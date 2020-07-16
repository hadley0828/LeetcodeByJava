package com.hadley;

/*
2020.07.14
1344、Angle Between Hands of a Clock
Given two numbers, hour and minutes. Return the smaller angle (in degrees) formed between the hour and the minute hand.



Example 1:
Input: hour = 12, minutes = 30
Output: 165

Example 2:
Input: hour = 3, minutes = 30
Output: 75

Example 3:
Input: hour = 3, minutes = 15
Output: 7.5

Example 4:
Input: hour = 4, minutes = 50
Output: 155

Example 5:
Input: hour = 12, minutes = 0
Output: 0
 */

public class _1344 {
    public double angleClock(int hour, int minutes) {
        double minAngle = ((double)minutes/60) * 360;
        double hourAngle = (((double)hour % 12) + (double)minutes/60 ) * 30;

        double result = Math.abs(hourAngle - minAngle);
        return result > 180 ? 360 - result:result;
    }
}
