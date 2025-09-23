package homework.day4;

import java.util.Arrays;

public class ArraysRunner {
    public static void main(String[] args) {
        ArraysAndConsole arraysAndConsole = new ArraysAndConsole();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(arraysAndConsole.countSum(numbers, 4));

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arraysAndConsole.arrLargerN(numbers1, 5)));

        int[] numbers3 = {2, 4, 5, 6, 10, 15};
        System.out.println(arraysAndConsole.sumArrElements(numbers3));

        System.out.println(arraysAndConsole.draw());
    }

}
