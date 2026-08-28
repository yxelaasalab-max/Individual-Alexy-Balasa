package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_Part1_Balasa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" === Multiplication Tables ===");
        int number = scanner.nextInt();

        System.out.println("Multiplcation table of: " + number);
        for (int i = number; i <= number; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " x " + j + " = " + product);

            }
        }
        System.out.println(" ");
    }
}
