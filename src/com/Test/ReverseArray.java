package com.Test;

public class ReverseArray {
    /*
que 14--> Reverse an Array: Write a program to reverse the elements of an integer array.
     */

    public static void main(String[] args) {
        int [] integerArray = {1,2,3,4,5,6,7,8,9};

        for (int i=integerArray.length-1;i>=0;i--){
            System.out.print(integerArray[i]+",");
        }
    }
}
