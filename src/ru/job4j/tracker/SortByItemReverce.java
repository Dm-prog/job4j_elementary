package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByItemReverce implements Comparator<Item> {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Anna"),
                new Item("Ivan"),
                new Item("Alex")
        );
        Collections.sort(items, new SortByItem());
        Collections.reverse(items);
        System.out.println(items);
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
