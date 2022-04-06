package Myself;

import java.util.Locale;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(palin("Helloolleh"));

    }
    public static boolean palin (String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}
