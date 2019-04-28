package com.callmegerbs;

public class GettersAndSetters {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Workshire", 12);

        System.out.println(person.getFname() + "-- first fname");
        person.setFname("David");
        System.out.println(person.getFname() + "-- second fname");

        System.out.println();

        System.out.println(person.getAge() + "-- first age");
        person.setAge(35);
        System.out.println(person.getAge() + "-- 2nd age");

        System.out.println();

        System.out.println(person);
    }
}
