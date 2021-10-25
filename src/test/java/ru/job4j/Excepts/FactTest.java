package ru.job4j.Excepts;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLower0() {
        int rsl = Fact.calc(-1);
    }
}