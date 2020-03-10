package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        boolean max = true;
        if (left > right) {
            return max ? right : left;
        }
        if (right > left) {
            return max ? right : left;
        }
        return result;
    }
}
