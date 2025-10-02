package homework.day7.inputoutputtask;

import java.io.*;

public class Task4ReadTextRemoveConsonants {
    public static void main(String[] args) {
        Task4ReadTextRemoveConsonants task4ReadTextRemoveConsonants = new Task4ReadTextRemoveConsonants();
        task4ReadTextRemoveConsonants.removeConsonantsFromFile();
    }

    public void removeConsonantsFromFile() {
        try {

            BufferedReader reader = new BufferedReader(new FileReader("task2_file.txt"));
            String line = reader.readLine();
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("task2_file.txt"));
            String modLine = line.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZбвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ]", "");
            writer.newLine();
            writer.newLine();
            writer.write(modLine);
            System.out.println("Consonants removed");
            writer.close();

        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }
}
