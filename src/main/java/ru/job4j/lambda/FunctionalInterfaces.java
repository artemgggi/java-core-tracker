package ru.job4j.lambda;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven");
        Supplier<Set<String>> sup = () -> new HashSet<>(list);
        BiConsumer<Integer, String> biCon = (i, s) -> System.out.println(i + s);
        Set<String> strings = sup.get();
        int i = 1;
        for (String s : strings) {
            biCon.accept(i++, " is " + s);
        }

        //BiPredicate<Integer, String> biPred = ;
        /*for (Integer i : map.keySet()) {

        }
        }
}*/
    }
}

