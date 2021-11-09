package ru.job4j.excepts;

import java.util.Arrays;

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int i = 1; i <= middle; i++) {
            String temp = names[i];
            names[i] = names[names.length - i];
            names[names.length - i] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
