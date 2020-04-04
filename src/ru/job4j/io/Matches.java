package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 11;
        int count = 0;

        System.out.println("Игра началась");
        while (count < start) {
            int player1;
            int player2;
            System.out.println("Введите число от 1 до 3");

            player1 = Integer.valueOf(sc.nextLine());
            if (player1 > 3) {
                System.out.println("Вы ввели некорректное число");
                player1 = 0;
                continue;
            }

            System.out.println("Player1 input: " + player1);
            count = count + player1;
            System.out.println("Count: " + count);

            if (count >= 11) {
                System.out.println("Player1 is win! Game over!");
                break;
            }

            player2 = Integer.valueOf(sc.nextLine());
            if (player2 > 3) {
                System.out.println("Вы ввели некорректное число");
                player2 = 0;
            }
            System.out.println("Player2 input: " + player2);
            count = count + player2;
            System.out.println("Count: " + count);
            if (count >= 11) {
                System.out.println("Player2 is win! Game over!");
                break;
            }
        }
    }
}
