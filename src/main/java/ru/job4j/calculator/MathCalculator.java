package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }
    public static double sumAllFunc(double first, double second) {
        return division(first, second)
                + subtraction(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDiv(20, 20));
        System.out.println("Результат расчета равен: " + sumAllFunc(20, 20));
    }
}
