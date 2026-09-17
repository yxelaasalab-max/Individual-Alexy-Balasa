package com.joysistvi.stage2.activity.day24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity16_TodoManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();

        int choice = -1;

        while (choice != 0) {

            System.out.println("\n=== TODO MANAGER ===");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");


            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You select option 1: Task has been Added");
                    break;
                case 2:
                    System.out.println("You select option 2: display all tasks.");
                    break;
                case 3:
                    System.out.println("You select option 3: ask for the index and update the task.");
                    break;
                case 4:
                    System.out.println("You select option 4: ask for the index or name and remove the task.");
                    break;
                case 5:
                    System.out.println("You select option 5: clear the list.");
                    break;
                case 0:
                    System.out.println("You select option 0: Exit the Program Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}