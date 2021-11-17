package ru.job4j.lambda;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, i) -> map.put(s, i);
        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven");
        int i = 1;
        for (String s : list) {
            biCon.accept(i++, s);
        }
        System.out.println(map);

        Predicate<Integer> biPredicate = (index) -> index % 2 == 0;
        for (Integer index : map.keySet()) {
            if (biPredicate.test(index) || map.get(index).length() == 4) {
                System.out.println("key: " + index + " value: " + map.get(index));
            }
        }

        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        List<String> strings = supplier.get();
        System.out.println(strings);

        Consumer<String> con = System.out::println;
        Function<String, String> func = String::toUpperCase;
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}

