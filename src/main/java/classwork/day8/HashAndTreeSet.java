package main.java.classwork.day8;

import java.util.*;
import java.util.HashSet;

public class HashAndTreeSet {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        for (int i = 0; i < 1_000_0000; i++) {
            myList1.add(" " + i);
            myList2.add(" " + i);
        }

        long t1 = System.currentTimeMillis();
        Iterator<String> iterator1 = myList1.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
        }
        System.out.println(System.currentTimeMillis() - t1);

        long t2 = System.currentTimeMillis();
        Iterator<String> iterator2 = myList2.iterator();
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        System.out.println(System.currentTimeMillis() - t2);

    }
}
