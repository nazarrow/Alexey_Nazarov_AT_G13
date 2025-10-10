package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class MyStream1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        int countElements = 0;
        for (String s : list) {
            if (s.equals("мама")) {
                countElements++;
            }
        }
        System.out.println("Количество элементов мама: " + countElements);

//        long countEl = list.stream().filter(string -> string.equals("мама")).count();
//        System.out.println("Количество элементов мама stream: " + countEl);


//        long countEl = list.stream().filter(string -> "мама"::equals).count();
//        System.out.println("Количество элементов мама ссылка:" + countEl);


    }
}
