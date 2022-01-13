package ru.job4j;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        var list = new ArrayList<String>(2);
        list.ensureCapacity(10);
        list.add("..");
        list.add("...");
        list.add(",,,,,");
        list.set(1, ".");
        list.trimToSize();
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());
    }
}
