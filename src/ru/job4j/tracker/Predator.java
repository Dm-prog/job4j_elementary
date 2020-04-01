package ru.job4j.tracker;

public class Predator extends Animal {
    String name;

    public Predator() {
        super();
        System.out.println("Predator");
    }

    public Predator(String name) {
        super(name);
        this.name = name;
    }
}
