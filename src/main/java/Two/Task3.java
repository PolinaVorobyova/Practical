package Two;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String>  employees = Arrays.asList("Аникеева", "Кузнецова","Петров","Козюлькин","Ананьев","Пугач","Хитрый","Жук", "Антошкин");
        System.out.println(employees);

        List<String> collect = employees.stream().filter(i -> i.startsWith("А")).collect(Collectors.toList());
        System.out.println(collect);

    }
}
