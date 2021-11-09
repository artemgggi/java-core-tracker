package ru.job4j.sorting.numSort;

import org.junit.Test;

import java.util.Arrays;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NumSortTest {

    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new NumSort());
        assertThat(input, is(out));
    }
}