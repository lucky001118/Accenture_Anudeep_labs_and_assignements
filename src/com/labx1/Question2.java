package com.labx1;

import java.util.Scanner;

public class Question2 {

//2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.
    private int numberFirst;
    private int numberSecond;

    private int maximum;
    public Question2(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question2 q2 = new Question2();

        //taking the input for both the numbers
        System.out.print("Please enter the first number: ");
        q2.numberFirst = sc.nextInt();
        System.out.print("Please enter the second number: ");
        q2.numberSecond = sc.nextInt();

        // 2 sec. delay for making effect of calculating using thread
        try {
            System.out.println("Please wait calculating maximum between them ....");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //finding the maximum number using the logical if...else
        if (q2.numberFirst>q2.numberSecond){
            System.out.println("The first: "+q2.numberFirst+" number is grater then second:"+q2.numberSecond+" number");
        }else {
            System.out.println("The second number: "+q2.numberSecond+" is grater then the first number: "+q2.numberFirst);
        }

        // using the Ternary Operator in java ,,, syntax:-- variable = (condition) ? expression1 : expression2
        q2.maximum = (q2.numberFirst>q2.numberSecond)? q2.numberFirst : q2.numberSecond;
        System.out.println("The maximum number finding by ternary opearator is: "+q2.maximum);
        //after decision
        System.out.println("Thanking you for finding greater number!");
    }
}
