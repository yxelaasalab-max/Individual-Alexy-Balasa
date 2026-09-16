package com.joysistvi.stage2.discussion.day23;

public class VIew {

    // Declare enum inside a class

    // pwedeng ipasok sa loob ng class
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Access an element from an enum
        //System.out.println(Level.HIGH);
        //System.out.println(Day.MONDAY);

        // Enum in Conditional Operations
        Day day = Day.WEDNESDAY;

        switch (day) {
            case MONDAY:
                System.out.println(Day.MONDAY);
                break;
            case TUESDAY:
                System.out.println(Day.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println(Day.WEDNESDAY);
                break;
            case THURSDAY:
                System.out.println(Day.THURSDAY);
                break;
            case FRIDAY:
                System.out.println(Day.FRIDAY);
                break;
            case SATURDAY:
                System.out.println(Day.SATURDAY);
                break;
            case SUNDAY:
                System.out.println(Day.SUNDAY);
            default:
                System.out.println("Invalid Day");
        }

        //  (Day.MONDAY == Day.MONDAY)
        if (Day.MONDAY.equals(Day.MONDAY)) {
            System.out.println("First Day of the Week");
        }

        // Loop thru an enum
        System.out.println("\nPrinting all the days");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
