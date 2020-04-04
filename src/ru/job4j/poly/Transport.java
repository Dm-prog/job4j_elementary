package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int passengers);

    int tuck(int fuel, int price);
}
