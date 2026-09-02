package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Balasa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int students = input.nextInt();

        System.out.println("Enter number of subjects: ");
        int subjects = input.nextInt();
        input.nextLine();

        String[] subjectNames = new String[subjects];
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];

        System.out.println("\nEnter subject names:");
        for (int i = 0; i < subjects; i++) {
            System.out.println("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter student's name: ");
            studentNames[i] = input.nextLine();

            for (int j = 0; j < subjects; j++) {
                System.out.println("Enter grade for " + subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();
            }

            input.nextLine();
        }

        System.out.println("\n==================== GRADES REPORT ====================");

        System.out.println("Student Name");

        for (String subject : subjectNames) {
            System.out.println("Subject: " + subject);
        }

        System.out.println("Average");

        for (int i = 0; i < 20 + (subjects * 15) + 15; i++) {
            System.out.println("-");
        }
        System.out.println();

        for (int i = 0; i < students; i++) {
            double total = 0;

            System.out.println("Student Names: " + studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.println("Grades: " + grades[i][j]);
                total += grades[i][j];
            }

            double average = total / subjects;

            System.out.println("Average: " + average);
        }
        System.out.println("========================================================");

        input.close();

    }
}
