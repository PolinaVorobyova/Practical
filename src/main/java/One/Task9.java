public class Task9 {

    public static void main(String[] args) {

        System.out.println(calculateFactorial(6));
    }

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;

    }
}
