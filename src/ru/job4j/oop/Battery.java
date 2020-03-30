package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 5;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(20);
        Battery battery2 = new Battery(10);
        battery1.exchange(battery2);
        System.out.println(battery1.load + battery2.load);
    }
}
