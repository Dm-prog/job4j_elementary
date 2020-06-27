package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] charLeft = left.split("Ivanov");
        String[] charRight = right.split("Ivanova");

        for (int i = 0; i < charLeft.length; i++) {
            for (int j = 0; j < charLeft.length; j++) {
                if (charLeft[i].equals(charRight[j])) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
