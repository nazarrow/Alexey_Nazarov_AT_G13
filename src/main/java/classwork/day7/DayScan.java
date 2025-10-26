package main.java.classwork.day7;

import java.util.Scanner;

public class DayScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("STOP")) {
                break;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }

    }
}
