package com.nov20.practice;

// Thread for printing odd numbers
class OddThread extends Thread {
    private static final Object lock = new Object();
    private static boolean isOddTurn = true; // Flag to toggle between odd and even
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            synchronized (lock) {
                while (!isOddTurn) { // Wait for even thread
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Odd thread interrupted");
                    }
                }
                System.out.println("Odd: " + i);
                isOddTurn = false; // Set flag for even thread
                lock.notify(); // Notify the even thread
            }
        }
    }
}
