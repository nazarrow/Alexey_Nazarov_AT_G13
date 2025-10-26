package main.java.homework.day10;

import main.java.homework.day7.collections.Bubble;
import main.java.homework.day7.collections.Chair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) {

//        Создать поток данных furniture класса Chair (через new Stream.of) furniture из 3 стульев
//        высотой (120, 90, 100, 110) и шириной (40, 30, 50, 45) соответственно
//        Отфильтровать только те стулья, который выше или равны 100 и уже или равны 50
//        Отсортировать по высоте, а если высота равна, то по ширине в нисходящем порядке
//        На основании существующего потока данных создать новый, в котором каждый новый Chair имеет высоту, деленную на 2,
//            и ширину, умноженную на случайное число от 3 до 8 включительно
//        На основании получившегося потока данных создать новый, представляющий собой уникальный набо высот стульев умноженных
//        на их ширину
//        Найти наибольшее значение в получившемся потоке
//        Создать новый обьект Bubble с обьемом равным найденному наибольшему значению и именем равным найденному наибольшему
//    значению, представленным в виде словесного выражения каждой цифры числа этого значения, указанного чере пробел
//        Напечатать строковое значение полученного обьекта в текстовый файл

        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45)
        );

        Random random = new Random();

        furniture.filter(c -> c.getHeight() >= 100 && c.getWidth() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth).reversed())
                .map(c -> new Chair(c.getHeight() / 2, c.getWidth() * random.nextInt(3, 9)))
                .map(c -> c.getHeight() * c.getWidth())
                .distinct()
                .max(Integer::compareTo)
                .map(v -> {
                    String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                    String name = String.valueOf(v)
                            .chars()
                            .mapToObj(ch -> words[ch - '0'])
                            .collect(Collectors.joining(" "));
                    return new Bubble(v, name);
                })
                .ifPresent(bubble -> {
                    try {
                        Files.writeString(Path.of("task15_day10_file.txt"), bubble.toString());
                        System.out.println("Result in file: " + bubble);
                    } catch (IOException e) {
                        System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
                    }
                });
        
    }
}
