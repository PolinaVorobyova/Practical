package Myself;

public class Fact {
    public static void main(String[] args) {
        System.out.println(factor(5));

    }
    public static int factor(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *=i;
        }
        return result;
    }
}
