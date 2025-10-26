package main.java.homework.day7.inputoutputtask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2WritePhrase {
    public static void main(String[] args) {
        Task2WritePhrase task2WritePhrase = new Task2WritePhrase();
        task2WritePhrase.writeMessageToFile();
    }

    public void writeMessageToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT SMT: ");
        String incoming = scanner.nextLine();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("task2_file.txt"));
            out.write("Hello, I just got '" + incoming + "' from you!");
            out.close();
            System.out.println("Successss!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
