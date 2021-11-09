package ru.job4j.tracker;

import java.util.Comparator;

public class SortByNameItem implements Comparator<Item> {
    @Override
    public int compare(Item fist, Item second) {
        return fist.getName().compareTo(second.getName());
    }
}
