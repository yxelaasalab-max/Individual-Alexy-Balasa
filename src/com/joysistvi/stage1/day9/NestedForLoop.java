package com.joysistvi.stage1.day9;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }
        }
        System.out.println(" ");
    }
}
// Whenever an outer loop executes, inner loop executes completely.

/*
for (int i = 1; i <= 3; i++) { // outer for loop
            System.out.println(i);

            for (int j = 1; j <= 3; j++) { // inner for loop
                System.out.println("\t" + j);
            }
        }
        +++++++++++++++++++++++++++++++++++++++++++++++++++++

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }

        +++++++++++++++++++++++++++++++++++++++++++++++++++++

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
 */