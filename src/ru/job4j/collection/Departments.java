package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            String[] dep = value.split("/");
            for (String el : dep) {
                tmp.add(start + "/" + el);
            }

        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
//        orgs.add("K1");
//        orgs.add("K1/SK1");
//        orgs.add("K1/SK1/SSK1");
//        orgs.add("K1/SK1/SSK2");
//        orgs.add("K1/SK2");
//        orgs.add("K2");
//        orgs.add("K2/SK1");
//        orgs.add("K2/SK1/SSK1");
//        orgs.add("K2/SK1/SSK2");
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
//        orgs.add("K2");
//        orgs.add("K2/SK1");
//        orgs.add("K2/SK1/SSK1");
//        orgs.add("K2/SK1/SSK2");
//        orgs.add("K1");
//        orgs.add("K1/SK1");
//        orgs.add("K1/SK1/SSK1");
//        orgs.add("K1/SK1/SSK2");
//        orgs.add("K1/SK2");
        Collections.sort(orgs, new DepDescComp());
    }
}
