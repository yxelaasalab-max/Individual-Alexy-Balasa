package com.joysistvi.stage2.discussion.day23;

public class ProceduralProgramming {

    // Procedural Programming Approach
    /*
        This programming style relies on procedures or routines(methods/function)to operate on
        data, where data and behavior are handled separately.
     */

    // Example: We want to create a variable(s) that will describe a pet.
    // name, ageInMonths, classification, gender, sounds, breed

    static String petName = "Kapitan";
    static int petAgeInMonths = 10;
    static String petClassification = "Dog";
    static String petGender = "Male";
    static String petSound = "Bark bark";
    static String petBreed = "Husky";

    public static void describePet() {
        System.out.println(petName + " is a " + petGender + petClassification + " who is " + petAgeInMonths + " months and breed is " + petBreed);
    }

    public static void makeSound() {
        System.out.println(petName + " says " + petSound + "!");
    }

    public static void main(String[] args) {
        //makeSound();
        //describePet();
        printName();
        Pet pet = new Pet("Kapitan", 10, "Husky");
    }

    // Limitation of procedural Approach:
    /*
        The entity is not represented at a single unit, but rather a collection of separated variable (eg. multiples per pet)
        No data protection. Any part of the programming can be modified or change the variables directly

     */

    // To address this issues, we can use encapsulation which allows us to bundles the data and methods that operates on the data which a single unit (class) and restrict access to some of the object's component.

    public static void printName() {
        petName = "Petmalu";
        System.out.println(petName);
    }

    // Employee

    // Payment
}
