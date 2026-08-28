package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class DoWhileStatement {

    public static void main(String[] args) {

        // [Syntax] Do-While Loop

        /*
            initialization;
            do {
                // statement / body of the loop
                // increment / decrement
            } while (condition);
         */

        Scanner scanner = new Scanner(System.in);

        String email = "kapitanpetmalu@gmail.com";
        String password = "kapitanpetmalu";

        int maxAttempts = 3;

        boolean isLoggedIn = false;
        do {
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
        } while (!isLoggedIn);
    }

}

// Print number  from 1 - 10
//
//int i = 1;
//        do  {
//            System.out.println(i);
//            i++;
//        }while (i <= 10);