import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        String str1 = "нора";
        String str2 = "рано";

        char[] cr1 = str1.toCharArray();
        char[] cr2 = str2.toCharArray();

        Arrays.sort(cr1);
        Arrays.sort(cr2);

        str1 = new String(cr1);
        str2 = new String(cr2);

        if(str1.equals(str2)){
            System.out.println("Являются анаграммами");
        } else System.out.println("Не являются анаграммами");
    }
}
