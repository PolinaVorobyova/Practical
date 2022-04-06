package Myself;

public class Rev {
    public static void main(String[] args) {
        System.out.println(rev("Hello,world!"));

    }

    public static String rev(String str) {
        //StringBuilder stringBuilder = new StringBuilder(str);
        return new StringBuilder(str).reverse().toString();
    }
}
