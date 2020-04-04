package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student s = new Freshman();
        Freshman freshFromStudent = (Freshman) s;

        Object object = new Freshman();
        Freshman freshFromObject = (Freshman) object;
    }
}
