package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = true;
        return max ? right : left;
    }
}
