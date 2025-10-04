package classwork.day8;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> mySet = new java.util.HashSet<>();
        mySet.add("мама");
        mySet.add("мыла");
        mySet.add("раму");
        mySet.add("мыла");

        for (String slovo : mySet) {
            System.out.println(slovo);
        }

        System.out.println(" - - ");

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
