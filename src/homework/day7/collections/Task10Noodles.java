package homework.day7.collections;

import java.util.ArrayList;
import java.util.List;

public class Task10Noodles {
    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String nood : noodles) {
            System.out.print(nood + "-");
        }

        for (int i = 0; i < noodles.size(); i++) {
            String cnangeLetters = noodles.get(i).replace('a', 'o');
            noodles.set(i, cnangeLetters);
        }
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }

    }
}
