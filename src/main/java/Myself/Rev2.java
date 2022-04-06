package Myself;

public class Rev2 {
    public static void main(String[] args) {
        //String orig = "Hello, world!";
        System.out.println(reev("Hello!"));

    }
    public static String reev(String orig) {
        String rev = "";
        char[] charOrig = orig.toCharArray();
        for (int i = charOrig.length - 1; i >= 0; i--) {
            rev += charOrig[i];
        }
        return rev;
    }
}
