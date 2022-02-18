public class Task1 {
    public static void main(String[] args) {
        System.out.println(turnString("Andersen trainee"));
    }
    public static String turnString(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
