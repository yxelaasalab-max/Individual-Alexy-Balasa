package com.joysistvi.stage1.day3;

public class VariableThursday {

    public static void main(String[] args) { // main method
        // initialization
        String timba = "tubig";
        int age = 27;
        System.out.println("Age: " + age);

        String address = "Blk 34B lot 46 phs 2 area 2 Maliputo Street NBBS Dagat-dagatan Navotas City";

        // Multiple variables with similar datatypes
        String codename = "Ku", codename2 = "ri", codename3 = "maw";

        System.out.println(codename + codename2 + codename3);

        // declaration
        float temp;

        // assign value
        temp = 30f;

        System.out.println("Temperature: " + temp);

        // Concatination (+) -> joining strings

        System.out.println(address);

        // [Section] Mini-Activity
        // Print your fullnames
        // Use firstName, middleName, and lastName variable
        // Use String data type
        // Expected output: Balasa, Alexy O.

        String firstName = "Alexy";
        String middleName = "O.";
        String lastName = "Balasa,";

        System.out.println("\nFullname: " + lastName + " " + firstName + " " + middleName + " ");
    }
}
