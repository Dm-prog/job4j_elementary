package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class SortByItemTest {

    @Test
    public void sortByItemName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Anna"));
        items.add(new Item("Victor"));
        items.add(new Item("Ivan"));
        Collections.sort(items, new SortByItem());
        List<Item> expectedItems = new ArrayList<>();
        expectedItems.add(new Item("Anna"));
        expectedItems.add(new Item("Ivan"));
        expectedItems.add(new Item("Victor"));
        assertEquals(expectedItems, is(items));
    }

    @Test
    public void sortByItemNameReverce() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Ivan"));
        items.add(new Item("Anna"));
        items.add(new Item("Victor"));
        Collections.sort(items, new SortByItemReverce());
        List<Item> expectedItems = new ArrayList<>();
        expectedItems.add(new Item("Victor"));
        expectedItems.add(new Item("Ivan"));
        expectedItems.add(new Item("Anna"));
        assertEquals(expectedItems, is(items));
    }

}
