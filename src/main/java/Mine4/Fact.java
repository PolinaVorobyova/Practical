package Mine4;

public class Fact {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return result;
    }
}
