public class Task6 {
    public static void main(String[] args) {

        String str = "Andersen trainee";
        String str2 = "polinaanilop";
        System.out.println(askPalindrome(str2));

    }

    public static Boolean askPalindrome(String x) {

        return x.equals((new StringBuilder(x)).reverse().toString());
    }
}
