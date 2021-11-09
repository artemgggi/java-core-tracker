package ru.job4j.excepts;

public class Refactortask {
    public static String get(String[] data, int index) throws IllegalArgumentException {
        if (index <= 0 && index < data.length) {
            throw new IllegalArgumentException("index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Refactortask.get(data, 0);
        System.out.println(rsl);
    }
}
