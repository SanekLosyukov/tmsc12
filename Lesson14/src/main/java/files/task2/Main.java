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
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(INPUT_FILE);
            StringBuilder stringBuilder = new StringBuilder();
            int value;
            while ((value = inputStream.read()) != -1) {
                stringBuilder.append((char) value);
            }
            String string = stringBuilder.toString();
            outputStream = new FileOutputStream(OUTPUT_FILE, true);
            outputStream.write(textFormatter
                    .numberOfWordsInString(string)
                    .getBytes(StandardCharsets.UTF_8));

            boolean b = textFormatter.searchPalindrome(string);
            if (b) {
                outputStream.write(" true ".getBytes(StandardCharsets.UTF_8));
            } else {
                outputStream.write(" false ".getBytes(StandardCharsets.UTF_8));
            }

        } catch (IOException exception) {
            System.out.println("Ошибка" + exception);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException exception) {
                System.out.println("Ошибка" + exception);
            }
        }
    }
}

