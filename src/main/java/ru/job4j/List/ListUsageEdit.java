package ru.job4j.List;

import java.util.ArrayList;
import java.util.List;

public class ListUsageEdit {
    public static void main(String[] args) {
        List<String> rsl = new ArrayList<>();
        rsl.add("one");
        rsl.add("two");
        rsl.add("three");
        // 1 E set(int index, E element) – заменяет элемент
        // позиция которого равна index на элемент
        // который мы передаем в метод (element).
        // При этом метод возвращает старое значение элемента с индексом index.
        rsl.set(1, "two and second");

        // 2 default void replaceAll(UnaryOperator<E> operator) –
        // заменяет каждый элемент в списке результатом
        // применения оператора (operator) к каждому элементу.
        rsl.replaceAll(String::toUpperCase);
    }
}
