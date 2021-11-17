package ru.job4j.lambda.functionalInterfaces;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionalInterfacesUsage {
    public static void main(String[] args) {
        /*
        Supplier - поставщик
        Используется для создания какого-либо объекта
        и при этом ему не требуется входной параметр

        @FunctionalInterface
        public interface Supplier<T> {
            T get();
        }

        */
        Supplier<String> sup = () -> "string test for interface";
        System.out.println(sup.get());

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supl = () -> new HashSet<>(list);
        Set<String> strings = supl.get();
        for (String s : strings) {
            System.out.println(s);
        }
        /*
        Consumer - потребитель
        Используется в том случае, если нам нужно применить какое-то действие
        или операцию к параметру (для BiConsumer два параметра)
        и при этом у метода нет возвращаемого значения

        @FunctionalInterface
        public interface Consumer<T> {
            void accept(T t);
        }
        @FunctionalInterface
        public interface BiConsumer<T, U> {
            void accept(T t, U u);
        }
        */
        Supplier<String> supe = () -> "New String For Interface";
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(sup.get());

        BiConsumer<String, String> consumers = (ss, s2) -> System.out.println(ss + s2);
        consumers.accept(supe.get(), " and Second String");

        List<String> lists = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supee = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumerr = (sss, s3) -> System.out.println(sss + s3);
        Set<String> stringss = supee.get();
        int i = 1;
        for (String s : stringss) {
            consumerr.accept(i++, " is " + s);
        }

         /*
        Predicate (BiPredicate) - утверждение
        Наиболее часто применяется в фильтрах
        и сравнении и объявляются они следующим образом:

        @FunctionalInterface
        public interface Predicate<T> {
            boolean test(T t);
        }
        @FunctionalInterface
        public interface BiPredicate<T, U> {
            boolean test(T t, U u);
        }
        */
        Predicate<String> pred = s4 -> s4.isEmpty();
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));

        BiPredicate<String, Integer> cond = (s5, i1) -> s5.contains(i1.toString());
        System.out.println("Строка содержит подстроку: " + cond.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + cond.test("Name", 123));
    }
}

