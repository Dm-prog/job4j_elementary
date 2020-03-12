package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int count = 4;
        boolean prime = false;
        for (int i = 2; i < number - 1; i++) {
            count++;
            if (count % i == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}
