package com.joysistvi.stage2.day17;

import java.util.Random;
import java.util.Scanner;

public class Activity12_Balasa {
    // 1. Identify if a number is odd or even
    public static String checkOddOrEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    // 2. Print your name 50 times
    public static void printNameFiftyTimes(String name) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + name);
        }
    }

    // 3. Get the square root of a certain variable
    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // 4. Get the power of a number using base and exponent
    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 5. Print a random number between 1 and 100
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generates 1 to 100
    }

    // 6. Get the area of a circle using the given radius
    public static double getAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // 7. Identify if a person is a voter or not
    public static String checkVoterEligibility(int age) {
        return (age >= 18) ? "Eligible Voter" : "Not an Eligible Voter";
    }

    // 8. Get the length of a certain word
    public static int getWordLength(String word) {
        return word.length();
    }

    // 9. Print a certain word in reverse order
    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    // 10. Print your full name and age
    public static void printNameAndAge(String fullName, int age) {
        System.out.println("Full Name: " + fullName + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Quick Demonstration
        System.out.println("1. 7 is: " + checkOddOrEven(7));
        System.out.println("3. Square root of 16: " + getSquareRoot(16));
        System.out.println("4. 2 raised to 3: " + getPower(2, 3));
        System.out.println("5. Random number (1-100): " + getRandomNumber());
        System.out.println("6. Area of circle (radius 5): " + getAreaOfCircle(5));
        System.out.println("7. Age 20: " + checkVoterEligibility(27));
        System.out.println("8. Length of 'Hello': " + getWordLength("Hello"));
        System.out.println("9. Reverse of 'Java': " + reverseWord("Java"));

        System.out.println("\n10. Person Info:");
        printNameAndAge("Alexy Balasa", 27);

        System.out.println("\n2. Printing Name 50 Times:");
        printNameFiftyTimes("Alexy Balasa");
    }
}
