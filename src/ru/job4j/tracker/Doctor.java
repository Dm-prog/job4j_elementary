package ru.job4j.tracker;

public class Doctor extends Profession {
    String name;
    String surname;
    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
