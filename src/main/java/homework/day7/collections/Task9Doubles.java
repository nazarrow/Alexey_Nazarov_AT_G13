package main.java.homework.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task9Doubles {
    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));
        for (Double doub : doubles) {
            System.out.print(doub + " ");
        }
        System.out.println(" ");

        double productOfAllNumbers = 1.0;
        for (Double doub : doubles) {
            productOfAllNumbers *= doub;
        }
        System.out.println("Произведение всех чисел: " + productOfAllNumbers);

        double fractionalSum = 0.0;
        for (Double doub : doubles) {
            fractionalSum += doub - Math.floor(doub);
        }
        System.out.println(fractionalSum);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }

    }
}
