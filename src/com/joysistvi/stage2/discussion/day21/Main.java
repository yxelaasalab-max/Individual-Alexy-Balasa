package com.joysistvi.stage2.discussion.day21;

import com.joysistvi.stage2.discussion.day21.Student;

public class Main {
    public static void main(String[] args) {
        //Student stud = new Student(1,"Alec",27,"BSMT","Diamond","Navotas City");

        //Student stud2 = new Student(2, "Alec", 27, "BSMT", "Mavotas City");

        //Student stud3 = new Student(3, "Alec", 27, "BSMT");

        Student[] students = new Student[3];
        students[0] = new Student(1,"Alec",27,"BSMT","Diamond","Navotas City");
        students[1] = new Student(2, "Alec", 27, "BSMT", "Mavotas City");
        students[2] = new Student(3, "Alec", 27, "BSMT");


        for (Student student: students) {
            System.out.println(student);
        }
    }
}
