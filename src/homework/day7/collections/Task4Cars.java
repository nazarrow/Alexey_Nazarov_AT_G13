package homework.day7.collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4Cars {
    public static void main(String[] args) {

//        Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)
//        Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
//        Найти и удалить из набора авто, в названии которых больше 4 букв
//        Проитерировать список через for-each и отпечатать слова в консоль через пробел

        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("cars.txt"));

            for (String car : cars) {
                writer.write("\"" + car + "\"" + System.lineSeparator());
            }
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Error :" + e.getMessage());
        }


    }
}
