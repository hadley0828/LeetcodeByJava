package com.hadley.top100;

/*
2020.09.27 ZigZag Conversion
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 */

public class _006 {

    public String convert(String s, int numRows) {
        if(numRows == 0) return "";
        if(numRows == 1) return s;
        // numRows + (numRows - 2)
        String result = "";
        int oneUnit = 2 * numRows - 2;
        int quotient = s.length() / oneUnit;

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < quotient + 1; j++){
                if(j * oneUnit + i <= s.length() - 1){
                    result += s.charAt(j * oneUnit + i);
                }
                if(i != 0 && i != numRows - 1){
                    if((j + 1) * oneUnit - i <= s.length() - 1){
                        result += s.charAt((j + 1) * oneUnit - i);
                    }
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        _006 test = new _006();
        System.out.println(test.convert("PAYPALISHIRING",4));
    }
}
