package ru.job4j.List.DinamicListTask;

public interface List<T> extends Iterable {

    void add(int index, T value);

    T set(int index, T newValue);

    T remove(int index);

    T get(int index);

    int size();
}
