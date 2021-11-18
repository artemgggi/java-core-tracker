package ru.job4j.lambda.phoneBookTask;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> findName = (s) -> Objects.equals(key, s.getName());
        Predicate<Person> findSurname = (s) -> Objects.equals(key, s.getSurname());
        Predicate<Person> findPhone = (s) -> Objects.equals(key, s.getPhone());
        Predicate<Person> findAddress = (s) -> Objects.equals(key, s.getAddress());
        Predicate<Person> combine = findName.or(findSurname).or(findPhone).or(findAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
