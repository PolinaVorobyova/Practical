package Myself;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagr {
    public static void main(String[] args) {
        System.out.println(anag("нора", "рано"));

    }
    public static boolean anag(String word1, String word2) {
        char[] word11 = word1.toCharArray();
        char[] word22 = word2.toCharArray();

        Arrays.sort(word11);
        Arrays.sort(word22);

        word1 = new String(word11);
        word2 = new String(word22);

        return word1.equals(word2);

    }
}
