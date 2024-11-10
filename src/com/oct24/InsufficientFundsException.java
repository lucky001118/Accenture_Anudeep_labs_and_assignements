package com.oct24;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super();
    }
    public InsufficientFundsException(String message){
        super(message);
    }
}
