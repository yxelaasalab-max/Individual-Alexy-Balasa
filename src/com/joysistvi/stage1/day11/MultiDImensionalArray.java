package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class MultiDImensionalArray {

    public static void main(String[] args) {
        // [Section] Syntax on how to declare a multi-dimensional array
                        // object
        // datatype[][] arrayname = { {}, {}, {} };

        int [][] numbers = {
        //       0  1  2
                {1, 2, 3}, // 0
                {4, 5, 6}, // 1
                {7, 8, 9}, // 2
                {10, 11, 12} // 3
        };

        // [Section] Get the length

        //System.out.println(numbers.length);
        //System.out.println(numbers[0].length);
        // [Section] Invoke an element
        //                      [row][col]
        //System.out.println(numbers[0][1]);

        // [Section] Nested for Loop -> to traversing a multi-dimensional array

        for (int i = 0; i < numbers.length; i++) { // outer loop  (i -> rows)
            for (int j = 0; j < numbers[i].length; j++) { // inner loop ( j -> column)
                //                          0 0
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // newline
        }

        // [Section] Enhance Nested For Loop / For each Loop
//        for (int[] rows : numbers) { // {1, 2 ,3}
//            for (int column : rows) {
//                System.out.println(column);
//            }
//            System.out.println();
//        }

        // [Section] Syntax Multi-dimensional array with a specified size only
        // datatype[][] arrayobject = new datatype[rows][column]
        // Outer and Inner Planets
//        String[][] planets = new String[2][4];
//        planets[0][0] = "Mercury";
//        planets[0][1] = "Venus";
//        planets[0][2] = "Earth";
//        planets[0][3] = "Mars";
//
//        planets[1][0] = "Jupiter";
//        planets[1][1] = "Saturn";
//        planets[1][2] = "Uranus";
//        planets[1][3] = "Neptune";


        // [Section] Syntax Multi-dimensional array using Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        String[][] planets = new String[2][4];
//
//        for (int i = 0; i < planets.length; i++) {
//            for (int j = 0; j < planets[i].length; j++) {
//                System.out.print("Enter planets[" + i + "][" + j + "]; ");
//                planets[i][j] = scanner.nextLine();
//            }
//        }
//        // [Section] Enhanced Nested For Loop / For Each Loop
//        System.out.println("\nPrinting all the planets:");
//        for (String[] rows : planets) {
//            for (String column : rows) {
//                System.out.println(column);
//            }
//            System.out.println();
//        }
    }
}
