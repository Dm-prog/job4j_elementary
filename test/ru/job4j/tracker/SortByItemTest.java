package ru.job4j.tracker;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortByItemTest {

    @Test
    public void sortByItemNameReverce() {
        SortByItemReverce sortByItemReverce = new SortByItemReverce();
        Item item = new Item("");
        Set<Item> items = new TreeSet<>(sortByItemReverce);
        items.add(new Item("Anna"));
        items.add(new Item("Ivan"));
        int result = sortByItemReverce.compare(new Item("Ivan"), new Item("Anna"));
        assertThat(result, is(sortByItemReverce.compare(new Item("Ivan"), new Item("Anna"))));
    }

    @Test
    public void sortByItemName() {
        SortByItem sortByItem = new SortByItem();
        Item item = new Item("");
        Set<Item> items = new TreeSet<>(sortByItem);
        items.add(new Item("Anna"));
        items.add(new Item("Ivan"));
        int result = sortByItem.compare(new Item("Anna"), new Item("Ivan"));
        assertThat(result, is(sortByItem.compare(new Item("Anna"), new Item("Ivan"))));
    }

}
