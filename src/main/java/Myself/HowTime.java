package Myself;

import java.util.Locale;

public class HowTime {
    public static void main(String[] args) {
        System.out.println(count1("HellohElloeEeE", 'e'));

    }
    public static int count1(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase(Locale.ROOT).charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
