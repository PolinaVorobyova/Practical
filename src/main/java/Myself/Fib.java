package Myself;

public class Fib {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a + "\n" + b);
        for (int i = 0; i < 10; i++) {
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
