public class Task8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i = 3; i <= 10; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
