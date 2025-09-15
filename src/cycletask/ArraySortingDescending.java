package cycletask;

import java.util.Arrays;

public class ArraySortingDescending {

//    отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в
//    консоль

    public int[] methASS() {
        ArraySwap arraySwap = new ArraySwap();
        arraySwap.methArraySwap();

        // Сначала сортируем по возрастанию
        Arrays.sort(arraySwap.methArraySwap());
        int[] array = arraySwap.methArraySwap();
        // Разворачиваем массив вручную
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Вывод результата
        System.out.println("Отсортированный массив (по убыванию): " + Arrays.toString(array));
        return array;
    }

}
