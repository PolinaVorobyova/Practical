package Myself;

import java.util.Locale;

public class Repl {
    public static void main(String[] args) {
        System.out.println(repl("HelloO!"));

    }
    public static String repl(String orig) {
        return orig.toLowerCase(Locale.ROOT).replace('o', 'i');
    }
}
