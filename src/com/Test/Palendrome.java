package com.Test;

public class Palendrome {
    /*
    que 6--> Check Palindrome: Create a program to check if a given string is a palindrome (e.g., 'madam').
     */
    private boolean isPalendrome(String word){
        char[] wordArr=word.toCharArray();
        int count=0;
        for (int i=wordArr.length-1;i>0;i--){
            if (word.charAt(count)!=wordArr[i]){
                return false;
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        Palendrome palendrome = new Palendrome();
        boolean result = palendrome.isPalendrome("madam");
        System.out.println(result);
    }
}
