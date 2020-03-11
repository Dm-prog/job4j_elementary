package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 0; i < number; i++) {
            if (number % 5 == 0)
                prime = true;
            break;
        }
        return prime;
    }
}
