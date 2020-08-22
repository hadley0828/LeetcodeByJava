package com.hadley;

/*
2020.08.22
905、Sort Array By Parity
 */

public class _905 {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int startIndex = 0;
        int endIndex = A.length - 1;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                result[startIndex] = A[i];
                startIndex ++;
            }else{
                result[endIndex] = A[i];
                endIndex --;
            }
        }
        return result;
    }
}
