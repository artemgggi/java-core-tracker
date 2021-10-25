package ru.job4j.oop.polymorfism.example.withInterface;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + "прозносит звук: МУ-му");
    }
}
