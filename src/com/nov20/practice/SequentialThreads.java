package com.nov20.practice;

public class SequentialThreads {

    public static void main(String[] args) {
        // Create three threads
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread-1: Task is starting...");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread-1 interrupted");
            }
            System.out.println("Thread-1: Task is completed.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread-2: Task is starting...");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread-2 interrupted");
            }
            System.out.println("Thread-2: Task is completed.");
        });

        Thread thread3 = new Thread(() -> {
            System.out.println("Thread-3: Task is starting...");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread-3 interrupted");
            }
            System.out.println("Thread-3: Task is completed.");
        });

        // Start and join threads in sequence
        try {
            thread1.start();
            thread1.join(); // Wait for Thread-1 to complete

            thread2.start();
            thread2.join(); // Wait for Thread-2 to complete

            thread3.start();
            thread3.join(); // Wait for Thread-3 to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }

        System.out.println("All threads have completed their tasks.");
    }
}

