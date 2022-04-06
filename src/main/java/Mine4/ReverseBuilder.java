package Mine4;

public class ReverseBuilder {
    public static void main(String[] args) {
        System.out.println(rev("Привет, мир!"));

    }

    public static String rev (String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
