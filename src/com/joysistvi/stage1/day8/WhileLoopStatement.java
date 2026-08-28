package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] args) {

        // [Syntax]

        /*
            initialization
            while (condition) {
                statement / body of the loop
                inc / dec
         */

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = false;

        while (!isRunning) {
            System.out.print("Type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program stopped!");
                isRunning = true;
            }
        }

        // flag -> use to track / mark a variable whether a specific  condition or event has occurred
    }
}

/*
    While loop - Use when the number of repetition is unknown in advance

// Print number from 1 - 10

    int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

 */

/*
Scanner scanner = new Scanner(System.in);

        String email = "kapitanpetmalu@gmail.com";
        String password = "kapitanpetmalu";

        int maxAttempts = 3;

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();

            if (loginEmail.equals(email) && loginPassword.equals(password)) {
                System.out.println("Login Succesfully");

                isLoggedIn = true; // stop the while loop
            }else {
                System.out.println("Invalid Username or Password");
            }
        }
 */