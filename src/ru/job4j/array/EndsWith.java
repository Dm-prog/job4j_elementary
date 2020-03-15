package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        String s1 = new String(word);
        String s2 = new String(post);
        if (!s1.endsWith(s2))
            return false;
        return result;
    }
}
