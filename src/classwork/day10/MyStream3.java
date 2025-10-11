package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class MyStream3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().anyMatch("мама"::equals));

        System.out.println(list.stream().allMatch(str -> str.contains("м")));

        System.out.println(list.stream().map(string -> string + "м").toList());

        System.out.println(list.stream().flatMap(string -> Arrays.stream(string.split("а"))).
                filter(string -> !string.isEmpty()).toList());

    }
}
