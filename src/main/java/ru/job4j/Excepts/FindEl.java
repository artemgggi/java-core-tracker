package ru.job4j.Excepts;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (Objects.equals(value[i], key)) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"one", "two", "three"};
        try {
            System.out.println(indexOf(array, "five"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
