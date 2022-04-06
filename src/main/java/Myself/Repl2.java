package Myself;

public class Repl2 {
    public static void main(String[] args) {
        System.out.println(repl("Hello", 'o', 'e'));

    }
    public static String repl(String orig, char oldy, char neww) {
        String rep = "";
        for (int i = 0; i < orig.length(); i++) {
            if (orig.charAt(i) == oldy) {
                rep += neww;
            } else rep += orig.charAt(i);
        } return rep;
    }
}
