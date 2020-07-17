package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {

        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            String[] dep = value.split("/");
            for (String el : dep) {
                start = start + el;
                tmp.add(start);
                start = start + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
