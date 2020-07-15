package ru.job4j.collection;

import java.util.*;

public class Departments implements Comparable<Departments> {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + "/" + el);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.add("K1");
        orgs.add("K1/SK1");
        orgs.add("K1/SK1/SSK1");
        orgs.add("K1/SK1/SSK2");
        orgs.add("K1/SK2");
        orgs.add("K2");
        orgs.add("K2/SK1");
        orgs.add("K2/SK1/SSK1");
        orgs.add("K2/SK1/SSK2");
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.add("K2");
        orgs.add("K2/SK1");
        orgs.add("K2/SK1/SSK1");
        orgs.add("K2/SK1/SSK2");
        orgs.add("K1");
        orgs.add("K1/SK1");
        orgs.add("K1/SK1/SSK1");
        orgs.add("K1/SK1/SSK2");
        orgs.add("K1/SK2");

        DepDescComp depDescComp = new DepDescComp();
        int result;
        result = depDescComp.compare(orgs.get(1), orgs.get(0));
        if (result == 0) {
            depDescComp.compare(orgs.get(0), orgs.get(1));
        }
    }

    @Override
    public int compareTo(Departments o) {
        return 1;
    }
}
