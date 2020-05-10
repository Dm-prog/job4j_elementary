package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        while (diff > 0) {
            for (int i = diff; diff > 0; diff--) {
                for (int index = 0; index < COINS.length; index++) {
                    if (COINS[index] <= diff) {
                        rsl[size] = COINS[index];
                        diff = diff - COINS[index];
                        size++;
                    }
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
