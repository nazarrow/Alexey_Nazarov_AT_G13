package main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;

public class MyStream2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().findFirst().orElse("Pusto"));

        System.out.println(list.stream().filter("мама"::equals).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(list.stream().skip(2).limit(2).toList());

        System.out.println(list.stream().distinct().filter(string -> string.contains("м")).toList());

    }
}
