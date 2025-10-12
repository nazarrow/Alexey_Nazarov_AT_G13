package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {

//        Создать пустой список стрингов butterflies (через new ArrayList)
//        Добавить в список 4 бабочки (Common blue, Swallowtail, Aglais io, Common blue)
//        Добавить к каждому элементу кавычки
//        Оставить только те слова, которые содержат букву "a" и букву "о"
//        Вывести слова в консоль с новой строки

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        butterflies.stream().map(b -> "\"" + b + "\"")
                .filter(b -> b.contains("a") && b.contains("o"))
                .forEach(System.out::println);

    }
}
