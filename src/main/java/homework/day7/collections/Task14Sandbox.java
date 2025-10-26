package main.java.homework.day7.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task14Sandbox {
    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand s : sandbox) {
            System.out.print(s.getWeight() + " ");
        }
        System.out.println();

        for (Sand s : sandbox) {
            System.out.print(s.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();

        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i + 1, sandbox.get(i));
        }

        for (Integer k : sandMap.keySet()) {
            System.out.println(k);
        }

        for (Sand s : sandMap.values()) {
            System.out.println(s);
        }
        System.out.println();

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
