package ru.job4j.List;

import java.util.ArrayList;
import java.util.List;

public class ListUsageCreate {
    public static void main(String[] args) {
        // 1.Добавление элементов
        // 1.1 boolean add(E e) - добавляет элемент в конец списка
        List<String> rsl = new ArrayList<>();
        rsl.add("one");
        rsl.add("two");
        rsl.add("three");

        // 1.2 void add(int index, E element) - добавляет указанный элемент (element)
        // в указанную позицию(index) в списке.
        // При этом сдвигает элемент, который находится в этой позиции(если есть),
        // и все последующие элементы вправо.
        rsl.add(1, "four");

        // 1.3 boolean addAll(Collection<? extends E> c) – добавляет все элементы из
        // переданной коллекции
        // в конец списка в том порядке,
        // в котором они возвращаются итератором переданной коллекции.
        List<String> list = new ArrayList<>();
        list.add("four");
        list.add("five");
        rsl.addAll(list);

        // 1.4 boolean addAll(int index, Collection<? extends E> c) –
        // добавляет все элементы из коллекции в список в указанную позицию(index).
        // При этом сдвигает элемент, который находится в этой позиции,
        // и все последующие элементы вправо.
        // Добавляемые элементы будут расставлены в том порядке,
        // в котором они возвращены итератором переданной коллекции.
        List<String> secondList = new ArrayList<>();
        secondList.add("four");
        secondList.add("five");
        rsl.addAll(2, list);

        // 1.5 List<E> of(E ... elements) - метод возвращает список,
        // в которые помещены список элементов elements типа E.
        // Метод возвращает неизменяемый список
        List<String> thirdList = List.of("one", "two", "three");
    }
}
