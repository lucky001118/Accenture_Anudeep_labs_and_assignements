package com.labx2;

import java.util.Scanner;

public class CheckLeapYear {

    public boolean isLeapYear(int year){
        boolean leapYearOrNot;
        // Checking if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leapYearOrNot=true;
        } else {
            leapYearOrNot=false;
        }
        return leapYearOrNot;
    }

    public static void main(String[] args) {
        CheckLeapYear checkLeapYear = new CheckLeapYear();

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear=checkLeapYear.isLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Closing the scanner
        scanner.close();
    }
}
