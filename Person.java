package com.callmegerbs;

public class Person {
    int age;
    String fname;
    String lname;

    {
        age = 0;
        fname = "Unknown";
        lname = "Unknown";
    }

    Person() {
        age = age;
        fname = fname;
        lname = lname;
    }

    Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    // get methods
    public String getFname() {

        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public int getAge() {

        return this.age;
    }

    // set methods
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {

        this.lname = lname;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String toString() {
        return "Person " + fname + " " + lname + " is " + age + " years old.";
    }
}
