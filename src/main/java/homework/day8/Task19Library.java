package main.java.homework.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task19Library {
    public static void main(String[] args) {

        List<Book> library = new ArrayList<>();
        library.add(new Book("Война и мир", "Толстой"));
        library.add(new Book("Преступление и наказание", "Достоевский"));
        library.add(new Book("Мастер и Маргарита", "Булгаков"));

        for (Book b : library) {
            System.out.println(b.getName() + " ");
        }

        Map<String, String> stringStringMap = new HashMap<>();
        for (Book b : library) {
            stringStringMap.put(b.getName(), b.getAuthor());
        }

        for (String entry : stringStringMap.keySet()) {
            System.out.println(entry);
        }

        for (String entry : stringStringMap.values()) {
            System.out.println(entry);
        }
        System.out.println();

        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
