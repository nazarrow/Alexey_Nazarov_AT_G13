package main.java.classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrLinkList {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        for (int i = 0; i < 100_000; i++) {
            myList1.add("mama" + i);
        }

        for (int i = 0; i < 100_000; i++) {
            myList2.add("mama 22" + i);
        }

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < myList1.size(); i++) {
            myList1.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < myList2.size(); i++) {
            myList2.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);
    }
}
