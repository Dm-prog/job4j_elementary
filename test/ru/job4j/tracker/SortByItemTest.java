package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortByItemTest {

    @Test
    public void sortByItemNameReverce() {
        SortByItemReverce sortByItemReverce = new SortByItemReverce();
        List<Item> items = new ArrayList<>();
        items.add(new Item("Victor"));
        items.add(new Item("Anna"));
        items.add(new Item("Ivan"));
        Collections.sort(items, sortByItemReverce.compare(items.get(0), items.get(1)));
        List<Item> expectedItems = new ArrayList<>();
        expectedItems.add(new Item("Anna"));
        expectedItems.add(new Item("Ivan"));
        expectedItems.add(new Item("Victor"));
        assertThat(expectedItems, is(items));
    }

    @Test
    public void sortByItemName() {
        SortByItem sortByItem = new SortByItem();
        List<Item> items = new ArrayList<>();
        items.add(new Item("Anna"));
        items.add(new Item("Ivan"));
        Collections.sort(items, sortByItem);
        int result = sortByItem.compare(new Item("Anna"), new Item("Ivan"));
        assertThat(result, is(sortByItem.compare(new Item("Anna"), new Item("Ivan"))));
    }

}
