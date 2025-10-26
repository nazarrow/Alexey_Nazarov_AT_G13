package main.java.homework.day5.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FiveCurrentDateTimeStatic {
    public static void curDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy, H часа m минута", new Locale("ru", "RU"));
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Сейчас на дворе: " + formattedDateTime);
    }
}
