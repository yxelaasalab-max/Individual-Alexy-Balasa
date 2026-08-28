package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {
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

        // invalid username
        // invalid password
    }
}

/*
    String          Number
    .equals()       ==
 */

//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String email = "kapitanpetmalu@gmail.com";
//        String password = "kapitanpetmalu";
//
//        System.out.print("Enter email: ");
//        String loginEmail = scanner.nextLine();
//
//        System.out.print("Enter password: ");
//        String loginPassword = scanner.nextLine();
//
//        if (loginEmail.equals(email) && loginPassword.equals(password)) {
//            System.out.println("Login Succesfully");
//        }else {
//            System.out.println("Invalid Username or Password");
//        }