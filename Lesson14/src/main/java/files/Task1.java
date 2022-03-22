package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static final String INPUT_FILE = "Lesson14/src/main/resources/input.txt";
    public static final String OUTPUT_FILE = "Lesson14/src/main/resources/output.txt";

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(INPUT_FILE);
            StringBuilder stringBuilder = new StringBuilder();
            int value;
            while ((value = inputStream.read()) != -1) {    //read() считывание в value пока поток не прекратится и read() не станет -1
                stringBuilder.append((char) value);         // всё из файла сложил в stringBuilder
            }
            String[] strings = stringBuilder.toString().split("\\s");  // Весь текст разбил пробелом на слова, сложил в массив
            for (String string : strings) {    // бежим по массиву
                String reverseString = String.valueOf(new StringBuilder(string).reverse()); // реверсируем все слова из массива
                if (reverseString.equals(string)) { //ищем совпадение (полиндром)
                    System.out.println("Найден полиндром " + reverseString);
                    outputStream = new FileOutputStream(OUTPUT_FILE, true);
                    outputStream.write(reverseString.getBytes(StandardCharsets.UTF_8));
                }
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
