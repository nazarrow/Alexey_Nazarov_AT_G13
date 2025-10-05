package classwork.day8;

import java.util.Map;
import java.util.HashMap;

public class HashMapCW {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();

        String[] arr = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < arr.length; i++) {
            words.put(i, arr[i]);
        }

        for (int key : words.keySet()) {
            System.out.println(key);
        }

        for (String map : words.values()) {
            System.out.println(map);
        }

        System.out.println(" -- -- -- ");

        for (Map.Entry<Integer, String> combo : words.entrySet()) {
            System.out.println(combo.getKey() + combo.getValue());
        }

    }
}
