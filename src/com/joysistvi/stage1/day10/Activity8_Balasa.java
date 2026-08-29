package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Balasa {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];
        int sum = 0;

        // Ask the user to input 5 numbers
        System.out.println("Please enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Accumulate sum as inputs are read
        }

        // Display all the numbers entered
        System.out.println("\nNumbers entered:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // New line

        // Compute average (cast sum to double for decimal precision)
        double average = (double) sum / numbers.length;

        // Display the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}