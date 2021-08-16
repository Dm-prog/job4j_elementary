package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        if (two > one) {
            return two;
        }
        return one;
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, max(two, max(three, four)));
    }
}
