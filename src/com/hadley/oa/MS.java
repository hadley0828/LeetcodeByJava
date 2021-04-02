package com.hadley.oa;

public class MS {
    public int solution1(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0) return -1;
        if(A.length == 1) return A[0] >= 0 ? A[0] : -1;

        int maxRes = -1;
        int temp = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] < 0){
                temp = 0;
                continue;
            }else{
                temp = temp + A[i];
                maxRes = Math.max(temp,maxRes);
            }
        }

        return maxRes;
    }

    public int solution2(int[] A, int K) {
        // N >= 3, K < N
        int minRes = Integer.MAX_VALUE;

        int left = 0;
        while(left <= A.length - K){

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < A.length; i++){
                if(!(i >= left && i <= left + K -1)){
                    max = Math.max(max,A[i]);
                    min = Math.min(min,A[i]);
                }
            }
            //minRes
            minRes = Math.min(minRes,max - min);

            left++;
        }

        return minRes;
    }

    public int solution3(int[] A, int M) {
        // write your code in Java SE 8
        int[] remainder = new int[M];
        for(int i = 0; i < A.length; i++){
            int temp = A[i] % M;
            int mod = temp >= 0 ? temp : temp + M;
            remainder[mod] ++;
        }

        int max = remainder[0];
        for(int i = 0; i < remainder.length; i++){
            max = Math.max(max,remainder[i]);
        }

        return max;
    }
}
