package main.java.homework.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task18Cars {
    public static void main(String[] args) {

        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars("Toyota", "Corolla"));
        cars.add(new Cars("Ford", "Mustang"));
        cars.add(new Cars("BMW", "X5"));

        for (Cars c : cars) {
            System.out.println(c.getBrand() + ":" + c.getModel());
        }

        Map<String, Cars> stringCarsMap = new HashMap<>();
        for (Cars c : cars) {
            stringCarsMap.put(c.getBrand(), c);
        }

        for (String brand : stringCarsMap.keySet()) {
            System.out.println(brand);
        }

        for (Cars model : stringCarsMap.values()) {
            System.out.println(model);
        }
        System.out.println();

        for (Map.Entry<String, Cars> entry : stringCarsMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
