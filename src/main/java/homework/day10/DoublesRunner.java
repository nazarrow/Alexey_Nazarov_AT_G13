package main.java.homework.day10;

import main.java.homework.day7.collections.Bubble;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {

//        Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
//    через (Stream.of())
//        Округлить каждое число до целого
//        На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с границами от 0 до числа
//        из иходного потока данных
//        Убрать дубликаты значений
//        Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве равному
//        заменяемому числу,
//        создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i, где i - число из
//        исходного потока
//        Отпечатать в консоль каждый из обьектов нового потока с новой строки
//        Найти общий обьем полученного потока пузырьков и отпечатать в консоль

        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        Random random = new Random();

        System.out.println(doubles.
                mapToInt(d -> (int) Math.round(d))
                .mapToObj(rand -> random.nextInt(rand + 1))
                .distinct()
                .flatMap(num -> IntStream.range(0, num).mapToObj(i -> new Bubble(num, "Bubble vol-" + num)))
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume)
                .sum()
        );

    }
}
