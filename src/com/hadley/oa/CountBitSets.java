package com.hadley.oa;

import java.util.HashMap;
import java.util.Scanner;

public class CountBitSets {

    //input: 18
    //output: 2
    //explanation: 18 = 10010

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numberList = new int[count];

        for(int i = 0; i < count; i++){
            numberList[i] = scanner.nextInt();
        }

        int result = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < numberList.length; i++){
            result = Math.max(result, numberList[i] - min);
            if(numberList[i] < min){
                min = numberList[i];
            }
        }

        System.out.println(result);
        System.out.println(result > 0 ? 1:2);
    }
}
