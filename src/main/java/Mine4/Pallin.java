package Mine4;

public class Pallin {
    public static void main(String[] args) {
        System.out.println(pallindrome("Полинаанилоп"));
    }
    public static boolean pallindrome(String a) {
        StringBuilder stringBuilder = new StringBuilder(a);
        return stringBuilder.reverse().toString().equals(a);
        //equalsIgnoreCase

    }
}

