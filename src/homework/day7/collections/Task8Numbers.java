package homework.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task8Numbers {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));
        for (int number : numbers) {
            System.out.println(number);
        }

        int sum = 0;
        for (int numb : numbers) {
            sum += numb;
        }
        System.out.println("\nСумма всех чисел: " + sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println(" ");

        Collections.reverse(numbers);

        for (int numb : numbers) {
            System.out.print(numb + " ");
        }

    }
}
