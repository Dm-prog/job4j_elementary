package ru.job4j.ex;

public class FindEl {
    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[] {""}, "");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String st : value) {
            System.out.println(st);
        }
        return rsl;
    }
}
