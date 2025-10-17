package homework.day10;

import java.util.stream.Stream;

public class CarsRunner {
    public static void main(String[] args) {

//        Создать поток данных стрингов из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через Stream.of())
//        Оставить в потоке только уникальные названия авто
//        Отфильтровать только те названия, которые содержат букву "и"
//        Пропустить 1 название
//        Все названия привести в верхний регистр
//        Отпечатать все названия в консоль с новой строки

        Stream<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
        cars.distinct().filter(c -> c.contains("и"))
                .skip(1).map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
