package com.joysistvi.stage1.day14;

public class Scope {

    // 3
    public static void main(String[] args) {
        System.out.println(name);
        printName();

        Scope scope = new Scope();
        System.out.println(scope.age);
        scope.printAge();

        int x = 10; // local variable

        // loops, switch, trycatch
        if (true) {
            double balance = 100.0; // block scope variable
            System.out.println(balance);
            System.out.println(x);
        }
    }

    // 1
    static String name  = "KweeKwee"; // static variable

    public static void printName() { // static method
        System.out.println(name);
    }

    // 2
    int age = 27; // instance variable

    public void printAge() { // instance method
        System.out.println(age);
    }

}

/*      A        B       Result
    static to static     direct
    static to instance   direct
    instance to static   instantiate
    instance to instance instantiate
 */