package com.Test;

public class PrintPartten {
//  que 11-->  Print a Pattern: Write a program to print the following pattern:
public static void main(String[] args) {
    for (int i=1;i<=5;i++){
        for (int j=0;j<=i-1;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

}
