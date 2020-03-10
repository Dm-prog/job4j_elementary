package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
                System.out.println(true);

        result = first < second;
                System.out.println(false);

        result = first == second;
                System.out.println(false);
    }
}
