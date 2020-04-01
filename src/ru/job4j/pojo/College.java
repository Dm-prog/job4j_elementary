package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNamePatronymicSurname("Иван Иванович Иванов");
        student.setGroup(2);
        student.setDateOfReceipt(new Date());
        System.out.println("Студент " + student.getNamePatronymicSurname() + " поступил во " + student.getGroup()
                + " группу " + student.getDateOfReceipt());
    }
}
