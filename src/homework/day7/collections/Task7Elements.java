package homework.day7.collections;

import homework.day1.basetask.Souce;

import java.util.ArrayList;
import java.util.List;

public class Task7Elements {
    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println(" ");

        int countNames = 0;
        for (String element1 : elements) {
            if (element1.trim().contains(" ")) {
                countNames++;
            }
        }
        System.out.println("Количество названий элементов состоит более, чем из одного слова :" + countNames);

        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i) + " ");
        }

        elements.add(4, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");

        for (String elements2 : elements) {
            System.out.print(elements2 + " ");
        }

    }
}
