package homework.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13Water {
    public static void main(String[] args) {

        List<Water> water = new ArrayList<>(Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"))
        );

        for (Water w : water) {
            System.out.println("цвет: " + w.getColor() + " – запах: " + w.getSmell());
        }

    }
}
