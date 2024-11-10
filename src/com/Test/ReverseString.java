package com.Test;

public class ReverseString {
    /*
 que 1-->   Reverse a String: Write a program to reverse a given string (e.g., 'Hello World').
     */

    public static void main(String[] args) {
        String str="Hello World";
        char [] strArr=str.toCharArray();

        for (int i= strArr.length-1;i>=0;i--){
            System.out.print(strArr[i]);
        }
    }

}
