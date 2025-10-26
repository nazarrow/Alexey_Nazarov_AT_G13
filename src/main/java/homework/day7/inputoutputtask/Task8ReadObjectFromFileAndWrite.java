package main.java.homework.day7.inputoutputtask;

import java.io.*;

public class Task8ReadObjectFromFileAndWrite implements Serializable {
    public static void main(String[] args) {
        Task8ReadObjectFromFileAndWrite task8ReadObjectFromFileAndWrite = new Task8ReadObjectFromFileAndWrite();
        task8ReadObjectFromFileAndWrite.readObjFromFileAndWriteResultToAnotherFile();
    }
    
    public void readObjFromFileAndWriteResultToAnotherFile() {
        try {
            FileInputStream fis = new FileInputStream("task7.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            String objFromFile = ois.readObject().toString();
            BufferedWriter writer = new BufferedWriter(new FileWriter("task8.txt"));
            writer.write(objFromFile);
            writer.close();
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println("ERROR: " + exception.getMessage());
        }
    }
}
