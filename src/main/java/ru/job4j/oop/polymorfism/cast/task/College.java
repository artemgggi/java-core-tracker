package ru.job4j.oop.polymorfism.cast.task;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student studfreshmen = freshman;
        Object objfreshman = freshman;
        /* привидение типа при создании объекта*/
        Object objectfreshman = new Freshman();
        System.out.println(new Freshman());
        System.out.println(new Student());
        System.out.println(new Object());
    }
}
