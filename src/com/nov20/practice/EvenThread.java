package com.nov20.practice;


// Thread for printing even numbers
class EvenThread extends Thread {
    private static final Object lock = new Object();
    private static boolean isOddTurn = true; // Flag to toggle between odd and even
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            synchronized (lock) {
                while (isOddTurn) { // Wait for odd thread
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Even thread interrupted");
                    }
                }
                System.out.println("Even: " + i);
                isOddTurn = true; // Set flag for odd thread
                lock.notify(); // Notify the odd thread
            }
        }
    }
}
