package com.joysistvi.stage1.day14;

import java.util.Scanner;

// parameters and arguments
// SOC Principle Separation of Concern
// Code Reusability
// avoid Code duplication
public class LoadRegistration {

    // *143#
    // *123#

    static Scanner scanner = new Scanner(System.in);
    static double balance = 1000;

    public static void main(String[] args) {
        validateUssdCode();
        mainMenu();
    }

    public static void validateUssdCode() {
        System.out.println("Dial *143# to access Glove Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine().trim();

        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code. Exiting...");
            System.exit(0); // Exit JVM
        }
    }

    public static void mainMenu() {
        System.out.println("\n=== Load Registration ===");
        System.out.println(" [1] Unli All net call and text");
        System.out.println(" [2] Back ");
        System.out.println(" [3] Exit ");

        System.out.print("Enter Choice: ");
        int mainMenuChoice = scanner.nextInt();

        switch (mainMenuChoice) {
            case 1:
                unliAllNetCallText();
                break;
        }
    }

    public static void unliAllNetCallText() {
        System.out.println("\n=== Unli all Net Calls and Text ===");
        System.out.println(" [1] 1 day for P15 10gb");
        System.out.println(" [2] 3 day for P30 20gb");
        System.out.println(" [3] 5 day for P45 30gb");
        System.out.println(" [4] 7 day for P60 40gb");
        System.out.println(" [5] Back");
        System.out.println(" [6] Exit");
        System.out.print("Enter Choice: ");
        int unliAllNetChoice = scanner.nextInt();

        switch (unliAllNetChoice) {
            case 1:
                subscriptionConfirm(1,15,10);
                break;
            case 2:
                subscriptionConfirm(3,30,20);
                break;
            case 3:
                subscriptionConfirm(5,45,30);
                break;
            case 4:
                subscriptionConfirm(7,60,40);
                break;
        }
    }
    // Parameters and Arguments
    public static void subscriptionConfirm(int days, int price, int gb) {
        System.out.println("\nGet" + days + " Days Unli all net call and text for only " + price +  " and " + gb + "gb free");

        System.out.println(" [1] Subscribe");
        System.out.println(" [2] Back");
        System.out.println(" [3] Exit");
        System.out.print("Enter Choice: ");
        int subscriptionChoice = scanner.nextInt();

        if (subscriptionChoice == 1) {
            System.out.println("You are now subscribe to our Promo Unli all net, calls and texts");
        } else if (subscriptionChoice == 2) {
            return;
        } else if (subscriptionChoice == 3) {
            exitChoice();
        }
    }

    public static void exitChoice() {
        System.out.println("Are you sure you really want to exit?");
        System.out.println("Press Y/N");

//        if (choice.equals(y)) {
//            System.exit(0);
//        }
    }

    // return -> exit the method
    // System.exit(0) -> exit the system
    // break -> exit the switch or loop
}


//case 1:
//        System.out.println(" [1] Get Unli all net call and text 1 day for only P15");
//                System.out.println(" [1] Subscribe");
//                System.out.println(" [2] Back");
//                System.out.println(" [3] Exit");
//                System.out.println("Enter Choice: ");
//                break;
//                        case 2:
//                        System.out.println(" [2] Get Unli all net call and text 3 day for only P30");
//                System.out.println(" [1] Subscribe");
//                System.out.println(" [2] Back");
//                System.out.println(" [3] Exit");
//                System.out.println("Enter Choice: ");
//                break;
//                        case 3:
//                        System.out.println(" [3] Get Unli all net call and text 5 day for only P45");
//                System.out.println(" [1] Subscribe");
//                System.out.println(" [2] Back");
//                System.out.println(" [3] Exit");
//                System.out.println("Enter Choice: ");
//                break;
//                        case 4:
//                        System.out.println(" [4] Get Unli all net call and text 7 day for only P60");
//                System.out.println(" [1] Subscribe");
//                System.out.println(" [2] Back");
//                System.out.println(" [3] Exit");
//                System.out.println("Enter Choice: ");
//                break;
//                        System.out.println(" [5] Back");
//                System.out.println(" [6] Exit");
//                System.out.println("Enter Choice: ");
//        int unliAllNetCallText = scanner.nextInt();
//
//                switch (unliAllNetCallText) {
//        }

/*
example: 1
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        greet(name);
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
 */