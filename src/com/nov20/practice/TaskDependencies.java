package com.nov20.practice;

public class TaskDependencies {
    /*
    Task Dependencies with Threads
Problem: Create three threads, each performing a dependent task:--

Thread-1: Reads input (e.g., a string).
Thread-2: Processes the input (e.g., converts it to uppercase).
Thread-3: Displays the processed output.
Ensure that each thread starts only after its predecessor finishes by using join().
     */

    public static void main(String[] args) {
        final String[] input = new String[1]; // Shared data for thread communication
        final String[] processedOutput = new String[1];

        // Thread-1: Reads input
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread-1: Reading input...");
            input[0] = "hello world"; // Simulate user input
            System.out.println("Thread-1: Input read as \"" + input[0] + "\"");
        });

        // Thread-2: Processes the input
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread-2: Processing input...");
            if (input[0] != null) {
                processedOutput[0] = input[0].toUpperCase(); // Convert to uppercase
                System.out.println("Thread-2: Processed input as \"" + processedOutput[0] + "\"");
            } else {
                System.out.println("Thread-2: No input to process.");
            }
        });

        // Thread-3: Displays the processed output
        Thread thread3 = new Thread(() -> {
            System.out.println("Thread-3: Displaying output...");
            if (processedOutput[0] != null) {
                System.out.println("Thread-3: Processed output is \"" + processedOutput[0] + "\"");
            } else {
                System.out.println("Thread-3: No output to display.");
            }
        });

        // Start and manage threads using join()
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

        System.out.println("All tasks are completed.");
    }
}

