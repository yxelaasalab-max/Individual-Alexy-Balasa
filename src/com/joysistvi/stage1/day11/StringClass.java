package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {
        // toUpperCase ()
        // toLowerCase ()
        // charAt()
        // length()
        // equals()
        // equalsIgnoreCase ()
        // concat ()

        String word = "Java";

//        System.out.println(word.length());

        System.out.println("Hello " + word);

        // method chaining
        // nextLine().charAt()

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure you really want to exit: ");
        System.out.print(" Y to confirm: ");
        char gender = sc.nextLine().charAt(0);

        if (gender == 'Y') {
            System.out.println("Existing...");
            System.exit(0); // Exit the whole application
        }



    }
}
