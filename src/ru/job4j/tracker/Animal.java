package ru.job4j.tracker;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal");
    }

    public Animal() {
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger");
    }
}
