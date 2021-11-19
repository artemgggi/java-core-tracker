package ru.job4j.streamAPI;

import java.util.function.Predicate;
import java.util.List;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students;
    }
}
