package main.java.homework.day5.stringtask;

import java.util.Arrays;

public class ThreeFindAllDigitsStatic {
    public static void findAllDigits(String text) {
        String num = text.replaceAll("\\D+", "");
        char[] arr = num.toCharArray();
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(text.replaceAll("\\D+", "").toCharArray()));
    }
}
