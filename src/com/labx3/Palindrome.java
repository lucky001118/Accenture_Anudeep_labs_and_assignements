package com.labx3;

import java.util.Scanner;

public class Palindrome {
    /*
    A palindrome is a word, sentence, verse, or even number that reads the same backward or forward.
    ex- madam
    reverse - madam
     */
    public boolean isPalindrome(String str) {
        // ex-->    0    4
//                  madam
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from the start and end
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
            //  0   4       1 3        2      1 3   0   4
            //  madam      madam    madam    madam  madam
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the input string to lowercase to make it case-insensitive
        String lowerCaseString = inputString.toLowerCase();

        // Check if the string is a palindrome
        if (palindrome.isPalindrome(lowerCaseString)) {
            System.out.println(inputString + " is a Palindrome");
        } else {
            System.out.println(inputString + " is not a Palindrome");
        }

        scanner.close();
    }
}
