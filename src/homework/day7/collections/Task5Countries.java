package homework.day7.collections;

import java.util.ArrayList;
import java.util.List;

public class Task5Countries {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String country : countries) {
            System.out.print(country + ", ");
        }

        int count = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                count++;
            }
        }
        System.out.println("Количество стран с названием < 7 букв: " + count);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

    }
}
