package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = money - price;
        int count = 0;
        while (size > 0) {
            for (int index = size; size > 0; index--) {
                if (COINS[0] <= size) {
                    rsl[count] = COINS[0];
                    size = size - COINS[0];
                    count++;
                } else if (COINS[1] <= size) {
                    rsl[count] = COINS[1];
                    size = size - COINS[1];
                    count++;
                } else if (COINS[2] <= size) {
                    rsl[count] = COINS[2];
                    size = size - COINS[2];
                    count++;
                } else {
                    rsl[count] = COINS[3];
                    size = size - COINS[3];
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
