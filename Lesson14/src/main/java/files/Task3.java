package files;

import files.task2.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task3 {
    public static final String RESOURCE_DIR = "Lesson14/src/main/resources/";
    public static final String INPUT_FILE = RESOURCE_DIR + "input3.txt";
    public static final String BLACKLIST = RESOURCE_DIR + "blacklist.txt";
    public static final String OUTPUT_FILE = RESOURCE_DIR + "output3.txt";

    private static final String BLACKLIST_SEPARATOR = "[,\\s]+";
    private static final String TEXT = "Lesson14/src/main/java/homework/result3/text.txt";

    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of(TEXT));
        String[] blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);

        if (!TextFormatter.hasBlacklistWordInString(text, blacklist)) {
            System.out.println("В тексте не встечаются слова из чёрного списка.");
            return;
        } else {
            System.out.println("В тексте обнаружены слова из чёрного списка." +
                    "\nПредложения, подлежащие исправлению:");
        }
        List<String> sentences = TextFormatter.getSentencesFromText(text);
        int sentencesWithBLWords = 0;
        for (String sentence : sentences) {
            if (TextFormatter.hasBlacklistWordInString(sentence, blacklist)) {
                System.out.println(sentence);
                sentencesWithBLWords++;
            }
        }
        System.out.println("Всего предложений, подлежащих исправлению: " + sentencesWithBLWords);
    }
}