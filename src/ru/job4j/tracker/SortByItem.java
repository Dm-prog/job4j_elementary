package ru.job4j.tracker;

import java.util.*;

public class SortByItem implements Comparator<Item> {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Anna"),
                new Item("Ivan"),
                new Item("Alex")
        );
        Collections.sort(items, new SortByItem());
        System.out.println(items);
        Collections.reverse(items);
        System.out.println(items);
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
