package com.labx2;

import java.util.Scanner;

/*
1.  Write a program to check whether a number is a Strong number or not.
Strong number is a special number whose sum of factorial of digits is equal to the original number.
For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 */
public class StrongNumber {
    //    Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.

    // Function to calculate factorial of a number
    public int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return(num * factorial(num-1));
    }

    // Function to check if a number is a Strong number
    public boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        // Loop through each digit of the number
        while (number > 0) {
            int digit = number % 10; //gives last digit of number
            sum = sum + factorial(digit); // Add the factorial of each digit to sum
            number = number/10; //update number by removing last digit in every etration
        }

        // If the sum of the factorials of digits equals the original number, it's a Strong number
        boolean result ;
        if (sum == originalNumber){
            result = true;
        }else {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        StrongNumber strongNumber = new StrongNumber();

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Strong number
        if (strongNumber.isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

    }

}
