package main.java.homework.day10;

import java.util.Arrays;
import java.util.List;

public class BirdsRunner {
    public static void main(String[] args) {

//        Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//        Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//        Собрать все слова в одну строку в ниждем регистре
//        Убрать все символы мягкого знака
//        Разбить на новые строки по букве "б"
//        Отпечатать в консоль с новой строки в виде --Чайка--

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        birds.stream()
                .map(bi -> bi.replace('о', 'а').toLowerCase().replace("ь", ""))
                .flatMap(bi -> Arrays.stream(bi.split("б")))
                .forEach(words -> System.out.println("--" + words + "--"));

    }
}
