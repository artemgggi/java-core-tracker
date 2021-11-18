package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LazyLoad {
    public static void main(String[] args) {
//        Лямбда вычисляется, когда вызывается метод у функционального интерфейса.
//        В нашем примере это метод compare.
//        Он не был вызван, так как массив содержит одно значение.
//        Сортировать тут не нужно.
        String[] names = {
                "Ivan",
                "Michail"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);
    }
}
