package ru.job4j.excepts;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLower0() {
        int rsl = Fact.calc(-1);
    }
}