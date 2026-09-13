package com.joysistvi.stage2.day19;

public class Student {

    // private data members / private fields
    private int id;
    private String name;
    private int age;
    private String course;
    private String section;
    private String address;


    // default constructor
//    public Student() {
//
//    }

    // parameterized constructor
    public Student(int id, String name, int age, String course, String section, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.section = section;
        this.address = address;
    }

    // alt + insert or right click generate
    // data validation


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
// getter method / accessor method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getSection() {
        return section;
    }

    public String getAddress() {
        return address;
    }



    // setter method / mutator method

    // id
    // this keyword is used to refer immediately to the current object of a class
    public void setId(int id) {
        this.id = id; // assignment to itself
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setAddress(String address) {
        this.address = address;
    }

 */
