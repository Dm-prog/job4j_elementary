package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            sc.nextLine();
            System.out.println("Да");
        } else if (answer == 1) {
            sc.nextLine();
            System.out.println("Нет");
        } else {
            sc.nextLine();
            System.out.println("Может быть");
        }
    }
}
