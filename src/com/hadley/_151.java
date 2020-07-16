package com.hadley;

/*
2020.07.15
151、  Reverse Words in a String
 */

public class _151 {

    public String reverseWords(String s) {
        String result = "";
        s = s.trim();
        String[] temp = s.split("\\s+");
        System.out.println(temp.length);
        for(int i = temp.length - 1; i >=0; i--){
            System.out.println(temp[i]);
            result = result + temp[i] + " ";
        }
        return result.substring(0,result.length()-1);
    }
}
