package com.joysistvi.stage1.day13;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter Second number: ");
        int secondNum = sc.nextInt();

        System.out.println(sum(firstNum, secondNum));
    }

    // parameters and arguments
    public static int sum(int a, int b) {

        return a +b;
    }
}
