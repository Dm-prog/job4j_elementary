package ru.job4j;

public class Doctor extends Profession {
    String name;
    String surname;
    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
