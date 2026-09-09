package com.joysistvi.stage1.day14;

import java.util.Scanner;

public class OnlineBank {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 10000.00;

    public static void main(String[] args) {
        validUserPass();
        mainMenu();
    }

    public static void validUserPass() {
        System.out.println("Put Bitch to access the Bitch ATM");
        System.out.print("Enter Bitch: ");
        String bitch = scanner.nextLine().trim();

        if (!bitch.equals(bitch)) {
            System.out.println("Invalid Bitch. Bye...");
            System.exit(0);
        }
    }

    public static void mainMenu() {

        while (true) {

            System.out.println("\n\n=============================");
            System.out.println("=== Welcome to ATM Bitch ===");
            System.out.println(" [1] Check Balance");
            System.out.println(" [2] Deposit");
            System.out.println(" [3] Withdraw");
            System.out.println(" [4] Back");
            System.out.println(" [5] Exit");

            System.out.print("Enter Choice: ");
            int mainMenu = scanner.nextInt();
            System.out.println("=============================");

            switch (mainMenu) {
                case 1:
                    balanceBitch();
                    break;
                case 2:
                    depositBitch();
                    break;
                case 3:
                    withdrawBitch();
                    break;
                case 4:
//                    backBitch();
                    break;
                case 5:
                    exitBitch();
                    return;
                default:
                    System.out.println("Invalid choice bitch.");
            }
        }
    }

    public static void balanceBitch() {
        System.out.println("\n\n=============================");
        System.out.println("=== Check Balance ===");
        System.out.println("Current Balance: " + balance);
        System.out.println("=============================");
    }

    public static void depositBitch() {
        System.out.println("\n\n=============================");
        System.out.println("=== Deposit ===");
        System.out.print("Enter amount: ");
        double deposit = scanner.nextDouble();

        if (deposit > 0) {
            balance += deposit;
            System.out.println("New Balance: " + balance);
            System.out.println("=============================");
        }else {
            System.out.println("Invalid deposit amount bitch.");
        }
    }

    public static void withdrawBitch() {
        System.out.println("\n\n=============================");
        System.out.println("=== Withdraw bitch ===");
        System.out.print("Enter amount: ");
        double withdraw = scanner.nextDouble();

        if (withdraw > 0) {
            balance -= withdraw;
            System.out.println("New Balance: " + balance);
            System.out.println("=============================");
        }
    }
    
//    public static void backBitch() {
//        System.out.println("\n\n=============================");
//        System.out.println("=== Back bitch ===");
//        System.out.println("=============================");
//    }

    public static void exitBitch() {
        System.out.println("\n\n=============================");
        System.out.println("=== Exit bye bitch ===");
    }
}
