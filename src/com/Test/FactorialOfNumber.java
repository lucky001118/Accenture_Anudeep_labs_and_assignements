package com.Test;

public class FactorialOfNumber {
    /*
    que 5--> Factorial of a Number: Write a program to calculate the factorial of a given number.

     */
private int factorial(int number){
    if (number==1 || number==0)
        return 1;
    return number*factorial(number-1);
}

    public static void main(String[] args) {

    FactorialOfNumber fn = new FactorialOfNumber();
    int factorial = fn.factorial(10);
        System.out.println(factorial);

    }
}
