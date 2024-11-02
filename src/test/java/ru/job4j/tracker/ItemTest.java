package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    void whenItemSortAscByName() {
        List<Item> items = Arrays.asList(new Item("Fixing"),
                new Item("Bugging"),
                new Item("ZZZ"),
                new Item("AAA"));

        Collections.sort(items, new ItemAscByName());

        List<Item> expected = Arrays.asList(new Item("AAA"),
                new Item("Bugging"),
                new Item("Fixing"),
                new Item("ZZZ"));

        assertEquals(expected, items);
    }

    @Test
    void whenItemSortDescByName() {
        List<Item> items = Arrays.asList(new Item("Fixing"),
                new Item("Bugging"),
                new Item("ZZZ"),
                new Item("AAA"));

        Collections.sort(items, new ItemDescByName());

        List<Item> expected = Arrays.asList(new Item("ZZZ"),
                new Item("Fixing"),
                new Item("Bugging"),
                new Item("AAA"));

        assertEquals(expected, items);
    }
}