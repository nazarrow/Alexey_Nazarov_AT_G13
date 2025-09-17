package homework.day1.cycletask;

import java.util.Random;

public class ArrayEmpty {

    public int[] methodArray() {
        int[] array = new int[7];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
            System.out.println(array[i] + "ArrayEmpty");
        }
        return array;

    }

}
