package main.java.homework.day7.collections;

import java.util.ArrayList;
import java.util.List;

public class Task1Butterflies {
    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.println("\"" + butterfly + "\"");
        }

        int counter = 0;
        for (String butterfly1 : butterflies) {
            if (butterfly1.contains("o")) {
                counter++;
            }
        }
        System.out.println("Кол-во бабочек содержат букву 'o': " + counter);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        for (String butterfly2 : butterflies) {
            System.out.print("\n" + butterfly2);
        }
    }
}
