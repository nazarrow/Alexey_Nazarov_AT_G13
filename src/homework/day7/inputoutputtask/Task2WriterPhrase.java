package homework.day7.inputoutputtask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2WriterPhrase {
    public static void main(String[] args) throws IOException {
        Task2WriterPhrase task2WriterPhrase = new Task2WriterPhrase();
        task2WriterPhrase.writeMessageToFile();
    }

    public void writeMessageToFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT SMT: ");
        String incoming = scanner.nextLine();

        BufferedWriter out = new BufferedWriter(new FileWriter("task2_file.txt"));
        out.write("Hello, I just got '" + incoming + "' from you!");
        out.close();
    }
}
