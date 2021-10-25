package ru.job4j.oop.polymorfism.example.withInterface;

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();

        Animal[] animals = new Animal[]{cow, goose};
        for (Animal a : animals) {
            a.sound();
        }
    }
}
