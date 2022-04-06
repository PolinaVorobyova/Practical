package Myself;

public class Palin2 {
    public static void main(String[] args) {
        System.out.println(palin("Poliilop"));

    }
    public static boolean palin(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >=0; i--) {
            rev += str.charAt(i);
        }
        return str.equalsIgnoreCase(rev);
    }
}
