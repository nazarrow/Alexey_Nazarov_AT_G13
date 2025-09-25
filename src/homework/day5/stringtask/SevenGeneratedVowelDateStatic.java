package homework.day5.stringtask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SevenGeneratedVowelDateStatic {

    public static void printVowelDate(String text) {

        char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        char[] chars = text.toLowerCase().toCharArray();
        for (char c : chars) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    count++;
                    break;
                }
            }
        }

        LocalDate date = LocalDate.now().plusDays(count);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM", new Locale("ru"));

        System.out.println("Сгенерированная гласная дата: " + date.format(formatter));
    }

}