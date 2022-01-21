package ru.job4j.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListUsageRead {
    public static void main(String[] args) {
        List<String> rsl = new ArrayList<>();
        rsl.add("one");
        rsl.add("two");
        rsl.add("three");
        // 1 E get(int index) – метод возвращает элемент,
        // который находится в позиции index в этом списке.
        // Метод может кинуть исключение класса IndexOutOfBoundsException,
        // если будет выполнено условие index < 0 || index > size()
        for (int i = 0; i < rsl.size(); i++) {
            System.out.println("Текущий элемент: " + rsl.get(i));
        }
        // 2 Iterator<E> iterator() – метод возвращает объект Iterator,
        // который содержит в себе все элементы исходной коллекции.
        Iterator<String> iterator = rsl.iterator();
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }
        // ListIterator<E> listIterator() – возвращает итератор списка
        // для элементов в этом списке.
        ListIterator<String> secondIterator = rsl.listIterator();
        while (secondIterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }
        // ListIterator<E> listIterator(int index) – возвращает итератор списка
        // для элементов в этом списке, начиная с элемента индекс которого равен index.
        ListIterator<String> thirdIterator = rsl.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }
    }
}
