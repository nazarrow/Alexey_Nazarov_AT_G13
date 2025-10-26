package main.java.homework.day8;

import java.util.*;

public class Task17Fruits {
    public static void main(String[] args) {

        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Яблоко", 120));
        fruits.add(new Fruits("Банан", 80));
        fruits.add(new Fruits("Груша", 150));
        fruits.add(new Fruits("Апельсин", 200));

        for (Fruits f : fruits) {
            System.out.print(f.getName() + " ");
        }
        System.out.println();

        for (Fruits f : fruits) {
            System.out.print(f.getWeight() + " ");
        }
        System.out.println();

        Map<Integer, Fruits> integerFruitsMap = new HashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            integerFruitsMap.put(i + 1, fruits.get(i));
        }

        Iterator<Integer> keyIter = integerFruitsMap.keySet().iterator();
        while (keyIter.hasNext()) {
            System.out.println(keyIter.next());
        }

        Iterator<Fruits> valIter = integerFruitsMap.values().iterator();
        while (valIter.hasNext()) {
            System.out.println(valIter.next());
        }
        System.out.println();

        for (Map.Entry<Integer, Fruits> entry : integerFruitsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
