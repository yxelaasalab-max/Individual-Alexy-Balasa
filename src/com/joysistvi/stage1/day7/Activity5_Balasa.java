package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Balasa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        System.out.println("=== Simple ATM Menu ===");
        System.out.println("\nChoose between 1 - 4");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.println("_______________________");
        choice = input.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Current Balance: " + balance);
                System.out.println("\nThank you for using our ATM and God Bless You!");
                break;
            case 2:
                System.out.println("=== Enter Deposit amount ===");
                depositAmount = input.nextDouble();

                if (depositAmount >= 0) {
                    balance += depositAmount;
                    System.out.println("Deposit Succesful!");
                    System.out.println("New balance: " + balance);
                    System.out.println("\nThank you for using our ATM and God Bless You!");
                }else {
                    System.out.println("Invalid deposit amount.");
                }
                break;
            case 3:
                System.out.println("=== Withdrawal amount ===");
                withdrawAmount = input.nextDouble();

                if (withdrawAmount >= 0) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal Succesful!");
                    System.out.println("New balance: " + balance);
                    System.out.println("\nThank you for using our ATM and God Bless You!");
                }else {
                    System.out.println("Insufficient balance.");
                }
                break;
            case 4:
                System.out.println("Thank you for using ATM and God Bless You!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
        }
        input.close();
    }
}
