package homework.day7.collections;

import java.util.ArrayList;
import java.util.List;

public class Task12People {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        for (Person pers : people) {
            System.out.print(pers.getAge() + " ");
        }

        for (Person pers : people) {
            System.out.print(pers.getName() + " ");
        }

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

    }
}
