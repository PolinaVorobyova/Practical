package Myself;

public class PrintString {
    public static void main(String[] args) {
        System.out.println(str("Hello!", 8));

    }
    public static String str(String str1, int count) {
        String ent = "\n";
        String fin = str1.concat(ent);
        return fin.repeat(count);
    }
}
