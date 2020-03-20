package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (int i = 1; i < data.length - 1; i++) {
            if (data[i] < data[i - 1]) {
                FindLoop.indexOf(data, min, i, i - 1);
            }
        }
        return data;
    }

    public static void main(String[] args) {
        System.out.println(sort(new int[]{3, 4, 1, 2, 5}));
    }
}
