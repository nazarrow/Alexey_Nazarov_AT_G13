package main.java.homework.day7.inputoutputtask;

import java.io.*;
import java.util.Scanner;

public class Task5ReadTextCountChar {
    public static void main(String[] args) {
        Task5ReadTextCountChar task5ReadTextCountChar = new Task5ReadTextCountChar();
        task5ReadTextCountChar.countsNumberOfCharsFromText();
    }

    public void countsNumberOfCharsFromText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        String inc = scanner.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("task5_file.txt"));
            writer.write(inc);
            writer.close();
            System.out.println("Success!!!");

            BufferedReader reader = new BufferedReader(new FileReader("task5_file.txt"));
            String line;
            int sumChars = 0;
            while ((line = reader.readLine()) != null) {
                sumChars = sumChars + line.length();
            }
            reader.close();

            System.out.println("Number of characters in file: " + sumChars);

        } catch (IOException exception) {
            System.out.println("ERRRRROR: " + exception.getMessage());
        }
    }
}
