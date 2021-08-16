package ru.job4j;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public Tiger(String name) {
        super(name);
        this.name = name;
    }
}
