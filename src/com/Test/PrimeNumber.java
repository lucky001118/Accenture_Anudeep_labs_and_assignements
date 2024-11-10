package com.Test;

public class PrimeNumber {
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // the square root of n (rounded down to the nearest integer)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        // If n is not divisible by any of these numbers, return true
        return true;
    }
    /*
    Check if a Number is Prime: Write a program that checks if a given integer is a prime number.
     */
    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        if (p.isPrime(7)){
            System.out.println("This is the prime number");
        }else {
            System.out.println("This is the not prime nuber");
        }

    }
}
