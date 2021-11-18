package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(-1);
    list.add(2);
    list.add(5);
    List<Integer> result = list.stream().filter(
            el -> el > 0).collect(Collectors.toList());
    result.forEach(System.out::println);
    }
}
