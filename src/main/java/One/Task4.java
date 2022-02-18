public class Task4 {
    public static void main(String[] args) {
        int count = 0;
        String str = "Andersen trainee";
        int i = 0;
        for (i=0; i < str.length(); i++) {
            if (str.charAt(i)=='a')
                count++;
        }

        System.out.println(count);

    }
}
