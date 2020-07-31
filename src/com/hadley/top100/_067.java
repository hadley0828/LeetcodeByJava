package com.hadley.top100;

/*
2020.07.18
67、Add Binary
 */

public class _067 {
    public String addBinary(String a, String b) {
        //make two String to same length
        String temp = "";
        if(a.length() < b.length()){
            temp = b;
            b = a;
            a = temp; //b小
        }
        int number = a.length() - b.length();
        if(a.length() != b.length()){
            for(int i = 0; i < number; i++){
                b = "0" + b;
            }
        }
        String result = "";
        int bit = 0;
        for(int i = a.length() - 1; i >= 0; i--){
            if(a.charAt(i) == '0'&& b.charAt(i) == '0'){
                result = String.valueOf(bit) + result;
                bit = 0;
            }else if(a.charAt(i) == '1'&& b.charAt(i) == '1'){
                result = String.valueOf(bit) + result;
                bit = 1;
            }else{
                if(bit == 1){
                    result = "0" + result;
                    bit = 1;
                }else{
                    result = "1" + result;
                    bit = 0;
                }
            }
        }

        return bit == 1?'1'+result:result;
    }


    //more clean version, copy from discussion
    public String addBinary1(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int i =0, carry = 0;
        String res = "";
        while(i<lena || i<lenb || carry!=0){
            int x = (i<lena) ? Character.getNumericValue(a.charAt(lena - 1 - i)) : 0;
            int y = (i<lenb) ? Character.getNumericValue(b.charAt(lenb - 1 - i)) : 0;
            res = (x + y + carry)%2 + res;
            carry = (x + y + carry)/2;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        _067 test = new _067();
        System.out.println(test.addBinary("1"
                ,"11111111111"));
    }
}
