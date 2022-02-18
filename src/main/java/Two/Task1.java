package Two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        for (int i = -7; i < 8; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        //System.out.println(list);

        List<Integer> collect = list.stream().map(i -> Math.abs(i)).collect(Collectors.toList());
        System.out.println(collect);


    }

}
