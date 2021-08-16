package ru.job4j;

public class Animal {
    String name;
    public Animal() {
        System.out.println("Animal");
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
