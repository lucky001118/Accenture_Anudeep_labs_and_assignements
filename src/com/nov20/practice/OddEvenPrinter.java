package com.nov20.practice;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Thread oddThread = new OddThread();
        Thread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();
    }
}


