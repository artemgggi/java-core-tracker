package ru.job4j.List.DinamicListTask;

import ru.job4j.oop.objects.Array;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements List<T> {

    private T[] container;

    private int size;

    private int modCount;

    public SimpleArrayList(int capacity) {
        this.container = (T[]) new Object[capacity];
    }

    @Override
    public void add(T value) {
        if (size == modCount) {
            container = Arrays.copyOf(container, container.length * 2);
        }
        container[size] = value;
        size++;
    }

    @Override
    public T set(int index, T newValue) {
        return null;
    }

    @Override
    public T remove(int index) {
        System.arraycopy(container,
                        index + 1,
                        container,
                        index,
                        container.length - index - 1);
        container[container.length - 1] = null;
        return container;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return null;
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
