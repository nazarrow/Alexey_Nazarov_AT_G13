package homework.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task20Cities {
    public static void main(String[] args) {

        List<Cities> cities = new ArrayList<>();
        cities.add(new Cities("Москва", 12000000));
        cities.add(new Cities("Нью-Йорк", 8400000));
        cities.add(new Cities("Париж", 2200000));

        for (Cities c : cities) {
            System.out.println(c.getName() + " ");
        }

        for (Cities c : cities) {
            System.out.println(c.getPopulation() + " ");
        }

        Map<String, Cities> stringCitiesMap = new HashMap<>();
        for (Cities s : cities) {
            stringCitiesMap.put(s.getName(), s);
        }

        int totalPopulation = 0;
        for (Cities c : stringCitiesMap.values()) {
            totalPopulation += c.getPopulation();
        }
        System.out.println("totalPopulation:" + totalPopulation);

    }
}
