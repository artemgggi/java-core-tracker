package ru.job4j;

public class Person extends Object {

    void walk() {
        System.out.println("walk");
    }
}

class Employee extends Person {

    @Override
    void walk() {
        System.out.println("running to work fast");
    }

    public static void main(String[] args) {
        Person person = new Employee();
        person.walk();
    }
}
