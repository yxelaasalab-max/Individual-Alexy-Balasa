package com.joysistvi.stage2.discussion.day24;

import java.util.ArrayList; // import ArrayList from utility packages
import java.util.List;
import java.util.Scanner;

public class ArrayListClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Create an object of an ArrayList
        List<String> cars = new ArrayList<>();

        // CRUD Operation

        // Create / Add items
        cars.add("Lamborghini"); // index 0
        cars.add("Pickup"); // index 2
        cars.add("BMW"); // index 4
        cars.add(1, "Isuzu"); // index 1
        cars.add(3, "SUV"); // index 3
        cars.add("Click"); // index 5

        // Read / Read item(s)
        //cars.get(4);

        //System.out.println(cars.get(4));

        // Update / set item
        //cars.set(4, "E-Bike");
        //System.out.println(cars);
        //cars.set(0, "Dodge ram trx srt");
        //System.out.println(cars);

        // Delete / remove an item
        //cars.remove("E-Bike"); // object
        //System.out.println(cars);
        //cars.remove(1); // index
        //System.out.println(cars);

        // Remove all item in the list
        // cars. removeAll(cars);
        //cars.clear();

        // Getting the size
        //System.out.println(cars.get(cars.size() -1));
        //System.out.println(cars.remove(cars.size()));
        //System.out.println(cars);

        // Loop
        System.out.println("\nTraversing an ArrayList using for-loop: ");
        for (int i = 0; i < cars.size(); i++) {
            if ("Pickup".equals(cars.get(i))) {
                break;
            }
            System.out.println(cars.get(i));
        }

        System.out.println("\nTraversing an ArrayList using for-loop: ");
        for (String car : cars) {
            System.out.println(car);
        }



        //cars.forEach(System.out::println);
    }
}
