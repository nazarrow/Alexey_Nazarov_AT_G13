package homework.day10;

import homework.day7.collections.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PeopleRunner {
    public static void main(String[] args) {

//        Создать поток данных people класса Person (через new Stream.of) с возрастом (32, 24, 55, 63) и
//    именами (Коля, Оля, Вася, Маша) соответственно
//        Отфильтровать людей, которые моложе 60
//        Отсортировать в восходящем порядке по именам
//        На основании существующего потока данных создать новый, в котором каждый новый Person имеет возраст на 4 года
//        больше исходного
//        Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл

        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        );

        String str = String.valueOf(people.filter(p -> p.getAge() < 60)
                .sorted(Comparator.comparing(Person::getName))
                .map(p -> new Person(p.getAge() + 4, p.getName()))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0));

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("task12_day10_file.txt"));
            writer.write(str);
            System.out.println("Success");
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }


    }
}
