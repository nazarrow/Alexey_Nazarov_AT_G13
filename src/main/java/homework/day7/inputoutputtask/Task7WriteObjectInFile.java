package main.java.homework.day7.inputoutputtask;

import main.java.playground.essence.craft.air.Copter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Task7WriteObjectInFile implements Serializable {
    public static void main(String[] args) {
        Task7WriteObjectInFile task7WriteObjectInFile = new Task7WriteObjectInFile();
        task7WriteObjectInFile.writeObjectInFile();
    }

    public void writeObjectInFile() {

        try {
            FileOutputStream fos = new FileOutputStream("task7.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Copter());
            System.out.println("success???");
            oos.close();
        } catch (IOException exception) {
            System.out.println("ERROR: " + exception.getMessage());
        }
    }
}
