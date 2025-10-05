package homework.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task11Bubbles {
    public static void main(String[] args) {

        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "Co")));
        for (Bubble bubb : bubbles) {
            System.out.print(bubb.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bubb : bubbles) {
            System.out.print(bubb.getName() + " ");
        }
        System.out.println();

        int totalVolume = 0;
        for (Bubble bubb : bubbles) {
            totalVolume += bubb.getVolume();
        }
        System.out.println(totalVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i));

        }

    }
}
