package classwork.day10;

import homework.day9.Person;

import java.util.Arrays;
import java.util.List;

public class MyStream4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().sorted().toList());
        System.out.println(list.stream().sorted((string, string2) -> -string.compareTo(string2)).distinct().toList());

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        System.out.println(people.stream().sorted((Person p1, Person p2) -> {
            if (p1.sex != p2.sex) {
                return p1.sex.compareTo(p2.sex);
            } else {
                return p1.age - p2.age;
            }
        }).toList());
    }
}
