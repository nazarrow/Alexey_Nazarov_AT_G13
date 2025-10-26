package main.java.homework.day10;

import main.java.homework.day7.collections.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandRunner {
    public static void main(String[] args) {

//        Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
//        Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11) и именами (Речной, Речной, Карьерный, Карьерный, Речной)
//        соответственно
//        Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву "ч"
//        Отсортировать по весу в восходящем порядке
//        На основании существующего потока данных создать новый, в котором каждый новый Sand имеет вес умноженный на 2,
//                и имя в верхнем регистре
//        На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
//        Отпечатать каждый из элементов карты в виде value:key в текстовый файл

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));


        Map<Integer, String> sandMap = sandbox.stream()
                .filter(s -> s.getWeight() > 9 && s.getName().contains("ч"))
                .sorted(Comparator.comparing(Sand::getWeight))
                .map(s -> new Sand(s.getWeight() * 2, s.getName().toUpperCase()))
                .collect(Collectors.toMap(Sand::getWeight, Sand::getName));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task14_day10_file.txt"))) {
            for (Map.Entry<Integer, String> entry : sandMap.entrySet()) {
                writer.write(entry.getValue() + ":" + entry.getKey());
                writer.newLine();
            }
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

    }
}
