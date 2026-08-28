package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Balasa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "kapitanpetmalu@gmail.com";
        String password = "kapitanpetmalu";

        int maxAttempts = 3;
        boolean isLoggedIn = false;

        System.out.println(" === Log in === ");
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt: " + attempt + " of " + maxAttempts);

            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();

            if (loginEmail.equals(email) && loginPassword.equals(password)) {
                System.out.println("Login Successfully");
                isLoggedIn = true;
                break;
            } else {
                System.out.println("Invalid Username or Password");
            }
        }

        if (!isLoggedIn) {
            System.out.println("Maximum attempts reached. Access denied.");
        }
    }
}
