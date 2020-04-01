package ru.job4j.pojo;

import java.util.Date;

public class Student {
    String namePatronymicSurname;
    int group;
    Date dateOfReceipt;

    public String getNamePatronymicSurname() {
        return namePatronymicSurname;
    }

    public void setNamePatronymicSurname(String namePatronymicSurname) {
        this.namePatronymicSurname = namePatronymicSurname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }
}
