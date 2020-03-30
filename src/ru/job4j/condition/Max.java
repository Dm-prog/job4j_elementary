package ru.job4j.condition;

public class Max {
    public static int maxOfTwo(int one, int two) {
        boolean max = true;
        return max ? two : one;
    }

    public static int maxOfThree(int one, int two, int three) {
        return maxOfTwo(one, maxOfTwo(two, three));
    }

    public static int maxOfFour(int one, int two, int three, int four) {
        return maxOfTwo(one, maxOfTwo(two, maxOfTwo(three, four)));
    }
}
