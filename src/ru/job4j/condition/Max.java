package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = right;
        boolean max = true;
        if (left > right)
            result = max ? left : right;
        return result;
    }

    public static int min(int left, int right) {
        int result = right;
        boolean min = true;
        if (left < right)
            result = min ? left : right;
        return result;
    }

    public static int equally(int left, int right) {
        int result = left;
        boolean min = true;
        if (left == right)
            result = min ? left : right;
        return result;
    }
}
