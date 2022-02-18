package Two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        for (int i = -7; i < 8; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        list.stream().map(i -> ((i%2==0) ? (i*100) : (i-100))).forEach(System.out::println);

    }
}
