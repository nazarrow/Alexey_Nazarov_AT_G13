package main.java.homework.day7.collections;

import java.util.*;

public class Task15Furniture {
    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)
        ));

        for (Chair ch : furniture) {
            System.out.println(ch.getHeight() * ch.getWidth() + " ");
        }

        Map<Integer, Chair> integerChairMap = new HashMap<>();

        for (int i = 0; i < furniture.size(); i++) {
            integerChairMap.put(i + 1, furniture.get(i));
        }

        for (Integer k : integerChairMap.keySet()) {
            System.out.println(k);
        }

        for (Chair ch : integerChairMap.values()) {
            System.out.println(ch);
        }

        for (Map.Entry<Integer, Chair> entry : integerChairMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
