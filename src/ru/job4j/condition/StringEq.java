package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = login.equals(root);
        return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        String root = "root";
        boolean userHasAccess = StringEq.check(root);
        System.out.println(userHasAccess);
    }
}
