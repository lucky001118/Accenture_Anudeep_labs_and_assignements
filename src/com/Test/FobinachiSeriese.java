package com.Test;

public class FobinachiSeriese {
    /*
    que 3--> Fibonacci Series: Write a program to print the Fibonacci series up to n terms.
     */

    public void fibonacciSeries(int number){
        int fibonacci=0;
//        int currentNumber=0;
        int previouseNumber=0;
        for (int i=0;i<=number;i++){
            fibonacci = previouseNumber+i;
            System.out.print(fibonacci+" ");
            previouseNumber=i;
        }
    }
    public static void main(String[] args) {
//        In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
        FobinachiSeriese f = new FobinachiSeriese();
        f.fibonacciSeries(10);
    }
}
