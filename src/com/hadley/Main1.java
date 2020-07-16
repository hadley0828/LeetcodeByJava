package com.hadley;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int time = sc.nextInt();
        int[] coinList = new int[people];

        for(int i = 0; i < people; i++){
            coinList[i] = sc.nextInt();
        }

        Arrays.sort(coinList);
        int max = coinList[people-1];
        int min = coinList[0];

    }
}
