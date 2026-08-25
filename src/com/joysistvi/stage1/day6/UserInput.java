package com.joysistvi.stage1.day6;

import java.sql.SQLOutput;
import java.util.Scanner; // import Scanenr Class from java.util package

public class UserInput {

    public static void main(String[] args) {
        //Create an object  of Scanner / Instantiation
        // [Syntax] Classname object = new Constructor  (Argument);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
    }
}
