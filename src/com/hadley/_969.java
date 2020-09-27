package com.hadley;

/*
2020.08.29
969、Pancake Sorting
 */

import java.util.ArrayList;
import java.util.List;

public class _969 {
    public List<Integer> pancakeSort(int[] A) {
        int maxNum=0;
        int maxIndex=0;
        boolean flag=true;
        int k=0,len=A.length;
        List<Integer>res=new ArrayList<>();
        while(flag){
            //int i=1;
            maxNum=A[0];maxIndex=0;
            for(int i=1;i<len-k;i++){
                if(maxNum<A[i]){maxNum=A[i];maxIndex=i;}
            }

            if(maxIndex!=0)res.add(maxIndex+1);

            int tempCnt=(int)((maxIndex+1)/2);
            for(int i=0;i<tempCnt;i++){
                int temp=A[i];
                A[i]=A[maxIndex-i];
                A[maxIndex-i]=temp;
            }

            //r(int i=0;i<len;i++)
            //  System.out.print(A[i]+"");
            //stem.out.print("\n");

            res.add(len-k);
            tempCnt=(int)((len-k)/2);
            for(int i=0;i<tempCnt;i++){
                int temp=A[i];
                A[i]=A[len-i-1-k];
                A[len-i-1-k]=temp;
            }
            k++;

            //for(int i=0;i<len;i++)
            //    System.out.print(A[i]+"");
            //System.out.print("\n");

            flag=false;
            for(int i=1;i<len;i++){
                if(A[i-1]>A[i]){flag=true;break;}
            }
        }
        return res;
    }
}
