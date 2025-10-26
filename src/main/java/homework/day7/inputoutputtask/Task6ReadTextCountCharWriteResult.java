package main.java.homework.day7.inputoutputtask;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6ReadTextCountCharWriteResult {
    public static void main(String[] args) {
        Task6ReadTextCountCharWriteResult task6ReadTextCountCharWriteResult = new Task6ReadTextCountCharWriteResult();
        task6ReadTextCountCharWriteResult.readTextCountCharWriteResult();
    }

    public void readTextCountCharWriteResult() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("task5_file.txt"));
            String line;
            int sumChars = 0;
            while ((line = reader.readLine()) != null) {
                sumChars += line.length();
            }
            reader.close();

            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
            String formattedFile = currentDateTime.format(formatter) + "_" + sumChars + ".txt";
            System.out.println("The time is now: " + formattedFile);

            BufferedWriter writer = new BufferedWriter(new FileWriter(formattedFile));
            writer.write(sumChars);
            System.out.println("Write");
            writer.close();

        } catch (IOException exception) {
            System.out.println("ERRRRROR: " + exception.getMessage());
        }
    }

}
