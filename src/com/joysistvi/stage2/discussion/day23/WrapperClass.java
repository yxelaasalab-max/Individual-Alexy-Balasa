package com.joysistvi.stage2.discussion.day23;

import java.util.ArrayList;

public class WrapperClass {

    // Collections
    ArrayList<Integer> numbers = new ArrayList<>();

    // Create Wrapper Objects
    int number = 19;
    Integer number2 = 19;

    // Autoboxing -> Java automatically coverts primitive to wrapper object
    Integer wrappedNumber = number;
    // Int -> Integer

    // Unboxing -> wrapper object -> primitive
    Integer num = 19;

    int unwrappedNum = num;
    // Integer -> Int

    public static void main(String[] args) {
        String age = "25";

        int number = Integer.parseInt(age); // parsing: String -> Integer
        System.out.println(number);

//        Double.parseDouble();
//        Boolean.parseBoolean();
//        Float.parseFloat();

        //Integer.toString();

        String word = "";

        Integer num = null;

        if (num == null) {
            // NullPointerException
        }
    }
}
