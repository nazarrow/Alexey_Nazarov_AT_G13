package main.java.homework.day10;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {

//        Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
//        В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
//        Отсортировать и снова отпечатать в консоль с новой строки
//        Посчитать сумму всех чисел и вывести результат в консоль

        Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        numbers.forEach(System.out::println);

        System.out.println("новый поток и сортировка");
        Stream<Integer> numbersSorted = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        numbersSorted.sorted().forEach(System.out::println);

        System.out.println("новый поток и сумма всех чисел");
        Stream<Integer> numbersForSum = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        int sum = numbersForSum.mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
