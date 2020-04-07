package com.hadley.challenge30days;

/*
2020.04.06
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        // String: ordered String   List<String>: all possible order

        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            //sort str by the order from a to z  example: eat->aet
            //char[] charList = str.toCharArray();
            //Arrays.sort(charList);  等效为下面的方法类

            String newStr = getSortedString(str);
            if(!hashMap.containsKey(newStr)){
                List<String> newList = new ArrayList<>();
                newList.add(str);
                hashMap.put(newStr,newList);
            }else{
                hashMap.get(newStr).add(str);
            }


        }

        List<List<String>> resultList = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: hashMap.entrySet())
        {
            resultList.add(entry.getValue());
        }

        return resultList;
    }

    public String getSortedString(String string){
        char temp;
        char[] str = new char[100];
        str = string.toCharArray();
        for(int i=0;i<string.length();i++)
            for(int j=string.length()-1;j>i;j--)
            {
                if(str[j]<=str[j-1])
                {
                    temp=str[j];
                    str[j]=str[j-1];
                    str[j-1]=temp;
                }
            }

        String result="";
        for(int i = 0; i < str.length ;i++){
            result += str[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "adsfbcv";
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.getSortedString(string));
    }

}
