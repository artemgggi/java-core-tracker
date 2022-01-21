package ru.job4j.List;

import java.util.ArrayList;
import java.util.List;

public class ListUsageDelete {
    public static void main(String[] args) {
        // 1 E remove(int index) - удаляет элемент из списка
        // по индексу index, при этом метод возвращает удаленный элемент
        List<String> rsl = new ArrayList<>();
        rsl.add("one");
        rsl.add("two");
        rsl.add("three");
        rsl.remove(1);
        for (String s : rsl) {
            System.out.println(s);
        }

        // 2  boolean remove(E e) –
        // удаляет элемент е типа E из коллекции
        // при его ПЕРВОМ вхождении в список, если он есть в коллекции.
        rsl.remove("three");

        // 3 boolean removeAll(Collection<?> col) – метод удаляет из списка
        // все элементы, которые содержатся в коллекции col,
        // если в результате работы метода исходный список изменился - метод возвращает true.
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("three");
        rsl.removeAll(list);

        // 4 boolean retainAll(Collection<?> col) – метод также удаляет элементы из списка,
        // за исключением тех, которые находятся в коллекции col,
        // если в результате работы метода исходный список изменился - метод возвращает true.
        List<String> secondList = new ArrayList<>();
        secondList.add("one");
        secondList.add("three");
        rsl.retainAll(secondList);

        // 5 default boolean removeIf(Predicate<? super E> filter) –
        // метод удаляет все элементы из коллекции, которые удовлетворяют условию
        // определенному в предикате filter(передается в виде лямбда выражения).
        // Если в результате работы метода список изменился - метод возвращает true.
        rsl.removeIf(s -> s.length() <= 3);
    }
}
