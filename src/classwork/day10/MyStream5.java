package classwork.day10;

import homework.day9.Person;

import java.util.Arrays;
import java.util.List;

public class MyStream5 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().flatMap(str -> Arrays.stream(str.split(""))).
                peek(System.out::println).max(String::compareTo).get());

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        System.out.println(people.stream().max((p1, p2) -> p2.age - p1.age));


    }
}
