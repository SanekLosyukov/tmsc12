package files.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String INPUT_FILE = "Lesson14/src/main/resources/input2.txt";
    public static final String OUTPUT_FILE = "Lesson14/src/main/resources/output2.txt";

    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatter();
        try (FileInputStream inputStream = new FileInputStream(INPUT_FILE);
             FileOutputStream outputStream = new FileOutputStream(OUTPUT_FILE, false)) {
            StringBuilder stringBuilder = new StringBuilder();
            int value;
            while ((value = inputStream.read()) != -1) {
                stringBuilder.append((char) value);
            }
            String string = stringBuilder.toString();
            outputStream.write(textFormatter
                    .wordsInString(string)
                    .getBytes(StandardCharsets.UTF_8));
            boolean search = textFormatter.searchPalindrome(string);
            if (search) {
                outputStream.write(" true ".getBytes(StandardCharsets.UTF_8));
            } else {
                outputStream.write(" false ".getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException exception) {
            System.out.println("Unexpected error" + exception);
        }
    }
}

