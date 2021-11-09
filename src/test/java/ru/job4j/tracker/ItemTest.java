package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenSortedByNameItem() {
        List<Item> items = Arrays.asList(
                new Item("Fix bugs"),
                new Item("Impl task"),
                new Item("Reboot server")
        );

        List<Item> sortedItems = Arrays.asList(
                new Item("Fix bugs"),
                new Item("Impl task"),
                new Item("Reboot server")
        );
        items.sort(new SortByNameItem());
        assertThat(items, is(sortedItems));
    }
}