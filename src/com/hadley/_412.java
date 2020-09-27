package com.hadley;

/*
412、 Fizz Buzz
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 */

import java.util.ArrayList;
import java.util.List;

public class _412 {
    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();
        for(int i = 1; i < n + 1; i++){
            if(i % 3 == 0 && i % 5 == 0){
                resultList.add("FizzBuzz");
            }else if(i % 3 == 0){
                resultList.add("Fizz");
            }else if(i % 5 == 0){
                resultList.add("Buzz");
            }else{
                resultList.add(String.valueOf(i));
            }
        }
        return resultList;
    }
}
