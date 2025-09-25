package homework.day5.stringtask;

public class TwoDuplicateWordsStatic {
    public static void duplicateWords(String duplicates) {

        String[] words = duplicates.split(" ");

        System.out.println("Поиск дубликатов в: " + duplicates);

        for (int i = 0; i < words.length; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (words[i].equalsIgnoreCase(words[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }

    }
}
