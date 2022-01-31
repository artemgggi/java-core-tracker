package ru.job4j.List.DinamicListTask;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArrayList<T> implements List<T> {

    private transient Object[] elementData;

    private final int INIT_SIZE = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    private T[] container;

    private int size;

    private int modCount = 0;

    public SimpleArrayList(int capacity) {
        this.container = new Object[INIT_SIZE];
    }

    @Override
    public void add(int index, T value) {
        modCount++;
        final int s;
        Object[] elementData;
        if ((s = size) == elementData = this.elementData) {
            resize(container.length * 2);
        }
        container[pointer++] = value;
        return container[size];
    }

    @Override
    public T set(int index, T newValue) {
        return container[index] = newValue;
    }

    @Override
    public T[] remove(int index) throws IndexOutOfBoundsException {

        for (int i = index; i < pointer; i++) {
            container[i] = container[i + 1];
            container[pointer] = null;
            pointer--;
            if (container.length > INIT_SIZE
                    && pointer < container.length / CUT_RATE) {
                resize(container.length / 2);
            }
        }
        return container;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
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
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size
                        && container[currentIndex] != null;
            }

            @Override
            public T next() throws NoSuchElementException {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return container[currentIndex++];
            }
        };
        return it;
    }
}
