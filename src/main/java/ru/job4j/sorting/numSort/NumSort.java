package ru.job4j.sorting.numSort;

import java.util.Comparator;

public class NumSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        return left.compareTo(right);
    }
}
