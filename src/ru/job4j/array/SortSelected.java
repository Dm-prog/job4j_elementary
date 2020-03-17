package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    isSorted = false;
                    buf = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = buf;
                }
            }
        }
        return data;
    }
}
