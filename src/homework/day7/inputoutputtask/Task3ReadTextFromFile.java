package homework.day7.inputoutputtask;

import java.io.*;
import java.util.Scanner;

public class Task3ReadTextFromFile {
    public static void main(String[] args) {
        Task3ReadTextFromFile task3ReadTextFromFile = new Task3ReadTextFromFile();
        task3ReadTextFromFile.removeVowelsFromFile();
    }

    public void removeVowelsFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("task2_file.txt"));
            String line = reader.readLine();
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("task2_file.txt"));
            String modLine = line.replaceAll("[аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU]", "");
            writer.write(modLine);
            System.out.println("Vowels removed");
            writer.close();

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
