package ru.job4j.List.DinamicListTask;

import java.util.Iterator;

public class SimpleArrayList<T> implements List<T> {

    private final int INIT_SIZE = 16;

    private final int CUT_RATE = 4;

    private T[] container;

    private int size;

    private int pointer = 0;

    public SimpleArrayList(int capacity) {
        this.container = (T[]) new Object[capacity];
    }

    @Override
    public void add(T value) {
        if (pointer == container.length - 1) {
            resize(container.length * 2);
        }
        container[pointer++] = value;
    }

    @Override
    public T set(int index, T newValue) {
        return null;
    }

    @Override
    public T[] remove(int index) {
        for (int i = index; i < pointer; i++) {
            container[i] = container[i + 1];
        container[pointer] = null;
        pointer--;
        if (container.length > INIT_SIZE
                && pointer < container.length / CUT_RATE)
            resize(container.length / 2);
        }
        return container;
    }

    @Override
    public T get(int index) {
        return (T) container[index];
    }

    @Override
    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(container, 0, newArray, 0, pointer);
        container = (T[]) newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }
}
