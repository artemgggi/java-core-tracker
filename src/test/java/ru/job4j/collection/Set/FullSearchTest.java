package ru.job4j.collection.Set;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}