package files.task2;

import java.util.Arrays;

import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

public class TextFormatter {
    public String numberOfWordsInString(String string) {
        String[] s1 = string.split("\\."); // разбил текст на предложения сплитом через точку
        for (String strings : s1) {
            String[] s2 = strings.split("\\s");
            if (s2.length >= 3 && s2.length <= 5) {
                return Arrays.toString(s2);
            }
        }
        return null;
    }

    public boolean searchPalindrome(String string) {
        String[] s1 = string.split("\\s"); //разбил сплитом текст на слова
        for (String strings : s1) {
            String reverseString = String.valueOf(new StringBuilder(strings).reverse()); //реверсирую все слова через СтрингБилдер и складываю их в reverseString
            if (reverseString.equals(strings) && isNotEmpty(reverseString) && !(strings.length() == 1)) { // проверяю на эквивалентность, пустоту и чтобы это не была одна буква
                return true;
            }
        }
        return false;
    }
}

