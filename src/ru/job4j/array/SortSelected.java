package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length - 1);
        int index = FindLoop.indexOf(data, min, 0, data.length - 1);
        int x = 0;
        for (int i = 0; i < data.length; i++) {
            MinDiapason.findMin(data, 0, data.length - 1);
            FindLoop.indexOf(data, min, 0, data.length - 1);
            x = data[i];
            data[i] = data[index];
            data[index] = x;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 5};
        System.out.println(Arrays.toString(sort(arr)));

    }
}
