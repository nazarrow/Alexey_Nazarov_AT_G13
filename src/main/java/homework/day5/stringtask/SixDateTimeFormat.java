package main.java.homework.day5.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SixDateTimeFormat {

    public void formatDateTime(String inputDate) {

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime localDateTime = LocalDateTime.parse(inputDate, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);

        System.out.println(localDateTime.format(outputFormatter));
    }

}
