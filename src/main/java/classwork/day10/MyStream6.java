package main.java.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class MyStream6 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().map(String::length).reduce(Integer::sum).get());
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).count());
        System.out.println(list.stream().mapToInt(String::length).sum());

    }
}
