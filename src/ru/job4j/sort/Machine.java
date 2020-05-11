package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        for (int index = 0; index < COINS.length; index++) {
            while (diff - COINS[index] >= 0) {
                if (COINS[index] <= diff) {
                    rsl[size] = COINS[index];
                    diff = diff - COINS[index];
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
