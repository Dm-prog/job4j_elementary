package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<>();
        listName.add("Иван");
        listName.add("Петр");
        listName.add("Степан");
        for (String name : listName) {
            System.out.println(name);
        }
    }
}
