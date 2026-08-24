package com.joysistvi.stage1.day5;

public class Activity3_Balasa {

    public static void main(String[] args) {

        //Using the logical AND operator (&&), determine if the person is allowed to enter an event.
        //Create a Java program that uses the following variables:

        int age = 27;
        boolean hasValid = true;

        System.out.println("--- Task 2: Event Entry Check ---");
        String allowed = age >= 18 && hasValid ? "Yes" : "No";
        System.out.println("Allowed to enter the event: " + allowed);

        // Allowed to enter the event : Yes / No

        //Using the logical OR operator (||), determine if there are no classes today.
        //Create a Java program that uses the following variables:

        boolean isWeekend = true;
        boolean isHoliday = false;

        System.out.println("\n--- Task 3: Class status Check ---");
        String classes = isWeekend || isHoliday ? "Yes," : "No,";
        System.out.println("Are there no classes to day? " + classes + " no classes. ");

        //Use the ternary operator (? :) to determine if the student passed or failed.
        //Create a Java program that uses the following variable:

        int score = 75;

        System.out.println("\n--- Task 4: Pass or Failed Check ---");
        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Score: " + score);
        System.out.printf("Result: " + result);

        //Use the ternary operator (? :) to determine the larger number.
        //Create a Java program that uses the following variables:

        int num = 75;
        int num2 = 80;
        int larger = (num >= num2) ? num : num2;

        System.out.println("\n--- Task 5: Larger Number Check ---");
        System.out.println("Number 1: " + num + " " + "Number 2: " + num2);
        System.out.println("The Larger number is: " + larger);
    }
}
