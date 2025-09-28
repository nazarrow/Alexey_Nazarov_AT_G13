package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class MyArrList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        String[] words = "мама мыла раму мыла".split(" ");

        for (String word : words) {
            myList.add(word);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println(" ");

        for (String wordList : myList) {
            System.out.println(wordList);
        }

    }
}
