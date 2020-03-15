package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        String s1 = new String(word);
        String s2 = new String(pref);
        if (!s1.startsWith(s2))
            return false;
        return result;
    }
}
