package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return MathFunction.subtraction(first, second)
                + MathFunction.division(first, second);
    }
    public static double sumAllFunc(double first, double second) {
        return MathFunction.division(first, second)
                + MathFunction.subtraction(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDiv(20, 20));
        System.out.println("Результат расчета равен: " + sumAllFunc(20, 20));
    }
}
