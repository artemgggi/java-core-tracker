package ru.job4j.collection.ArrayList;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");
        for (Object value : arrayList) {
            System.out.println(value);
        }
    }
}
