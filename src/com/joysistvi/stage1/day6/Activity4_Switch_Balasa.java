package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_Switch_Balasa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Portal Menu ===");

        System.out.print("\nEnter Number between (1-4) : ");
        String Menu = sc.nextLine();

        switch (Menu) {
            case "1":
                System.out.println("You select option 1: View Grades");
                break;
            case "2":
                System.out.println("You select option 2: Enroll Subject");
                break;
            case "3":
                System.out.println("You select option 3: Pay Tuition");
                break;
            case "4":
                System.out.println("You select option 4: Exit");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
