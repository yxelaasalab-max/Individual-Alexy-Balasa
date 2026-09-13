package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class UserAcc {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("== User Account Registration ==");
        System.out.println("================================\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Middle Name:");
        String middleName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter Address: ");
        String address = input.nextLine();
        System.out.print("Enter Email: ");
        String email = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();
        UserAccount username = new UserAccount(firstName, middleName, lastName, address, email, password);

        System.out.println("\n===User Account Created===");
        System.out.println("Full name: " + username.getFirstName() + " " + username.getMiddleName() + " " + username.getLastName());
        System.out.println("Address: " + username.getAddress());
        System.out.println("Email: " + username.getEmail());
    }
}
