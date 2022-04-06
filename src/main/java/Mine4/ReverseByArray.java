package Mine4;

public class ReverseByArray {
    public static void main(String[] args) {

        String str = "Hello, world!";
        String rev = "";
        char[] charString = str.toCharArray();
        for (int i = charString.length-1; i >=0; i--) {
            rev = rev + charString[i];
        }
        System.out.println(rev);
    }
}
