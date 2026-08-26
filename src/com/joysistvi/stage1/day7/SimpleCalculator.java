package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Initillized scanner object
        Scanner input = new Scanner(System.in);

        // Set the first number from user
        System.out.print("Enter first number: ");
        double firstNum = input.nextDouble();
        input.nextLine(); // consume buffer

        // Get the operator symbol from the user
        System.out.println("Enter operator (+, -, *, /): ");
        char operator = input.nextLine().charAt(0);

        // Set the second number from user
        System.out.println("Enter second number: ");
        double secondNum = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                System.out.println("Result: " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Result: " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println("Result: " + (firstNum * secondNum));
                break;
            case '/':
                // Need validation to avoid dividing by zero
                if (secondNum == 0) {
                    System.out.println("Error: Division by Zero is not allowed.");
                } else {
                    System.out.println("Result: " + (firstNum / secondNum));

                }
                break;
            default:
                // Runs of operator enter is not valid
                System.out.println("Invalid Operator");
        }

        input.close(); // close the scanner
    }
}
