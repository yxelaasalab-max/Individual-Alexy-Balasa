package com.joysistvi.stage1.day13;

public class Main {
    // Create an object -> Instantiation
    // Classname object = new Constructor();

    // Scanner, String, Math

    public static void main(String[] args) {
        // asus
        Laptop laptop = new Laptop();

        laptop.brand = "Asus";
        laptop.color = "Black";
        laptop.ramInGb = 32;
        laptop.weightInKg = 3.2;
        laptop.cpu = "Ryzen 9 9950x3d2";

        laptop.playGames();
        laptop.sendEmail();
        laptop.writeCodes();
        laptop.watchTutorial();

        Laptop laptop2 = new Laptop();
        laptop.brand = "MSI";
        laptop.color = "Black";
        laptop.ramInGb = 32;
        laptop.weightInKg = 1.6;
        laptop.cpu = "Ryzen 9950x3d";

        laptop.playGames();
        laptop.sendEmail();
        laptop.writeCodes();

        Laptop laptop3 = new Laptop();
        laptop.brand = "Gigabyte";
        laptop.color = "Black";
        laptop.ramInGb = 32;
        laptop.weightInKg = 2.4;
        laptop.cpu = "Ryzen 7 9800x3d";

        laptop.playGames();
        laptop.sendEmail();
    }
}
