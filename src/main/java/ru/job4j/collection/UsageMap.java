package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("dmitriyk80@bk.ru", "Kotov Dmitriy Nikolaevich");
        for (String user : users.keySet()) {
            String value = users.get(user);
            System.out.println(user + " - " + value);
        }
    }
}

