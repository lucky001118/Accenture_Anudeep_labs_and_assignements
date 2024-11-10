package com.Test;

public class ArmstrongNumber {
//que 13--> Check for Armstrong Number: Write a program to check if a number is an Armstrong number (e.g., 153).
    private boolean isArnstrongNumber(int number){
        /*
An Armstrong number is a special kind of number in math. It's a number that equals the sum of its digits, each raised to a power.
 For example, if you have a number like 153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.
         */
        int temp, last=0, sum=0;
        //counting digit
        temp=number;
        int digit=0;
        while(number>0){
            number=number/10;
            digit++;
        }
        System.out.println(digit);

         number=temp;
        while(number>0)
        {
//determines the last digit from the number
            last = number % 10;
//calculates the power of a number up to digit times and add the resultant to the sum variable
            sum +=  (Math.pow(last, digit));
//removes the last digit
            number = number/10;
        }
        if (sum==temp)
            return true;
        return false;
    }

    public static void main(String[] args) {
        ArmstrongNumber ar = new ArmstrongNumber();
        boolean result=ar.isArnstrongNumber(153);
        System.out.println(result);

    }

}
