package main.java.homework.day7.collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2Figures {
    public static void main(String[] args) {

        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("figures.txt"));

            for (String figure : figures) {
                writer.write(figure + " - ");
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        int countWithoutI = 0;
        for (String figure1 : figures) {
            if (!figure1.contains("и")) {
                countWithoutI++;
            }
        }
        System.out.println("Count without I: " + countWithoutI);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        figures.add(2, "Треугольник");

        for (String figure2 : figures) {
            System.out.print(figure2 + " ");
        }

    }
}
