package com.oct24;

public class BankAccount {
    private int currentAmount;
    private int withdrawalAmount;

    public void withdrawAmount(int amount)throws InsufficientFundsException{
        if (amount<=this.currentAmount){
            this.currentAmount=this.currentAmount-amount;
            System.out.println("You have withdraw the rupees: "+amount+" and you have current balance: "+currentAmount);
        }else {
           throw new InsufficientFundsException("you do not have sufficient fund to withdraw");
        }

    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.currentAmount=10000;
       int amount= ba.withdrawalAmount=11000;
        try {
            ba.withdrawAmount(ba.withdrawalAmount);
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
    }
}
