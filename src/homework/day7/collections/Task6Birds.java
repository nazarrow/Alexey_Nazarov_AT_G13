package homework.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6Birds {
    public static void main(String[] args) {

        List<String> birds = new ArrayList<>(Arrays.asList("Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля"));
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        int count = 0;
        for (String bird : birds) {
            int vowelCount = 0;
            for (char c : bird.toCharArray()) {
                if (vowels.indexOf(c) >= 0) {
                    vowelCount++;
                }
            }
            if (vowelCount > 1) {
                count++;
            }
        }
        System.out.println("Количество птиц с более чем 1 гласной: " + count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        try {
            birds.set(2, "Синица");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: неверный индекс для замены элемента! " + e.getMessage());
        }
        // пытаемся обратиться к индексу 2, но у списка длина 1, т.е. только индексы 0 и 1
        // метод set не добавляет новый элемент, а заменяет сущ-ий по указанному индексу

        for (String bird : birds) {
            System.out.print(bird + " ");
        }

    }
}
