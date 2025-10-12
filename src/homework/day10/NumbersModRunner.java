package homework.day10;

import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {

//        Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
//        Отфильтровать те числа, которые содержать цифру 3
//        Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//        Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки

        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.map(Object::toString)
                .filter(s -> s.contains("3"))
                .flatMap(s -> s.chars().mapToObj(c -> "ноль один два три четыре пять шесть семь восемь девять".split(" ")[c - '0']))
                .distinct()
                .sorted((a,b) -> b.compareTo(a))
                .forEach(System.out::println);

    }
}
