package ru.job4j.oop.polymorfism.example.withInterface;

public class Goose implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + "Произносит звук: Га-га");
    }
}
