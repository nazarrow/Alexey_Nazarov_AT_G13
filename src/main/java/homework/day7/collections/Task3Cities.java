package main.java.homework.day7.collections;

import java.util.ArrayList;
import java.util.List;

public class Task3Cities {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int totalLetters = 0;
        for (String city : cities) {
            totalLetters += city.length();
        }
        System.out.println("Сумма букв во всех словах: " + totalLetters);

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + " ");
        }

    }
}
