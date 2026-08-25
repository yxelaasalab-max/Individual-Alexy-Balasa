package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_If_Balasa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" === Enter Menu ===");

        System.out.print("\nEnter number between (1-4) : ");
        String choice = sc.nextLine();

        int option = 4;

        if (option == 1) {
            System.out.print("You select Option 1: Start Game");
        } else if (option == 2) {
            System.out.print("You select Option 2: Load Game");
        } else if (option == 3) {
            System.out.print("You select Option 3: Setting");
        } else if (option == 4) {
            System.out.print("You select Option 4: Exit");
        } else {
            System.out.print("Invalid choice. Please try again.");
        }
    }
}
