package classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().mapToInt(String::length).filter(x -> x % 2 == 1).sum());
        System.out.println((Integer) list.stream().map(String::length).mapToInt(p -> p % 2 == 1 ? p : 0).sum());
        System.out.println(list.stream().map(String::length).collect(Collectors.summingInt(p -> p % 2 == 1 ? p : 0)));
        
    }
}
