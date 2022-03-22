package files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static final String RESOURCE_DIR = "Lesson14/src/main/resources/";
    public static final String INPUT_FILE = RESOURCE_DIR + "input3.txt";
    public static final String BLACK_LIST = RESOURCE_DIR + "blacklist.txt";
    public static final String OUTPUT_FILE = RESOURCE_DIR + "output3.txt";

    public static void main(String[] args) {
        try {
            List<String> stringList = FileUtils.readLines(new File(INPUT_FILE), "UTF-8");
            List<String> stringBlackList = FileUtils.readLines(new File(BLACK_LIST), "UTF-8");
            System.out.println(stringBlackList);
            System.out.println(Arrays.toString(stringList.toString().toLowerCase().split("\\.")));

            Pattern pattern = Pattern.compile(stringBlackList.toString());
            Matcher matcher = pattern.matcher(stringList.toString());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
//            String replaceSymbols = stringList.toString()
//                    .replaceAll("\\[", "")
//                    .replaceAll("\\]", "");
//            String[] string = replaceSymbols.split("\\.");   // сложил в массив предложения по отдельности
//            String[] words = replaceSymbols.
//                    replaceAll("\\.", "")
//                    .split("\\s");                           // массив слов
//            String[] stringBlack = stringBlackList.toString()
//                    .replaceAll("\\[", "")
//                    .replaceAll(",", "")
//                    .replaceAll("\\]", "")
//                    .split("\\s");                          // массив слов из блэклиста
//            System.out.println(Arrays.toString(string));
//            System.out.println(Arrays.toString(words));
//            System.out.println(Arrays.toString(stringBlack));

//            for (int i = 0; i < words.length; i++) {
//                if (words[i].equalsIgnoreCase(stringBlack.toString())) {
//                    System.out.println("В тексте есть слова из blacklist");
//                } else {
//                    System.out.println("В тексте нет слов из blacklist");
//                    break;
//                }
//            }
        } catch (IOException exception) {
            System.out.println("Unexpected error" + exception);
        }
    }
}