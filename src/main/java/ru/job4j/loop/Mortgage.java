package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        double balance;
        int year = 0;
        percent = percent / 100;
        amount = (int) (amount * percent + amount);
        while (amount > 0) {
            balance = amount - salary;
            year++;
            balance = balance * percent + balance;
            if (balance < 0) {
                break;
            }
            amount = (int) balance;
        }
        return year;
    }
}
