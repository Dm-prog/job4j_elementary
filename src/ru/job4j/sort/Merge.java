package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
            for (int i = 0; i < rsl.length / 2; i++) {
                if (left[i] > right[i]) {
                    rsl[i + i] = right[i];
                    rsl[i + i + 1] = left[i];
                } else {
                    rsl[i + i] = left[i];
                    rsl[i + i + 1] = right[i];
                }
            }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
