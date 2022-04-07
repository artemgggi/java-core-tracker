package ru.job4j.kiss;

import ru.job4j.tracker.Item;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public Item max(List<Item> value, Comparator<Item> comparator) {
        Item temp = null;
        for(Item item : value) {
            if(temp == null || comparator.compare(temp, item) < 0)
                temp = item;
        }
        return temp;
    }

    public Item min(List<Item> value, Comparator<Item> comparator) {
        Item temp = null;
        for(Item item : value) {
            if(temp == null || comparator.compare(temp, item) > 0)
                temp = item;
        }
        return temp;
    }
}
