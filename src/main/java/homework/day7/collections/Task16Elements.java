package main.java.homework.day7.collections;

import java.util.HashMap;
import java.util.Map;

public class Task16Elements {
    public static void main(String[] args) {

        Map<Integer, String> elements = new HashMap<>();
        elements.put(1, "Silicon");
        elements.put(2, "Sulfur");
        elements.put(3, "Argon");
        elements.put(4, "Calcium");
        elements.put(5, "Chromium");
        elements.put(6, "Iron");
        elements.put(7, "Zinc");

        for (String el : elements.values()) {
            System.out.print(el + " ");
        }
        System.out.println();

        int countNames = 0;
        for (String names : elements.values()) {
            if (names.toLowerCase().contains("u")) {
                countNames++;
            }
        }
        System.out.println("Названий элементов содержит букву 'u': " + countNames);

        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        elements.replace(4, "Selenium");

        elements.remove(2);

        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
