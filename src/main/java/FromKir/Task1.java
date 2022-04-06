package FromKir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Auto> AllAuto = new ArrayList<Auto>();
        AllAuto.add(new Auto("Audi", 2012, 20000.1, "Red", 3.3));
        AllAuto.add(new Auto("Lada", 2002, 200.1, "Black", 1.8));
        AllAuto.add(new Auto("Renault", 2018, 25000.1, "Silver", 2.8));
        AllAuto.add(new Auto("Audi", 2021, 80000.1, "White", 3.5));
        AllAuto.add(new Auto("BMW", 2015, 30000.1, "Red", 3.3));
        AllAuto.add(new Auto("Nissan", 2019, 18000.1, "Black", 2.5));


        AllAuto.stream().forEach(System.out::println);
        List<Auto> red = AllAuto.stream().filter(i -> i.getColor().equals("White")).collect(Collectors.toList());
        System.out.println(red);
        AllAuto.stream().filter(i -> i.getVolume() == 3.3).forEach(System.out::println);

        AllAuto.stream().filter(i -> i.getCost() > 20000.0).forEach(System.out::println);
        AllAuto.stream().filter(i -> i.getYear() < 2019 && i.getYear() > 2015).forEach(System.out::println);

        String s = "jdl";
        System.out.println(s.hashCode());
        s = "dfl;s";
        System.out.println(s.hashCode());




        /*List<String> collect = AllAuto.stream().filter(i -> i.color.("Red")).collect(Collectors.toList());
        System.out.println(collect);
        Auto po = new Auto("Lada", 2002, 200.0, "Black", 1.8);
        System.out.println(po);*/

    }
}



