package com.labx1;

import java.util.Scanner;

/* 1. Create a Bank class and declare an instance variable named amount of type
double.Create parameterized constructor to initialize variable “amount” with value 10000.
Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
Calculate withdrawal based on some condition (using ternary operator) like If amount
is sufficient then “withdraw successful” message will be printed on the console and
amount should be updated after withdraw. Later on, deposit 5000 in the account balance.
        At the end display total balance on the console. */
public class Bank {
    public double amount;

    public Bank(double amoutn){
        this.amount = amoutn;
    }

    //method for withdraw amount
    public double withdraw(double withdrawAmoutnt){
        // condition if the amount will greater then the withdrawal amount the withdraw access else not
        boolean access = (amount>withdrawAmoutnt)?true:false;

        if (access){
            System.out.println("You have sufficiant amount for withdraw...");
            System.out.println("please wait few seconds withdrawing your request....");

            // delay for 2 seconds, for showing the calculation effect
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //updating the actual amount after the withdraw
            amount = amount-withdrawAmoutnt;

            //success message
            System.out.println("The withdrawal of the amount is successfully done!");
            System.out.println("You have withdrawed "+withdrawAmoutnt+" rupees and you have "+amount+" in your account");
        }else {
            System.out.println("You do not have sufficiant amount for withdraw, please try with less amount");
        }

        return amount;
    }

    //method for the deposit money into the bank
    public double deposit(double depositAmount){
        System.out.println("Depositing "+depositAmount+" money in the your account, please wait...");

        // delay for 2 seconds, for showing the calculation effect
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //updating the amount
        amount = amount+depositAmount;
        //return the amount after the deposit
        return amount;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(10000);
        System.out.println("##### Welcome to my bank service #####");
        System.out.println();

        System.out.print("Do you wants to withdraw any amount in your account? enter the withdrawal amount: ");
        double withdrawAmt = sc.nextDouble();
        bank.withdraw(withdrawAmt);

        System.out.println();
        double balance = bank.deposit(5000);
        System.out.println();
        System.out.println("The remaining balance in your account is: "+balance);
    }
}
