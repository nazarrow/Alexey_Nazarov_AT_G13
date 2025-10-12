package homework.day10;

import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {

//        Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//    (через Stream.of())
//        Для каждого элемента стрима пробежаться по отдельным словам и если слово нечетное, то заменить в нем все буквы "e"
//        на букву "o", а если четное, то заменить слово на число количества буков в этом слове
//        Оставить в потоке только уникальные значения
//        Отпечатать в консоль с новой строки

        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elements.flatMap(elem -> Stream.of(elem.split("\\s+")))
                .map(word -> {
                    if (word.length() % 2 != 0) {
                        return word.replace('e', 'o');
                    } else {
                        return word.length();
                    }
                })
                .distinct()
                .forEach(System.out::println);

    }
}
