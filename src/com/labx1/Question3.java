package com.labx1;

import java.util.Scanner;

/* 3. Write a program to declare two variables num and n and take an input during compilation
        time to check whether the nth bit of the given number is set (1) or not (0).  */
public class Question3 {
    private int num;
    private int n;

    public Question3(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question3 q3 = new Question3();

        //taking inputs
        System.out.print("Enter the number: ");
        q3.num = sc.nextInt();

        System.out.print("Enter the bit position to check: ");
        q3.n = sc.nextInt();

        // Checking if nth bit is set
        //understanding
       /* num = 29 (in binary, 29 is 11101).
        n = 3 means you want to check the 3rd bit (counting from 0).
        1 in binary is 00001
         1<<3 means left shift in 3rd position hance 1<<3 = 00100
         (29 & (1<<3)) is (11101 AND 00100)
         (11101 AND 00100) = 00100
         becouse it gives 00100 means in the third possion is 1 means it will be set(1)
         */
        if ((q3.num & (1 << q3.n)) != 0) {
            System.out.println("The " + q3.n + "th bit of " + q3.num + " is set (1).");
        } else {
            System.out.println("The " + q3.n + "th bit of " + q3.num + " is not set (0).");
        }


    }
}
