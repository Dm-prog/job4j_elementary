package ru.job4j.tracker;

import java.util.*;

public class SortByItemReverce implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
//class Ex {
//    public static void main(String[] args) {
//        SortByItemReverce sortByItemReverce = new SortByItemReverce();
//        Set<Item> items = new TreeSet<>(sortByItemReverce);
//        items.add(new Item("Anna"));
//        items.add(new Item("Ivan"));
//        items.add(new Item("Alex"));
//
//        System.out.println(items);
//    }
//}

