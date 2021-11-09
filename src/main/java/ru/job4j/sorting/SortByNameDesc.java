package ru.job4j.sorting;

import java.util.Comparator;

public class SortByNameDesc implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return second.getName().compareTo(first.getName());
    }
}
