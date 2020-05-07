package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    public static void main(String[] args) {

    }

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        while (money > COINS[3]) {
            for (size = 0; size < money; size++) {
//                if ((money - price) > COINS[0]) {
//                    rsl[0] = COINS[0];
//                } else if (rsl[money] > COINS[1]) {
//                    size = money - COINS[1];
//                } else if (rsl[money] > COINS[2]) {
//                    size = money - COINS[2];
//                } else size = money - COINS[3];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
