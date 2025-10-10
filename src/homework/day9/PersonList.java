package homework.day9;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class PersonList {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        int countPeople = 0;
        for (Person person : people) {
            if (person.sex == Person.Sex.WOMEN && person.age >= 18 && person.age <= 55) {
                countPeople++;
            }
            if (person.sex == Person.Sex.MAN && person.age >= 18 && person.age <= 60) {
                countPeople++;
            }
        }
        System.out.println("Кол-во человек: " + countPeople);

        long peopleCount = people.stream()
                .filter(person ->
                        (person.sex == Person.Sex.WOMEN && person.age >= 18 && person.age <= 55) ||
                                (person.sex == Person.Sex.MAN && person.age >= 18 && person.age <= 60)
                )
                .count();
        System.out.println("Кол-во человек via stream: " + peopleCount);

    }

}
