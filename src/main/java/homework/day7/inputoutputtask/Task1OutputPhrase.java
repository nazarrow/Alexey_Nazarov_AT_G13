package main.java.homework.day7.inputoutputtask;

import java.util.Scanner;

public class Task1OutputPhrase {
    public static void main(String[] args) {
        Task1OutputPhrase task1OutputPhrase = new Task1OutputPhrase();
        task1OutputPhrase.printWording();
    }

    public void printWording() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input smt: ");
        String incoming = scanner.nextLine();
        System.out.printf("Hello, I just got '%s' from you!", incoming);
        scanner.close();
    }
}
