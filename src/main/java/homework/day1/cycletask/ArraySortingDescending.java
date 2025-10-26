package main.java.homework.day1.cycletask;

public class ArraySortingDescending {

    public void methASS() {
        ArraySwap arraySwap = new ArraySwap();
        arraySwap.methArraySwap();

        int[] array = arraySwap.methArraySwap();

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Отсортированный массив (по убыванию): ");
        for (int y = 0; y < array.length; y++) {
            System.out.print(array[y] + " ");
        }

    }

}
