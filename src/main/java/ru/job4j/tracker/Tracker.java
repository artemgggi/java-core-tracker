package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item != null) {
                if (item.getName().equals(key)) {
                    itemsByName[size] = item;
                    size++;
                }
            }
        }
        return Arrays.copyOf(itemsByName, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) > -1) {
            items[indexOf(id)].setName(item.getName());
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(int id) {
        Item[] whenDeleteItem = new Item[items.length];
        int index = indexOf(id);
        int startPos = index + 1;
        int distPos = index;
        int length = size - index - 1;
        if (index > -1) {
            System.arraycopy(items, startPos, whenDeleteItem, distPos, length);
            items[size - 1] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }
}