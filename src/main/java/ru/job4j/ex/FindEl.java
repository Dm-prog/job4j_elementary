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
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                System.out.println(key);
                rsl = index;
                break;
            }
        }

        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }
}
